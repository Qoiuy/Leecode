# 思路及结题步骤

###### Big Countries　youdao.fanyi 结果　　大国

给了一张sql表

country是在一个范围之内的

写一条sql语句输出大国的名字

eg.

⊙﹏⊙ｂ汗 sql题.

###### 确定条件。
area大于300W　->3000000　　
或者
population大于2500W ->25000000

###### 猜测考察点
sql的效率处理

###### 第一个入脑子的想法
肯定不会是and就能解决的。

###### 扩展　无论如何也要知道的。
###1 用什么来查看sql执行情况，explain
type：这列最重要，显示了连接使用了哪种类别,有无使用索引，是使用Explain命令分析性能瓶颈的关键项之一。

结果值从好到坏依次是：
system > const > eq_ref > ref > fulltext > ref_or_null > index_merge > unique_subquery > index_subquery > range > index > ALL
一般来说，得保证查询至少达到range级别，最好能达到ref，否则就可能会出现性能问题

### mysql or的底层处理机制
尽量避免在 where 子句中使用 or 来连接条件，否则将导致引擎放弃使用索引而进行全表扫描
如：
select id from t where num=10 or num=20
可以这样查询：

select id from t where num=10
union all
select id from t where num=20


###### test1
写一个简单的sql实验一下
select name, population, area from World where population > 25000000 or area > 3000000; 92 ms 3115ms

###### Accepted什么鬼

###### 最快的1800ms左右。最慢的5500ms+ 我这个3115ms.

###### 不爽
网上搜了下　explain发现自己看不出来什么。感觉自己的思路不对。
两个方向
1　google　mysql or优化

###### 答案２
select name, population, area from World where population > 25000000 union all select name, population, area from World where area > 3000000  ;  结果　134 ms 2 / 4 test cases passed.
错误原因：
union在进行表链接后会筛选掉重复的记录，所以在表链接后会对所产生的结果集进行排序运算，删除重复的记录再返回结果。
 而union all只是简单的将两个结果合并后就返回。这样，如果返回的两个结果集中有重复的数据，那么返回的结果集就会包含重复的数据了。 
 从效率上说，union all要比union快很多，所以，如果可以确认合并的两个结果集中不包含重复的数据的话，那么就使用union all，如下： 
 白话：union all不去重。导致结果重复。
 select name, population, area from World where population > 25000000 union select name, population, area from World where area > 3000000  ;  94 ms 3217 ms-->更慢了ri
 
 
2　看leecode讨论帖　
没看见好的帖子～可能是题目刚创建不久的原因吧。
https://discuss.leetcode.com/topic/102310/dear-admin-i-want-to-know-how-to-deal-with-this-problem-that-solutions-runtime-less-than-2000ms 希望有人回复吧。

###### 总结比较　使用explain
explain select name, population, area from World where population > 25000000 or area > 3000000; 
explain select name, population, area from World where population > 25000000 union select name, population, area from World where area > 3000000  ;  
explain select name, population, area from World where population > 25000000 union all select name, population, area from World where area > 3000000  ; 

###### 个人猜测　这道题是为了告诉我们or 和 union区别
or 不使用索引直接查询表
效率差别
索引　
使用　or < union 
不使用 or > union 

###### 有人回复
You could try parallel hint if you are using Oracle Database.

select /*+ PARALLEL (World , 4) */ name, population, area from World where population > 25000000 or area > 3000000; 没解决～
###### /*+parallel(t,4)*/
hints是oracle提供的一种机制，用来告诉优化器按照我们的告诉它的方式生成执行计划。我们可以用hints来实现：  
select /*+ USE_CONCAT*/ name, population, area from World where population > 25000000 or area > 3000000;

具体实现，发现并没有说的那样