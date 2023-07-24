-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, TO_CHAR(OUT_DATE,'YYYY-MM-DD') as OUT_DATE1,
    case
        when TO_CHAR(OUT_DATE,'YYYY-MM-DD') <= '2022-05-01' then '출고완료'
        when TO_CHAR(OUT_DATE,'YYYY-MM-DD') > '2022-05-01' then '출고대기'
        else '출고미정'
    end as 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID