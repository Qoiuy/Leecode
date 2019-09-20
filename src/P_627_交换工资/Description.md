SQL
交换 一个sql
那就是找一个固定公式呗
我的想法是 将值变为 m + f =x 更新 f = x - f ，m = x - m



--  gg  SELECT 'm','f','m' + 'f', 'm' - 'f'
-- 替换呗
-- SELECT 'm','f','m' + 'f',REPLACE('mf','f',''), REPLACE('mf','m','')

UPDATE salary set sex = REPLACE('mf',sex,'')
-- SELECT * from salary; 