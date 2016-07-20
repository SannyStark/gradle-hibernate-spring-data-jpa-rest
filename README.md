# gradle-hibernate-spring-data-jpa-rest

Start Server Run : 
gradle tomcatRun

End-Points : 

# Get user By ID  <br />
http://localhost:8080/user/{id}  <br />
Method : GET  <br />


# Store User
http://localhost:8080/user <br />
Method : POST <br />
Request Body : <br />
```json
{
  "email" : "email@email.com"
  "password" : "pwd"
}
```
