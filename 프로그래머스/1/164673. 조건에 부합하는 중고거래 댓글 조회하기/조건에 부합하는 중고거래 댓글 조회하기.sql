SELECT A.TITLE, 
        A.BOARD_ID, 
        B.REPLY_ID, 
        B.WRITER_ID, 
        B.CONTENTS, 
        DATE_FORMAT(B.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
        
FROM USED_GOODS_BOARD A
    INNER JOIN USED_GOODS_REPLY B
    ON A.BOARD_ID=B.BOARD_ID
    
WHERE SUBSTRING(A.CREATED_DATE, 1,7) = '2022-10'

ORDER BY B.CREATED_DATE, A.TITLE