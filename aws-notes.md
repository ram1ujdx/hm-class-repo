## AWS EC2

### Launching an EC2 Instance

- Select service EC2
- Create new Instance
- Select the AMI and Type
- Create a key pair (if previously not created)
- Launch instance


### Connecting to an Instace

- Copy the IP4 DNS of the instance
- run command
	```bash

     ssh -i [key.pem file name] ec2-user@[IP4-DNS] 
     
     ```

-

### Installing Git on EC2

- sudo yum install git -y

Installing Java 17 on EC2

- sudo yum install java-17-amazon-corretto-headless


Installing Docker on EC2

- sudo yum install docker -y


Starting Docker Service

- sudo service docker start


## AWS Elastic Beanstalk:

__(Managed Service - PaaS)__
: is used to deploy any application (Java,Python,PHP etc.)

Steps : 
1. Create an Application
2. Create an Environment
3. Select Web-Server Environment
4. Choose a platform (Managed Platform)
Java -> Corretto 17 -> Platform Version
5. Application Code
 - Sample Application
6. Create Environment
7. Upload the Jar File
(Make sure your application port is set to 5000)

## AWS Elastic Beanstalk with MySQL Database:

### Make the following changes to the application.properties

```properties

server.port=5000

## Database Properties for AWS RDS

spring.datasource.url=jdbc:mysql://${RDS_HOSTNAME:localhost}:${RDS_PORT:3306}/${RDS_DB_NAME:hm_db}
spring.datasource.username=${RDS_USER:root}
spring.datasource.password=${RDS_PASSWORD:password}

```


Steps : 
1. Create an Application
2. Create an Environment
3. Select Web-Server Environment
4. Choose a platform (Managed Platform)
Java -> Corretto 17 -> Platform Version
5. Application Code
 - Sample Application
6. Configure More Options
* Keep everything as default
* Choose Database
* Mysql
* Version
* Provide some username and password
__Don't keep snapshots(Select the delete option)__
 
7. Create Environment
8. Upload the Jar File
(Make sure your application port is set to 5000)
