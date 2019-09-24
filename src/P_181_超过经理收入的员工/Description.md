 单表连接查询 查询有经理管理的员工，left join。然后比较
 使用navicat
 搜索单表left join

 select * from t_user t1  left join (select * from t_user) t2 on t1.id=1 and t2.id=2


 题目sql有问题。 ManagerId是init类型 第三行和第四行数据插入的确实none 无法插入，改为0


 select e1.NAME from Employee e1 RIGHT JOIN ( select * from Employee ) e2 on e1.ManagerId = e2.id WHERE e1.salary > e2.salary;