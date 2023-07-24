SELECT C.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H
ON C.CAR_ID = H.CAR_ID 
WHERE C.CAR_TYPE = '세단' AND TO_CHAR(H.START_DATE, 'YYMM') = '2210'
GROUP BY C.CAR_ID
ORDER BY C.CAR_ID DESC;