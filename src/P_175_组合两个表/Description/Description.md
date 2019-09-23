题目要求。
连表显示是关键点 1。

select p.FirstName, p.LastName, a.City, a.State from Person as p, Address as a where a.PersonId = p.PersonId;
无论 person 是否有地址信息 。
什么是无论 左连接

去网上查一下语法使用
select p.FirstName, p.LastName, a.City, a.State from Person as p LEFT JOIN Address as a on a.PersonId = p.PersonId;

AC
