# Project Requirements

## Functional Requirements

### Authentication and Access Control
- The system must allow users to authenticate with valid credentials.
- The system must deny access for inactive users.
- The system must deny access for blocked users.
- The system must support role-based access control.
-  The system must provide different permissions for Administrators, Operators, and Auditors.
-  The system must allow authenticated users to change their password.
-  The system must allow administrators to reset user passwords.

### User Management
-  The system must allow administrators to create users.
-  The system must allow administrators to update user information.
-  The system must allow administrators to activate and deactivate users.
-  The system must allow administrators to block and unblock users.
-  The system must allow administrators to assign roles to users.
-  The system must allow authorized users to list and search users.
-  The system must allow authorized users to view user details.

### Monitored Systems Management
-  The system must allow administrators and operators to register monitored systems.
-  The system must allow authorized users to update monitored system information.
-  The system must allow authorized users to activate and deactivate monitoring for a system.
-  The system must allow authorized users to place a system into maintenance mode.
-  The system must allow authorized users to end a maintenance period.
-  The system must allow authorized users to define system criticality.
-  The system must allow authorized users to assign responsible users or teams to a monitored system.
-  The system must allow authorized users to list, filter, and view monitored systems.

### Health Check Management
-  The system must allow health check records to be created manually.
-  The system must store the date and time of each health check.
-  The system must store the detected operational status for each health check.
-  The system must store response time when available.
-  The system must store a diagnostic message or technical note for a health check.
-  The system must support both manual and automatic health check origins.
-  The system must maintain health check history for each monitored system.
-  The system must update the current status of a monitored system based on the latest valid health check.
-  The system must detect state changes between consecutive health checks.

### Incident Management
-  The system must allow users to create incidents manually.
-  The system must allow the system to create incidents automatically based on monitoring conditions.
- The system must associate incidents with a monitored system.
- The system must store incident severity.
- The system must store incident status.
- The system must store incident origin.
- The system must store impact description.
- The system must allow assigning a responsible user to an incident.
- The system must allow reassigning the responsible user.
- The system must allow incident status transitions throughout its lifecycle.
- The system must allow users to register root cause information.
- The system must allow users to register solution details.
- The system must allow users to resolve incidents.
- The system must allow users to close incidents.
- The system must allow authorized users to list, filter, and view incidents.

### Incident Timeline / History
- The system must maintain a timeline of incident events.
- The system must record incident creation in the timeline.
- The system must record status changes in the timeline.
- The system must record responsible user changes in the timeline.
- The system must allow users to add comments to the timeline.
- The system must allow users to register actions taken during incident handling.
- The system must allow users to register root cause discovery events.
- The system must allow users to register solution events.
- The system must allow users to view the complete incident timeline in chronological order.

### Alert Management
- The system must generate alerts automatically from relevant monitoring conditions.
- The system must allow users to create alerts manually.
- The system must assign a type, priority, and status to each alert.
- The system must allow alerts to be linked to a monitored system.
- The system must allow alerts to be linked to an incident when applicable.
- The system must allow users to acknowledge alerts.
- The system must allow users to resolve alerts.
- The system must maintain alert history.
- The system must allow authorized users to list, filter, and view alerts.

### Operational Logs
- The system must record authentication events.
- The system must record user actions on critical modules.
- The system must record automatic operational events.
- The system must allow authorized users to search and filter logs.
- The system must support categorizing logs by type or severity.

### Audit Trail
- The system must record critical entity changes for auditing purposes.
- The system must store who performed the change.
- The system must store when the change happened.
- The system must store the operation type.
- The system must store before/after values for important changes when applicable.
- The system must allow authorized users to search and view audit records.

### Dashboard and Metrics
- The system must display a summary of monitored systems by current status.
- The system must display a summary of open incidents by severity and status.
- The system must display a summary of active alerts by priority and type.
- The system must display basic operational metrics for the environment.
- The system must support filtering dashboard data by time period when applicable.

### General System Features
- The system must support pagination for large lists.
- The system must support filtering and searching in main modules.
- The system must validate input data before processing requests.
- The system must return consistent error responses.
- The system must preserve historical data for operational traceability.

## Non-Functional Requirements

### Security
- The system must require authentication for protected resources.
- The system must enforce authorization rules based on user roles.
- The system must store passwords securely.
- The system must prevent unauthorized access to audit and operational data.
- The system must log authentication and access-related events.

### Reliability
- The system must preserve operational and historical data consistently.
- The system must prevent invalid incident and alert lifecycle transitions.
- The system must maintain traceability of critical operations.
- The system must handle unexpected errors gracefully.

### Maintainability
- The system should follow a layered architecture.
- The system should separate business logic from infrastructure concerns.
- The system should keep the codebase modular and easy to evolve.
- The system should use clear naming and consistent conventions.
- The system should be designed to support future features such as automated monitoring and cloud deployment.

### Performance
- The system should provide acceptable response times for standard CRUD and query operations.
- The system should support pagination to avoid loading excessive data at once.
- The system should handle filtering and sorting efficiently.
- The system should be designed to support future optimization of operational metrics and reports.

### Auditability and Traceability
- The system must keep historical records of critical operational actions.
- The system must support reconstruction of incident evolution over time.
- The system must preserve who changed important data and when the change happened.

### Usability
- The system should provide clear and predictable workflows for operational tasks.
- The system should provide consistent validation and error messages.
- The system should make core operational data easy to find and interpret.

### Scalability
- The system should be structured to allow future growth in the number of monitored systems, incidents, and alerts.
- The system should be designed so new modules can be added without major architectural changes.

### Portability / Deployment
- The system should be able to run in a Linux environment.
- The system should be prepared for containerization in the future.
- The system should be designed with future cloud deployment in mind.
  
## Business Rules

### User and Access Rules
- Inactive users must not be allowed to log in.
- Blocked users must not be allowed to log in.
- Only administrators can create, activate, deactivate, block, unblock, or change the role of another user.
- Auditors can view operational and audit data but cannot change operational entities.
- Operators can manage incidents, alerts, and monitored systems within their permissions.

### Monitored System Rules
- A monitored system must have a name, environment, criticality, and current status.
- A monitored system with monitoring disabled must not generate automatic alerts.
- A monitored system with monitoring disabled must not generate automatic incidents.
- A monitored system in maintenance mode must not generate automatic incidents.
- A monitored system in maintenance mode may still store health checks, depending on implementation choice.
- A critical monitored system that becomes offline should generate a high-priority or critical alert.
- Changes to monitored system criticality, monitoring status, and maintenance state must be auditable.

### Health Check Rules
- Every health check must be associated with one monitored system.
- Every health check must store a timestamp.
- Every health check must record a valid operational status.
- The latest valid health check should define the current status of the monitored system.
- A state change must be detected by comparing the latest health check with the previous known state.
- Repeated health checks with the same failure condition should not automatically generate duplicated alerts indefinitely.

### Incident Rules
- Every incident must be associated with one monitored system.
- Every incident must have a severity, status, origin, and opening timestamp.
- Critical incidents must have a responsible user assigned.
- An incident cannot be closed unless it has been resolved first.
- A resolved incident must contain solution details.
- A closed incident should not return directly to an open state.
- An automatic incident must not be created if the monitored system is in maintenance mode.
- An automatic incident must not be created if monitoring is disabled for that system.
- The system should avoid duplicate open incidents for the same monitored system and same active condition.
- Reassigning an incident must be recorded in the incident timeline.

### Incident Timeline Rules
- Every incident must record its creation in the timeline.
- Every incident status change must be recorded in the timeline.
- Every responsible user change must be recorded in the timeline.
- Comments, actions taken, root cause, and solution records must remain historically visible.
- Timeline events must be ordered chronologically.
  
### Alert Rules
- Every alert must be associated with a monitored system.
- Every alert must have a type, priority, status, and creation timestamp.
- An acknowledged alert remains active until it is explicitly resolved.
- A resolved alert must store its resolution timestamp.
- The system should avoid creating duplicate active alerts for the same monitored system and same condition.
- A high-priority or critical alert may lead to automatic incident creation, depending on the defined condition.
- Alerts may be linked to incidents, but not every alert must create an incident.

### Audit and Logging Rules
- Authentication attempts must be logged.
- Critical entity changes must be auditable.
- Automatic actions performed by the system should be traceable with a technical actor such as `SYSTEM`.
- Operational logs and audit records must be preserved for historical analysis.
- Incidents, alerts, logs, and audit records must not be physically deleted.

### Data Retention and Integrity Rules
- Historical operational data must be preserved to support traceability.
- Users and monitored systems should be deactivated instead of physically removed.
- Incident history must remain available even after resolution or closure.
- Audit records must remain immutable after creation.