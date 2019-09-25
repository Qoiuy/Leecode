连表查询

not in

SELECT Customers.name as Customers from Customers WHERE id not in (SELECT CustomerId from Orders);

naticat 调试 一次ac