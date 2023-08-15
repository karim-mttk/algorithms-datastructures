SELECT
    CONCAT(name,
           CASE
               WHEN Occupation = 'Doctor' THEN '(D)'
               WHEN Occupation = 'Actor' THEN '(A)'
               WHEN Occupation = 'Professor' THEN '(P)'
               ELSE '(S)'
           END) AS result
FROM OCCUPATIONS;