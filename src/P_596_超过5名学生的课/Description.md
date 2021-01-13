
sql

select class from courses where count(*) group by class,student


#1 参考https://segmentfault.com/a/1190000006821331
里面描述的group by 多个字段实现

然后通过having过滤？
似乎无法实现
select count(class) from courses GROUP BY class,student ;

#2 select 结果作为中间表
```
SELECT
	a.class AS class
FROM
	(
	SELECT
		student,
		class
	FROM
		courses
	GROUP BY
		class,
		student
	) AS a
GROUP BY
	class
HAVING
	count( * ) >= 5;
```