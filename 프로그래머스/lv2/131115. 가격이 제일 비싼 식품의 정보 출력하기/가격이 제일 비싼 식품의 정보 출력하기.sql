-- 코드를 입력하세요
select PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE 
FROM (SELECT * FROM FOOD_PRODUCT ORDER BY PRICE desc)
WHERE ROWNUM < 2