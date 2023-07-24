-- 코드를 입력하세요
SELECT a.flavor FROM FIRST_HALF a
inner join ICECREAM_INFO b
on a.FLAVOR = b.FLAVOR
WHERE ingredient_type = 'fruit_based'
    and a.total_order >= 3000