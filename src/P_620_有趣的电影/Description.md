sql
id 奇数  https://blog.csdn.net/zhazhagu/article/details/80452473 牛b
not in  
select id, movie, description, rating from cinema where id / 2 == 1 and description is "boring"

需要调试

select id, movie, description, rating from cinema where id&1 and description != "boring";
select id, movie, description, rating from cinema where id&1 and description != "boring" ORDER BY rating desc;