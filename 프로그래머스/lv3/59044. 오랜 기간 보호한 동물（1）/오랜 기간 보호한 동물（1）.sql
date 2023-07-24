-- 코드를 입력하세요
SELECT a.NAME, A.DATETIME from ANIMAL_INS a
left outer join ANIMAL_OUTS b 
on a.ANIMAL_ID = b.ANIMAL_ID
where b.datetime is NULL
ORDER BY A.DATETIME asc
fetch first 3 rows only

