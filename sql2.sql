CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL
);
INSERT INTO departments (department_id, department_name) VALUES
(101, 'Human Resources'),
(102, 'Finance'),
(103, 'Engineering'),
(104, 'Marketing');

select * from departments;

CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    employee_name VARCHAR(100) NOT NULL,
    department_id INT,
	FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

INSERT INTO employees (employee_name, department_id) VALUES
('Alice', 101),
('Bob', 102),
('Charlie', 103),
('David', 103),
('Eve', 104),
('Frank', NULL);  -- No department assigned (for JOIN practice)


---inner join
SELECT
	E.EMPLOYEE_ID,
	E.EMPLOYEE_NAME,
	D.DEPARTMENT_ID,
	D.DEPARTMENT_NAME
FROM
	EMPLOYEES E
	FULL JOIN  departments d ON E.DEPARTMENT_ID = d.department_id;

SELECT e.employee_name, d.department_name
FROM employees e
CROSS JOIN departments d;


	