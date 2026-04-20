## Phase 1 — Foundation

**Expected Result:**  
At the end of this phase, the system should have a solid structural foundation. Users should be able to authenticate, permissions should be enforced correctly, and the core domain should already exist in a stable and coherent way. The project should have a consistent package structure, a defined database model, basic validations, and working management for users and monitored systems.

### Step 1 — Define the domain before coding
- [ ] Review the project goal
- [x] Define the main modules of the system
- [x] Define the user roles
- [ ] Define the main operational workflows
- [ ] Define the enum values for statuses, severities, priorities, origins, and event types
- [ ] Define the naming conventions of the project

### Step 2 — Model the domain
- [x] Identify the core entities
- [x] Define the attributes of each entity
- [x] Define the relationships between entities
- [ ] Define which entities have lifecycle states
- [ ] Define which entities require historical records
- [ ] Define which entities should never be physically deleted

### Step 3 — Design the database
- [ ] Design the initial database schema
- [ ] Define primary keys
- [ ] Define foreign keys
- [ ] Define unique constraints
- [ ] Define important indexes
- [ ] Define deactivation/soft-delete strategy where applicable

### Step 4 — Define the backend structure
- [x] Define the package/folder structure
- [ ] Define the responsibility of each layer
- [ ] Define the API response pattern
- [ ] Define the API error response pattern
- [ ] Define validation strategy
- [ ] Define auditability and traceability strategy at a high level

### Step 5 — Set up the project base
- [ ] Configure the project base
- [ ] Configure database connection
- [ ] Configure environment variables
- [ ] Prepare local development configuration
- [ ] Verify the application starts correctly

### Step 6 — Implement authentication and authorization
- [ ] Implement login flow
- [ ] Implement password hashing
- [ ] Implement role-based access control
- [ ] Implement protected endpoints
- [ ] Implement inactive user restriction
- [ ] Implement blocked user restriction
- [ ] Implement change password feature
- [ ] Implement administrator password reset feature

### Step 7 — Implement user management
- [ ] Implement user creation
- [ ] Implement user update
- [ ] Implement user activation/deactivation
- [ ] Implement user blocking/unblocking
- [ ] Implement user role assignment
- [ ] Implement user detail retrieval
- [ ] Implement user listing
- [ ] Implement user filtering/search
- [ ] Add validation rules for user fields

### Step 8 — Implement monitored systems management
- [ ] Implement monitored system creation
- [ ] Implement monitored system update
- [ ] Implement monitored system detail retrieval
- [ ] Implement monitored system listing
- [ ] Implement monitored system filtering/search
- [ ] Implement monitoring activation/deactivation
- [ ] Implement criticality management
- [ ] Implement environment classification
- [ ] Implement responsible user/team assignment
- [ ] Implement current status persistence
- [ ] Add validation rules for monitored system fields

### Step 9 — Stabilize Phase 1
- [ ] Review entity consistency
- [ ] Review relationships consistency
- [ ] Review access restrictions
- [ ] Review validations
- [ ] Review API patterns
- [ ] Confirm the system is stable enough to move forward

---

## Phase 2 — Operational Core

**Expected Result:**  
At the end of this phase, the system should behave like a real operational platform. It should be able to register health checks, detect state changes, manage maintenance mode, create and track incidents, generate alerts, and maintain a reliable operational history through incident timelines. The main business flows should already feel realistic and meaningful.

### Step 1 — Implement health check structure
- [ ] Implement health check entity/model
- [ ] Define valid health check data
- [ ] Implement manual health check registration
- [ ] Store timestamp
- [ ] Store health check origin
- [ ] Store detected status
- [ ] Store response time
- [ ] Store technical message/diagnostic

### Step 2 — Implement health check queries
- [ ] Implement health check history retrieval
- [ ] Implement latest health check retrieval
- [ ] Implement health check filters
- [ ] Validate health check input rules

### Step 3 — Connect health checks to monitored systems
- [ ] Update monitored system current status based on the latest valid health check
- [ ] Implement state change detection
- [ ] Define behavior for repeated same-state checks
- [ ] Define health check rules during maintenance mode
- [ ] Prevent inconsistent status updates

### Step 4 — Implement maintenance flow
- [ ] Implement maintenance mode start
- [ ] Implement maintenance mode end
- [ ] Store maintenance reason
- [ ] Store maintenance timestamps
- [ ] Define maintenance impact on health checks, alerts, and incidents

### Step 5 — Implement incident base structure
- [ ] Implement incident entity/model
- [ ] Implement incident severity
- [ ] Implement incident status lifecycle
- [ ] Implement incident origin
- [ ] Implement impact description
- [ ] Associate incidents with monitored systems

### Step 6 — Implement manual incident management
- [ ] Implement manual incident creation
- [ ] Implement incident detail retrieval
- [ ] Implement incident listing
- [ ] Implement incident filtering/search
- [ ] Implement responsible user assignment
- [ ] Implement responsible user reassignment
- [ ] Implement root cause registration
- [ ] Implement solution registration
- [ ] Implement incident resolution
- [ ] Implement incident closure

### Step 7 — Enforce incident business rules
- [ ] Enforce valid incident status transitions
- [ ] Enforce “resolved before closed” rule
- [ ] Enforce responsible user assignment for critical incidents
- [ ] Prevent invalid reopen behavior
- [ ] Prevent duplicate open incidents for the same condition

### Step 8 — Implement incident timeline
- [ ] Implement incident timeline entity/model
- [ ] Register incident creation in the timeline
- [ ] Register status changes in the timeline
- [ ] Register responsible user changes in the timeline
- [ ] Implement comments in the timeline
- [ ] Implement action taken records in the timeline
- [ ] Implement root cause events in the timeline
- [ ] Implement solution events in the timeline
- [ ] Implement chronological timeline retrieval

### Step 9 — Implement alert base structure
- [ ] Implement alert entity/model
- [ ] Implement alert type
- [ ] Implement alert priority
- [ ] Implement alert status lifecycle
- [ ] Associate alerts with monitored systems
- [ ] Associate alerts with incidents when applicable

### Step 10 — Implement manual and automatic alerts
- [ ] Implement manual alert creation
- [ ] Implement automatic alert generation
- [ ] Implement alert acknowledgment
- [ ] Implement alert resolution
- [ ] Implement alert detail retrieval
- [ ] Implement alert listing
- [ ] Implement alert filtering/search

### Step 11 — Connect monitoring to alerts and incidents
- [ ] Define alert escalation conditions
- [ ] Define which conditions generate automatic alerts
- [ ] Define which alerts can trigger automatic incidents
- [ ] Prevent duplicate active alerts for the same condition
- [ ] Prevent duplicate automatic incidents from repeated checks

### Step 12 — Stabilize Phase 2
- [ ] Review the health check flow
- [ ] Review maintenance behavior
- [ ] Review incident lifecycle
- [ ] Review alert lifecycle
- [ ] Review interactions between health checks, alerts, and incidents
- [ ] Confirm the operational core is stable enough to move forward

---

## Phase 3 — Traceability and Professional Quality

**Expected Result:**  
At the end of this phase, the system should become much more professional, predictable, and trustworthy. It should support operational logs, audit trails, standardized validations, structured error handling, pagination, sorting, and filtering. By this point, the backend should already feel much closer to a production-grade system.

### Step 1 — Define logging strategy
- [ ] Define which actions must always be logged
- [ ] Define log categories or severity levels
- [ ] Define the technical actor representation for automatic actions
- [ ] Define what belongs to logs versus audit records

### Step 2 — Implement operational logs
- [ ] Implement authentication event logging
- [ ] Implement user action logging
- [ ] Implement automatic system event logging
- [ ] Implement log detail retrieval
- [ ] Implement log listing
- [ ] Implement log filtering/search

### Step 3 — Define audit strategy
- [ ] Define which entities must be audited
- [ ] Define which changes require before/after values
- [ ] Define operation types
- [ ] Define immutable audit behavior

### Step 4 — Implement audit trail
- [ ] Implement audit record model
- [ ] Audit user changes
- [ ] Audit monitored system changes
- [ ] Audit incident changes
- [ ] Audit alert changes
- [ ] Audit maintenance state changes
- [ ] Store operation type
- [ ] Store actor and timestamp
- [ ] Store before/after values where applicable
- [ ] Implement audit record retrieval
- [ ] Implement audit filtering/search
- [ ] Restrict audit access to Admin and Auditor
- [ ] Ensure audit records are immutable

### Step 5 — Strengthen validation
- [ ] Define validation rules for all main entities
- [ ] Validate authentication requests
- [ ] Validate user input
- [ ] Validate monitored system input
- [ ] Validate health check input
- [ ] Validate incident input
- [ ] Validate alert input

### Step 6 — Standardize error handling
- [ ] Implement business exception handling
- [ ] Implement resource-not-found handling
- [ ] Implement access-denied handling
- [ ] Implement invalid-state-transition handling
- [ ] Implement duplicate/conflict handling
- [ ] Standardize API error responses

### Step 7 — Implement pagination, sorting, and filtering patterns
- [ ] Implement pagination for users
- [ ] Implement pagination for monitored systems
- [ ] Implement pagination for incidents
- [ ] Implement pagination for alerts
- [ ] Implement pagination for logs
- [ ] Implement pagination for audit records
- [ ] Implement sorting options in list endpoints
- [ ] Implement reusable filtering patterns
- [ ] Improve search by key business fields

### Step 8 — Stabilize Phase 3
- [ ] Review traceability coverage
- [ ] Review audit coverage
- [ ] Review log coverage
- [ ] Review validation consistency
- [ ] Review error response consistency
- [ ] Confirm the system behaves predictably and is maintainable

---

## Phase 4 — Metrics, Dashboard, and Reports

**Expected Result:**  
At the end of this phase, the system should provide real operational visibility. Users should be able to understand the current environment at a glance, analyze incident and alert patterns, and access useful reliability metrics such as availability, failure counts, and MTTR. The project should now feel more complete from a product perspective.

### Step 1 — Define which metrics matter
- [ ] Define the main operational metrics
- [ ] Define dashboard data sources
- [ ] Define period-based calculation rules
- [ ] Define how availability will be calculated
- [ ] Define how MTTR will be calculated

### Step 2 — Implement dashboard summaries
- [ ] Implement total monitored systems summary
- [ ] Implement systems-by-status summary
- [ ] Implement open incidents summary by severity
- [ ] Implement incidents summary by status
- [ ] Implement active alerts summary by priority
- [ ] Implement alerts summary by type

### Step 3 — Implement operational metrics
- [ ] Implement top failing systems metric
- [ ] Implement incident count by system
- [ ] Implement failure count by period
- [ ] Implement basic availability metrics
- [ ] Implement response time metrics
- [ ] Implement MTTR calculation
- [ ] Implement time-period filtering for dashboard metrics

### Step 4 — Implement reports
- [ ] Implement incidents by period report
- [ ] Implement incidents by severity report
- [ ] Implement incidents by monitored system report
- [ ] Implement alerts by type and priority report
- [ ] Implement monitored system availability report
- [ ] Implement response time report
- [ ] Implement responsible user activity report
- [ ] Implement environment-based report filters
- [ ] Implement export-ready response structure

### Step 5 — Stabilize Phase 4
- [ ] Review metric correctness
- [ ] Review dashboard usefulness
- [ ] Review report consistency
- [ ] Review performance of report queries
- [ ] Confirm the dashboard and reports reflect the operational history correctly

---

## Phase 5 — Documentation, Testing, and Deployment

**Expected Result:**  
At the end of this phase, the project should be polished, documented, testable, and ready to be presented as a strong portfolio case study. It should be runnable in a clean environment, have enough documentation for another developer to understand it, include automated tests for critical flows, and be prepared for Linux, Docker, and future AWS deployment.

### Step 1 — Write the core documentation
- [ ] Write project overview documentation
- [ ] Write domain overview documentation
- [ ] Document main modules
- [ ] Document user roles and permissions
- [ ] Document business rules
- [ ] Document incident lifecycle
- [ ] Document alert lifecycle
- [ ] Document database structure
- [ ] Write setup and run instructions
- [ ] Write architectural decisions section
- [ ] Write future improvements section

### Step 2 — Document the API
- [ ] Document authentication flow
- [ ] Document API endpoints
- [ ] Document request and response patterns
- [ ] Document error response patterns

### Step 3 — Define testing strategy
- [ ] Define the unit testing scope
- [ ] Define the integration testing scope
- [ ] Define which flows are critical to test first

### Step 4 — Implement unit tests
- [ ] Implement unit tests for business rules
- [ ] Implement unit tests for incident lifecycle rules
- [ ] Implement unit tests for alert rules
- [ ] Implement unit tests for monitored system rules

### Step 5 — Implement integration tests
- [ ] Implement integration tests for authentication
- [ ] Implement integration tests for user management
- [ ] Implement integration tests for monitored systems
- [ ] Implement integration tests for incidents
- [ ] Implement integration tests for alerts
- [ ] Implement integration tests for audit and logs
- [ ] Validate the main operational flows with tests

### Step 6 — Prepare runtime environments
- [ ] Configure environment variables strategy
- [ ] Prepare PostgreSQL-ready configuration
- [ ] Prepare local development configuration
- [ ] Prepare production-like configuration
- [ ] Make the application runnable in Linux

### Step 7 — Containerization and deployment readiness
- [ ] Add Docker support
- [ ] Add docker-compose for local environment
- [ ] Prepare CI/CD pipeline structure
- [ ] Prepare future cloud deployment structure
- [ ] Plan AWS deployment approach
- [ ] Plan observability and runtime logging strategy

### Step 8 — Final portfolio polish
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

### Step 9 — Stabilize Phase 5
- [ ] Confirm the project is runnable from scratch
- [ ] Confirm the documentation is enough for another developer
- [ ] Confirm the tests cover the main flows
- [ ] Confirm the project is presentable as a portfolio project