-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.NAME
FROM ANIMAL_OUTS a
LEFT JOIN ANIMAL_INS b
on a.ANIMAL_ID = b.ANIMAL_ID
where b.DATETIME is null
ORDER BY a.ANIMAL_ID
