# gradle-hibernate-spring-data-jpa-rest

Start Server Run : 
gradle tomcatRun

End-Points : 

# Get user By ID
http://localhost:8080/user/{id}
Method : GET


# Store User
http://localhost:8080/user
Method : POST
Request Body : 
{
  "email" : "email@email.com"
  "password" : "pwd"
}
