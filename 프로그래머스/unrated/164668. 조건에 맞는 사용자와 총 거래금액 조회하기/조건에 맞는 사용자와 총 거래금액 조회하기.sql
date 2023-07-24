-- 코드를 입력하세요
SELECT a.WRITER_ID, b.NICKNAME, SUM(a.PRICE) as TOTAL_SALES
FROM USED_GOODS_BOARD a
inner join USED_GOODS_USER b
on a.WRITER_ID = b.USER_ID
where a.STATUS = 'DONE'
GROUP BY a.WRITER_ID, b.NICKNAME
HAVING SUM(a.PRICE) >= 700000
ORDER BY SUM(a.PRICE)
