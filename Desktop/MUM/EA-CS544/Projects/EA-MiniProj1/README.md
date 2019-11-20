
# EA - Mini Project 1

Mini project of Enterprise Architecture course 

## Getting Started

Save students data(FirsName, LastName, GPA, DOB) to MySQL database using the Spring batch and the Spring security from the CSV file is a purpose mini-project.

Write to DB of Using Spring batch from .csv file 
We need three command to build mini project. Execute Project with Docker.


### Step 1: Clone

Clone this repo to your local machine using https://github.com/git2hub17/EA-MiniProj1

### Step 2: Setup

> run project
 
```
$ chmod +x ./start.sh
```

> again write below command 
 
```
$ ./start.sh
```

### Step 3: Running the Mini Project
If you logged in by admin you can see the batch process result (Spring batch), if you logged in by user, you will be faced Forbidden to do the batch process. Then logout and login by admin to see the result. (Spring Security).

### http://localhost:4446
Admin account:
    - username: admin
    - password: admin

Normal user:
    - username: user
    - password: user


### Now, After successfully deployed the docker containers.

### First, We will be testing role by admin.

- Click to "Click Login" link. Then you can see the Login form and logged into by admin.
Then you can see the students list which retrieves from Database in this page.

#### Second, We will be testing role by normal user.
- Now, again login to home page. http://localhost:4446/ Click to "Click Login" link. Now logged into by normal user. Then you can see "This user can not access." 

Logout and login by admin to see the result. (Spring Security).




## Built With

* [Spring](https://spring.io/) - Spring MVC/Restful, Spring security
* [Spring Batch](https://maven.apache.org/) - Spring Batch
* [Maven](https://maven.apache.org/) - Dependency Management
* [Docker](https://hub.docker.com) - Docker and usage of docker-compose.

## Author

* **Purevdemberel Byambatogtokh** - *986799* - [GithubProject](https://github.com/git2hub17/EA-MiniProj1)


