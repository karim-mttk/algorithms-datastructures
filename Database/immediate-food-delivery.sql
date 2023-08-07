ELECT ROUND(((imm / total_orders) * 100),2) AS immediate_percentage
FROM (
    SELECT COUNT(order_date) AS total_orders,
           SUM(CASE WHEN order_date = customer_pref_delivery_date THEN 1 ELSE 0 END) AS imm
    FROM Delivery
) AS subquery;
