# EmployeeExample

#✅ Project Overview: Employee Management System</br>
A full-stack application built using:</br>
Backend: Spring Boot (port 8085)</br>
Frontend: React + TypeScript + Vite (port 5175)</br>

#🔁 Backend (Spring Boot)
🌐 REST API Endpoints (/api/employees)</br>
GET /api/employees – Get all employees</br>
POST /api/employees – Create a new employee</br>
GET /api/employees/{id} – Get employee by ID</br>
PUT /api/employees/{id} – Update employee</br>
DELETE /api/employees/{id} – Delete employee</br>

#✅ Core Backend Files</br>
EmployeeController.java: Defines the REST endpoints</br>
EmployeeService.java: Contains business logic</br>
EmployeeRepository.java: JPA repository interface</br>
Employee.java: Model with fields id, name, salary</br>
ValidSalary.java + SalaryValidator.java: Custom salary validation</br>

#⚛️ Frontend (React + TypeScript + Vite)</br>

#✅ Folder Structure</br>
src/</br>
├── api/</br>
│   └── api.ts               // Axios API methods</br>
├── components/</br>
│   ├── EmployeeForm.tsx     // Form to create/update employee</br>
│   ├── EmployeesTable.tsx   // Table to display employee list</br>
│   ├── SalaryForm.tsx       // Optional: Custom salary input</br>
│   └── EmployeePanel.tsx    // Optional: Wrapper component</br>
├── types/</br>
│   └── models.ts            // Employee TypeScript interface</br>
</br>


