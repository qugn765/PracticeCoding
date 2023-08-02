SELECT USER_ID, NICKNAME, CONCAT(CITY," ", STREET_ADDRESS1," ", STREET_ADDRESS2) as 전체주소,
CONCAT(substring(TLNO from 1 for 3),'-',substring(TLNO from 4 for 4), '-', substring(TLNO from 8 for 4)) 
as 전화번호
from USED_GOODS_USER a where (select count(*) from USED_GOODS_BOARD  where WRITER_ID = a.USER_ID) > 2
ORDER BY USER_ID desc