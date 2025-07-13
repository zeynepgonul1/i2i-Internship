-- SQLAN-EX-02 | Oracle SQL Analytic Functions Exercises

-- 1. Bir departmandaki tüm çalışanların isimleri tek kolonda
SELECT department_id, 
       LISTAGG(first_name || ' ' || last_name, ', ') 
           WITHIN GROUP (ORDER BY employee_id) AS employees
FROM HR.employees
GROUP BY department_id;

-- 2. Job ID'ye göre gruplanarak önceki ve sonraki maaş toplamı
SELECT employee_id, job_id, salary,
       NVL(LAG(salary) OVER(PARTITION BY job_id ORDER BY employee_id), 0) AS prev_salary,
       NVL(LEAD(salary) OVER(PARTITION BY job_id ORDER BY employee_id), 0) AS next_salary,
       NVL(LAG(salary) OVER(PARTITION BY job_id ORDER BY employee_id), 0) +
       NVL(LEAD(salary) OVER(PARTITION BY job_id ORDER BY employee_id), 0) AS total_adjacent_salaries
FROM HR.employees;

-- 3. Job ID'ye göre gruplanarak sonraki çalışanın telefon numarası
SELECT employee_id, job_id, phone_number,
       LEAD(phone_number) OVER(PARTITION BY job_id ORDER BY employee_id) AS next_employee_phone
FROM HR.employees;

-- 4. Maaş sıralaması ve işe giriş tarihi
SELECT employee_id, first_name, last_name, salary, hire_date,
       RANK() OVER(ORDER BY salary DESC, hire_date ASC) AS salary_rank
FROM HR.employees;

-- 5. Employee ID sıralamasıyla onarlı gruplama
SELECT employee_id, first_name, last_name,
       NTILE(10) OVER(ORDER BY employee_id) AS group_number
FROM HR.employees;

-- 6. Departman bazlı ortalama maaş altı/üstü işaretleme
SELECT employee_id, first_name, last_name, department_id, salary,
       CASE WHEN salary < AVG(salary) OVER(PARTITION BY department_id) THEN 0
            ELSE 1 END AS salary_vs_avg
FROM HR.employees;

-- 7. Her yılın ilk işe alınan çalışanı
SELECT *
FROM (
    SELECT employee_id, first_name, last_name, hire_date,
           EXTRACT(YEAR FROM hire_date) AS hire_year,
           ROW_NUMBER() OVER(PARTITION BY EXTRACT(YEAR FROM hire_date) ORDER BY hire_date ASC) AS rn
    FROM HR.employees
)
WHERE rn = 1;

-- 8. Departmandaki en yüksek maaşlı çalışan hariç listeleme
SELECT employee_id, first_name, last_name, department_id, salary
FROM HR.employees e
WHERE salary < (
    SELECT MAX(salary)
    FROM HR.employees
    WHERE department_id = e.department_id
);

-- 9. Departmandaki en yüksek maaşı alan ilk 2 çalışan
SELECT *
FROM (
    SELECT employee_id, first_name, last_name, department_id, salary,
           DENSE_RANK() OVER(PARTITION BY department_id ORDER BY salary DESC) AS salary_rank
    FROM HR.employees
)
WHERE salary_rank <= 2;

-- 10. Departmanda önce/sonra işe başlayan çalışanların isimleri
SELECT employee_id, first_name, last_name, department_id, hire_date,
       LAG(first_name || ' ' || last_name) OVER(PARTITION BY department_id ORDER BY hire_date) AS previous_employee,
       LEAD(first_name || ' ' || last_name) OVER(PARTITION BY department_id ORDER BY hire_date) AS next_employee
FROM HR.employees;
