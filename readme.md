# Functional Requirements:

## Employee

Apply for leave by selecting a date range
View leave status (pending, approved, rejected)
View leave balance and leave history

## Manager

View all pending leave requests from their team
Approve or reject a leave request

## System

Each employee gets 12 leaves per year
Leave requests of ≤ 2 days are auto-approved; > 2 days require manager approval
If an employee exceeds their 12-leave quota, a pay cut is applied
Leave balance is updated on every approval

---

# Entities : 

User : id, name

Employee extends User : manager, leaveBalance(int), payCutApplied (boolean)

Manager extends User : List<Employee> 

Leave : id, employee, startDate, endDate, status

ENUM LeaveStatus : APPROVED, PENDING, DENIED

---

# API Endpoints :

POST /api/leaves

GET /api/leaves/{id}

GET /api/leaves?empId=1

GET /api/leaves?managerId=2&status=PENDING

PATCH /api/leaves/{id}/status (approve / reject)
