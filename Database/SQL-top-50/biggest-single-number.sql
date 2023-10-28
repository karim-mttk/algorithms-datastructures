SELECT CASE
    WHEN MAX(num) IS NULL THEN NULL
    ELSE MAX(num)
END AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS unique_numbers;