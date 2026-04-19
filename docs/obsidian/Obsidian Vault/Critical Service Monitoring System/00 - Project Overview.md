# Critical Service Monitoring System

## Objective
Monitor critical services/systems, record their operational status, open incidents, generate alerts, maintain history, logs, and audit trail.
## Problem It Solves
This project addresses the need for a reliable way to monitor critical systems and services, track operational health, manage incidents, and maintain a clear audit trail of what happened, when it happened, and who took action.

In many environments, service failures, degraded performance, and operational incidents are handled in a scattered way, often across spreadsheets, chats, emails, or disconnected tools. That makes it difficult to respond quickly, understand the real impact of a problem, and keep a trustworthy history of operational events.

This system solves that by centralizing:
- service and system monitoring
- health status tracking
- incident management
- alert generation and acknowledgement
- operational logging
- auditability and traceability

The goal is to provide a backend-focused platform that simulates the kind of reliability, control, and visibility expected in critical operational environments.

## Target Users
This system is intended for users involved in the operation, supervision, and auditing of critical services.

Main users:
- **Administrators**  
  Manage users, permissions, monitored systems, and operational settings.

- **Operators**  
  Monitor system health, respond to alerts, create and manage incidents, and update operational timelines.

- **Auditors**  
  Review logs, incident history, system changes, and audit records without modifying operational data.

Indirectly, the system can also support:
- technical leads
- support teams
- infrastructure teams
- service owners

## Initial Scope
-  User authentication and authorization
-  Role-based access control (Admin, Operator, Auditor)
-  User management
-  Monitored system registration and management
-  Manual health check registration
-  Current system status tracking
-  Incident creation and lifecycle management
-  Incident timeline and history
-  Alert generation and management
-  Basic operational logs
-  Basic audit trail for critical changes
-  Dashboard with operational summary
-  Filtering, pagination, and search for main modules

## Future Scope
-  Automatic health check integration
-  Scheduled monitoring jobs
-  Availability and uptime calculation
-  MTTR and operational metrics
-  Advanced reporting and export
-  Maintenance window management
-  Notification channels (email, webhook, etc.)
-  Multi-team ownership support
-  Advanced audit comparison (before/after changes)
-  Dockerized environment
-  CI/CD pipeline
-  Linux deployment
-  AWS deployment
-  API documentation and developer guide
-  Automated tests
-  Performance and scalability improvements

## Tech Stack
- **Java**  
  Java 21

- **Database**  
  PostgreSQL

- **Frameworks/Libraries**  
  - Spring Boot
  - Spring Web
  - Spring Data JPA
  - Spring Security
  - Bean Validation
  - Lombok
  - MapStruct
  - JWT authentication
## Current Status
- Current phase:
- Next step:
- Blockers:
