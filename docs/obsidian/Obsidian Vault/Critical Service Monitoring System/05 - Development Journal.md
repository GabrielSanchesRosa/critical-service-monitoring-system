# Development Journal  
  
## 2026-04-19  
  
### What I did today  
I started designing the main entities of the system and created some enums to better organize statuses and classification levels.  
  
### Problems found  
I identified a naming issue in the `responsible_contact` entity: the `role` column could become ambiguous once the future `user` entity is introduced, since `role` will also be used for access control and authorization.  
  
Because of that, I decided to remove the `role` column from the `responsible_contact` entity. At this stage, it is not a mandatory field and does not add enough value to justify the ambiguity.  
  
### Next steps  
- Implement the database connection  
- Create the CRUD operations for the main entities