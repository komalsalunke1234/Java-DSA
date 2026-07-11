# Write your MySQL query statement below
select u.name,  SUM(t.amount) AS balance
from Users u
JOIN Transactions t
ON u.account = t.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;