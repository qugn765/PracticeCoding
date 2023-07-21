-- 코드를 입력하세요
-- select count(b.a) from (SELECT count(NAME) as a from ANIMAL_INS where NAME is not null Group by NAME) b
SELECT COUNT(DISTINCT NAME) FROM ANIMAL_INS