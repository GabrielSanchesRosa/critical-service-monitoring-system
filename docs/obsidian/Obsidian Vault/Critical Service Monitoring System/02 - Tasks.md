# Project Tasks

## Backlog

### Project Foundation
- [ ] Define the project vision, purpose, and main operational flow
- [ ] Define the initial MVP scope
- [ ] Define the future scope
- [ ] Define the core modules of the system
- [ ] Define the user roles and access boundaries
- [ ] Define the naming conventions for statuses, severities, priorities, and event types
- [ ] Define the main operational workflows
- [ ] Define the initial folder/package organization
- [ ] Define the API design conventions
- [ ] Define the error response standard
- [ ] Define the auditability and traceability strategy

### Domain and Database Design
- [ ] Identify all core domain entities
- [ ] Define the attributes of each entity
- [ ] Define the relationships between entities
- [ ] Define which entities have lifecycle states
- [ ] Define which entities require historical records
- [ ] Define which entities should never be physically deleted
- [ ] Design the database schema
- [ ] Define primary keys and foreign keys
- [ ] Define unique constraints
- [ ] Define indexes for important queries
- [ ] Define enum values used by the system
- [ ] Define soft-delete/deactivation strategy where applicable
- [ ] Define audit record structure
- [ ] Define operational log structure
- [ ] Define incident timeline event structure
- [ ] Define maintenance tracking structure
- [ ] Define alert duplication prevention strategy
- [ ] Define incident duplication prevention strategy

### Authentication and Authorization
- [ ] Implement user authentication
- [ ] Implement login flow
- [ ] Implement logout flow
- [ ] Implement password hashing
- [ ] Implement role-based access control
- [ ] Implement protected routes/endpoints
- [ ] Implement inactive user restriction
- [ ] Implement blocked user restriction
- [ ] Implement change password feature
- [ ] Implement administrator password reset feature
- [ ] Define and implement access rules for Admin
- [ ] Define and implement access rules for Operator
- [ ] Define and implement access rules for Auditor
- [ ] Register authentication events in logs

### User Management
- [ ] Implement user creation
- [ ] Implement user update
- [ ] Implement user activation
- [ ] Implement user deactivation
- [ ] Implement user blocking
- [ ] Implement user unblocking
- [ ] Implement user role assignment
- [ ] Implement user detail retrieval
- [ ] Implement user listing
- [ ] Implement user filtering and search
- [ ] Implement validation rules for user fields
- [ ] Add auditing for user changes

### Monitored Systems Management
- [ ] Implement monitored system creation
- [ ] Implement monitored system update
- [ ] Implement monitored system detail retrieval
- [ ] Implement monitored system listing
- [ ] Implement monitored system filtering and search
- [ ] Implement monitoring activation/deactivation
- [ ] Implement maintenance mode start
- [ ] Implement maintenance mode end
- [ ] Implement responsible user/team assignment
- [ ] Implement current status persistence
- [ ] Implement criticality management
- [ ] Implement environment classification
- [ ] Implement response time threshold configuration
- [ ] Add auditing for monitored system changes

### Health Check Management
- [ ] Implement manual health check registration
- [ ] Implement automatic health check structure for future integration
- [ ] Store timestamp for every health check
- [ ] Store health check origin
- [ ] Store detected status
- [ ] Store response time
- [ ] Store technical message/diagnostic
- [ ] Implement health check history retrieval
- [ ] Implement latest health check retrieval
- [ ] Implement state change detection
- [ ] Update monitored system current status based on latest valid health check
- [ ] Define rules for health checks during maintenance mode
- [ ] Prevent inconsistent status updates
- [ ] Create logs for health check registration

### Incident Management
- [ ] Implement manual incident creation
- [ ] Implement automatic incident creation
- [ ] Associate incidents with monitored systems
- [ ] Implement incident severity
- [ ] Implement incident status lifecycle
- [ ] Implement incident origin
- [ ] Implement impact description
- [ ] Implement responsible user assignment
- [ ] Implement responsible user reassignment
- [ ] Implement incident detail retrieval
- [ ] Implement incident listing
- [ ] Implement incident filtering and search
- [ ] Implement root cause registration
- [ ] Implement solution registration
- [ ] Implement incident resolution
- [ ] Implement incident closure
- [ ] Enforce valid incident status transitions
- [ ] Enforce “resolved before closed” rule
- [ ] Enforce responsible user for critical incidents
- [ ] Prevent duplicate open incidents for the same condition
- [ ] Add auditing for incident changes

### Incident Timeline / History
- [ ] Implement incident timeline entity/model
- [ ] Register incident creation in the timeline
- [ ] Register status changes in the timeline
- [ ] Register responsible user changes in the timeline
- [ ] Implement manual comments in the timeline
- [ ] Implement action taken records in the timeline
- [ ] Implement root cause events in the timeline
- [ ] Implement solution events in the timeline
- [ ] Implement chronological timeline retrieval
- [ ] Ensure timeline records remain historically visible

### Alert Management
- [ ] Implement manual alert creation
- [ ] Implement automatic alert generation
- [ ] Associate alerts with monitored systems
- [ ] Associate alerts with incidents when applicable
- [ ] Implement alert type
- [ ] Implement alert priority
- [ ] Implement alert status lifecycle
- [ ] Implement alert acknowledgment
- [ ] Implement alert resolution
- [ ] Implement alert detail retrieval
- [ ] Implement alert listing
- [ ] Implement alert filtering and search
- [ ] Prevent duplicate active alerts for the same condition
- [ ] Define alert escalation conditions
- [ ] Define which alerts can trigger automatic incidents
- [ ] Add auditing for alert changes
- [ ] Add logs for automatic alert generation

### Operational Logs
- [ ] Implement authentication event logging
- [ ] Implement user action logging
- [ ] Implement automatic system event logging
- [ ] Implement log categories or severity levels
- [ ] Implement log detail retrieval
- [ ] Implement log listing
- [ ] Implement log filtering and search
- [ ] Define which actions must always be logged
- [ ] Define technical actor representation for automatic actions (e.g. SYSTEM)

### Audit Trail
- [ ] Implement audit record model
- [ ] Audit user changes
- [ ] Audit monitored system changes
- [ ] Audit incident changes
- [ ] Audit alert changes
- [ ] Audit maintenance state changes
- [ ] Store operation type
- [ ] Store changed field information where applicable
- [ ] Store before/after values where applicable
- [ ] Store actor and timestamp
- [ ] Implement audit record retrieval
- [ ] Implement audit filtering and search
- [ ] Restrict audit access to Admin and Auditor
- [ ] Ensure audit records are immutable

### Dashboard and Metrics
- [ ] Implement total monitored systems summary
- [ ] Implement systems-by-status summary
- [ ] Implement open incidents summary by severity
- [ ] Implement incidents summary by status
- [ ] Implement active alerts summary by priority
- [ ] Implement alerts summary by type
- [ ] Implement top failing systems metric
- [ ] Implement basic availability metrics
- [ ] Implement response time metrics
- [ ] Implement time-period filtering for dashboard metrics
- [ ] Implement MTTR calculation
- [ ] Implement incident count by system
- [ ] Implement failure count by period

### Reports
- [ ] Implement incidents by period report
- [ ] Implement incidents by severity report
- [ ] Implement incidents by monitored system report
- [ ] Implement alerts by type and priority report
- [ ] Implement monitored system availability report
- [ ] Implement response time report
- [ ] Implement responsible user activity report
- [ ] Implement environment-based report filters
- [ ] Implement export-ready response structure

### Validation and Error Handling
- [ ] Define validation rules for all main entities
- [ ] Validate authentication requests
- [ ] Validate user input
- [ ] Validate monitored system input
- [ ] Validate health check input
- [ ] Validate incident input
- [ ] Validate alert input
- [ ] Implement consistent business exception handling
- [ ] Implement resource-not-found handling
- [ ] Implement access-denied handling
- [ ] Implement invalid-state-transition handling
- [ ] Implement conflict handling for duplicates
- [ ] Standardize API error responses

### Pagination, Filtering, and Search
- [ ] Implement pagination for users
- [ ] Implement pagination for monitored systems
- [ ] Implement pagination for incidents
- [ ] Implement pagination for alerts
- [ ] Implement pagination for logs
- [ ] Implement pagination for audit records
- [ ] Implement sorting options in list endpoints
- [ ] Implement reusable filtering patterns
- [ ] Implement search by key business fields

### Documentation
- [ ] Write project overview documentation
- [ ] Write domain overview documentation
- [ ] Document main modules
- [ ] Document user roles and permissions
- [ ] Document business rules
- [ ] Document API endpoints
- [ ] Document authentication flow
- [ ] Document incident lifecycle
- [ ] Document alert lifecycle
- [ ] Document database structure
- [ ] Write setup and run instructions
- [ ] Write future improvements section
- [ ] Write architectural decisions section

### Testing
- [ ] Define testing strategy
- [ ] Implement unit tests for business rules
- [ ] Implement unit tests for incident lifecycle rules
- [ ] Implement unit tests for alert rules
- [ ] Implement unit tests for monitored system rules
- [ ] Implement integration tests for authentication
- [ ] Implement integration tests for user management
- [ ] Implement integration tests for monitored systems
- [ ] Implement integration tests for incidents
- [ ] Implement integration tests for alerts
- [ ] Implement integration tests for audit and logs
- [ ] Validate main operational flows with tests

### Deployment and Environment
- [ ] Configure environment variables strategy
- [ ] Prepare the application for PostgreSQL
- [ ] Prepare local development configuration
- [ ] Prepare production-like configuration
- [ ] Make the application runnable in Linux
- [ ] Add Docker support
- [ ] Add docker-compose for local environment
- [ ] Prepare future CI/CD pipeline structure
- [ ] Prepare future cloud deployment structure
- [ ] Plan AWS deployment approach
- [ ] Plan observability and runtime logging strategy

### Final Polish
- [ ] Review entity and module consistency
- [ ] Review business rules coverage
- [ ] Review naming consistency
- [ ] Review API consistency
- [ ] Review security restrictions
- [ ] Review audit coverage
- [ ] Review log coverage
- [ ] Review dashboard usefulness
- [ ] Review documentation completeness
- [ ] Prepare the project as a portfolio-ready case study

## In Progress


## Done