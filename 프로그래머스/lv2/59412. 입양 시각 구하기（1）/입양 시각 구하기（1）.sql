-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(datetime, 'HH24')) as HOUR, COUNT(*) 
FROM ANIMAL_OUTS
GROUP BY TO_CHAR(datetime,'HH24')
HAVING TO_CHAR(datetime, 'HH24') > 8 and TO_CHAR(datetime, 'HH24') < 20
ORDER BY HOUR