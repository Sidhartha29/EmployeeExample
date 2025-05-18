# EmployeeExample

#✅ Project Overview: Employee Management System</br>
A full-stack application built using:</br>
Backend: Spring Boot (port 8085)</br>
Frontend: React + TypeScript + Vite (port 5175)</br>

#🔁 Backend (Spring Boot)
🌐 REST API Endpoints (/api/employees)
GET /api/employees – Get all employees
POST /api/employees – Create a new employee
GET /api/employees/{id} – Get employee by ID
PUT /api/employees/{id} – Update employee
DELETE /api/employees/{id} – Delete employee

#✅ Core Backend Files
EmployeeController.java: Defines the REST endpoints
EmployeeService.java: Contains business logic
EmployeeRepository.java: JPA repository interface
Employee.java: Model with fields id, name, salary
ValidSalary.java + SalaryValidator.java: Custom salary validation

#⚛️ Frontend (React + TypeScript + Vite)

#✅ Folder Structure
pgsql
Copy
Edit
src/
├── api/
│   └── api.ts               // Axios API methods
├── components/
│   ├── EmployeeForm.tsx     // Form to create/update employee
│   ├── EmployeesTable.tsx   // Table to display employee list
│   ├── SalaryForm.tsx       // Optional: Custom salary input
│   └── EmployeePanel.tsx    // Optional: Wrapper component
├── types/
│   └── models.ts            // Employee TypeScript interface


