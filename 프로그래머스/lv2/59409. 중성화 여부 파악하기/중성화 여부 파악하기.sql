-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, 
    CASE 
        WHEN sex_upon_intake = 'Neutered Male' THEN 'O'
        WHEN sex_upon_intake = 'Spayed Female' THEN 'O'
        WHEN sex_upon_intake = 'Neutered Female' THEN 'O'
        WHEN sex_upon_intake = 'Spayed Male' THEN 'O'
        ELSE 'X'
    END AS "중성화"
FROM ANIMAL_INS
ORDER BY ANIMAL_ID