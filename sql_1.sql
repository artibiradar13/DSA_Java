Select * from employee;
select emp_fullname, salary,
		(salary*12) AS Annual_salary
	FROM employee;
CREATE TABLE products (
    id SERIAL PRIMARY KEY,                      -- Auto-incrementing product ID
    name VARCHAR(100) NOT NULL,                 -- Product name
    category VARCHAR(50),                       -- Product category
    price NUMERIC(10, 2) NOT NULL,              -- Product price (2 decimal places)
    quantity INT DEFAULT 0,                     -- Product quantity (default 0)
    added_date DATE DEFAULT CURRENT_DATE,       -- Date when product was added
    discount_rate NUMERIC(5, 2) DEFAULT 0.00    -- Discount rate in percentage (e.g., 10.50%)
);
-- 10 sample products
INSERT INTO products (name, category, price, quantity, added_date, discount_rate) VALUES
('Smartphone', 'Electronics', 599.99, 50, '2025-07-01', 10.00),
('Laptop', 'Electronics', 999.99, 30, '2025-07-02', 15.00),
('Headphones', 'Accessories', 199.99, 75, '2025-07-03', 5.50),
('Washing Machine', 'Home Appliances', 799.50, 20, '2025-07-01', 12.00),
('Microwave Oven', 'Home Appliances', 250.00, 15, '2025-07-04', 8.00),
('Refrigerator', 'Home Appliances', 1200.00, 10, '2025-07-02', 18.00),
('Office Chair', 'Furniture', 150.75, 40, '2025-07-03', 7.25),
('Desk Lamp', 'Furniture', 45.99, 60, '2025-07-05', 3.00),
('Notebook', 'Stationery', 5.99, 200, '2025-07-05', 0.00),
('Ball Pen', 'Stationery', 1.25, 500, '2025-07-05', 2.50);

select quantity from products;
--TOtal Quantity availabele 
select AVG(price) FROM products;
SELECT DISTINCT(category) From products;

--join Product add category with hypher 
select CONCAT(name,'-',category) from products;

--substring
select substring(name,1,4) from products;
--length
select name,LENGTH(name) from products;

--replace
select replace(name,'phone','device')from products;

--now
select now();--current_time
select current_date,added_date,(current_date-added_date) from products;
--extract
select name, EXTRACT(YEAR from added_date) from products;
select age(current_date,hire_date) from employee;


--case(conditional functions)
select name,category,
	CASE WHEN category LIKE 'Electronics%' THen 'Electronic ITEM'
	 WHEN category LIKE 'Furniture%' THen 'furniture ITEM'
	ELSE 'ACCessory item'
END AS QUantaty_category FROM products;

---window function
select name,category,price,DENSE_RANK() OVER(PARTition BY category ORder BY  price ASC) AS SUM_PRICES FROM products;

