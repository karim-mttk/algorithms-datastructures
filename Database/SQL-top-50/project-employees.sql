SELECT p.project_id, ROUND(sum(e.experience_years)/COUNT(e.employee_id),2) as average_years
FROM Project as p
LEFT JOIN Employee as e
ON p.employee_id = e.employee_id
GROUP BY p.project_id
