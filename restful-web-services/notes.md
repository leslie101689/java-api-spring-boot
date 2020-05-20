# RESTful Web Services

Social Media Application

User -> Posts

- Retrieve all Users   - GET /users
- Create a User        - POST /users
- Retrieve one User    - GET /users/{id} -> /users/1
- Delete a User        - DELETE /users/{id} -> /users/1

- Retrieve all posts for a User - GET /users/{id}/posts
- Create a posts for a User - POST /users/{id}/posts
- Retrieve details of a post - GET /users/{id}/posts/{post_id}

#security dependencies
	    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
spring.security.user.name=username
spring.security.user.password=password

#table structure 
create table user (
id integer not null, 
birth_date timestamp, 
name varchar(255), 
primary key (id)
)