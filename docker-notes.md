## Running Mysql and Java App as Docker containers
-----------------------------------------------

1. Create a docker network

```bash

docker network create employee-app-mysql

```

2. Run Mysql on that network 

```bash

docker run -p 3308:3306 --network employee-app-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=hm_db --name mysql-emp -d mysql

```

4. Mention required environment properties for spring boot app

```properties

spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:${MYSQL_PORT:3306}/${MYSQL_DB:hm_db}
spring.datasource.username=${MYSQL_USER:root}
spring.datasource.password=${MYSQL_PASSWORD:password}

```

4. Run Spring Boot app on the same network

```bash

docker run -p 8500:8500 --network=employee-app-mysql -e MYSQL_HOST=mysql-emp -e MYSQL_PORT=3306 -e MYSQL_DB=hm_db -e MYSQL_USER=root -e MYSQL_PASSWORD=password --name employee-app-mysql employee-app-mysql

```



## Running Microservices on Docker containers
-----------------------------------------------

1. Update the eureka server location for all the microservices

```properties

eureka.client.service-url.defaultZone=http://${EUREKA_HOST:localhost}:${EUREKA_PORT:8761}/eureka/

```

2. Build the images for all the microservices

3. Create a docker-compose.yml file

4. Verify the docker-compose.yml file

```bash

	docker-compose config

```

5. Start the containers

```bash

	docker compose up

```

6. Stop and Remove the containers

```bash

	docker compose down
    
```


## Dockerfile for Angular App

```dockerfile

FROM nginx
COPY dist/[app-name] /usr/share/nginx/html

```


















