-- 코드를 입력하세요
select count(*) from USER_INFO 
 WHERE TO_CHAR(JOINED,'YYYY') = '2021' and
 AGE BETWEEN 20 and 29