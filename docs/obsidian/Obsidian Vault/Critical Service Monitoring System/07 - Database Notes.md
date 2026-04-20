# Database Notes

## Main Entities
- Monitored System
- Responsible Contact
- Team
## Fields by Entity
#### Monitored System
- id
- name
- description
- environment
- monitoring_enabled
- created_at
- updated_at
- acceptable_response_time
- status
- criticality_level
- primary_responsible
- team
#### Responsible Contact
- id
- name
- email
- phone
- active
- created_at
- updated_at
- team
#### Team
- id
- name
- description
- email
- active
- created_at
- updated_at
## Relationships
- One monitored system must belong to one team.
- One monitored system may have one primary responsible contact.
- One responsible contact must belong to one team.
- One team can have many responsible contacts.
- One team can own many monitored systems.
- One responsible contact can be assigned as the primary contact for many monitored systems.
## Open Questions