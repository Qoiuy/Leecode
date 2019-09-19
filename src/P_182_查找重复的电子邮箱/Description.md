select Email from Person where count(Email) > 0


错误：使用navicat 微调了一下sql
SELECT Email from Person GROUP BY Email HAVING count(Email)> 1;