# Notes and Exercises

## Project Teams

https://docs.google.com/spreadsheets/d/1HMtBdWAmIqa5wmB7nHiMa4wWdtk6UBu1EwnDsmJub0Q/edit?usp=sharing


## Project Casestudies

https://drive.google.com/drive/folders/1ZcnUnsqkycI70Hlm_KnIwvS2-PO5B3N7?usp=sharing

## Presentations Sample

https://drive.google.com/file/d/1pJ1w8UyQbWMF3RT1iQF5HbVI1YZ1dubj/view?usp=sharing

## Angular Videos

https://drive.google.com/drive/folders/1HebnyjDMsC-7-h2J3F5s-BxwDGwJ5fYZ?usp=sharing

## Angular Image Upload

https://github.com/ram1ujdx/image-upload-angular-spring-boot


## React Testing Referrences

https://www.freecodecamp.org/news/testing-react-hooks/

https://www.robinwieruch.de/react-testing-library/

## Spring Security Tutorials

Part 1 - https://drive.google.com/file/d/1SznWFEWPTs3QbvUhrt7Kq1hkDe76HmqT/view?usp=share_link

Part 2 - https://drive.google.com/file/d/1Up9yHJn5l-g2c2Y745FBaSiNCquGUK98/view?usp=share_link

## AWS ECS 

* Deploying Covid-info service - https://drive.google.com/file/d/18OAdN-gQfLBCI3N2IuRBdk-s6eeH695c/view?usp=share_link

## AWS CICD

https://drive.google.com/drive/folders/1ZdLGHDNdaSTBexLPlwYlD4U2e7hDospS?usp=sharing


## How to send header with RestTemplate

```java

// request url
String url = "https://jsonplaceholder.typicode.com/posts/{id}";

// create an instance of RestTemplate
RestTemplate restTemplate = new RestTemplate();

// create headers
HttpHeaders headers = new HttpHeaders();

// set `Content-Type` and `Accept` headers
headers.setContentType(MediaType.APPLICATION_JSON);
headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

// example of custom header
headers.set("X-Request-Source", "Desktop");

// build the request
HttpEntity request = new HttpEntity(headers);

// make an HTTP GET request with headers
ResponseEntity<String> response = restTemplate.exchange(
        url,
        HttpMethod.GET,
        request,
        String.class,
        1
);

// check response
if (response.getStatusCode() == HttpStatus.OK) {
    System.out.println("Request Successful.");
    System.out.println(response.getBody());
} else {
    System.out.println("Request Failed");
    System.out.println(response.getStatusCode());
}

```


## JWT Dependencies

```xml

		<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-impl -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-jackson -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>

```

## How to write standard comments


### Sample 1

```java

/*
 * Project Name : 
 *
 * 
 * */
package com.capgemini.pecunia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.dao.AccountDao;
import com.capgemini.pecunia.dao.LoanRequestDao;
import com.capgemini.pecunia.entity.AccountDetails;
import com.capgemini.pecunia.entity.LoanRequests;
import com.capgemini.pecunia.exception.BankAccountNotFound;

/**
* The LoanRequestServiceImp class implements  that implements loanRequest
*
* @author  : Harsh Kumar
* @version : 1.0
* @since   : DD-MM-YYYY 
*/
@Service
public class LoanRequestServiceImp implements LoanRequestService {
	
	
	// Tells the application context to inject an instance of LoanRequestDao here
	@Autowired
	LoanRequestDao dao;
	
	// Tells the application context to inject an instance of AccountDao here
	@Autowired
	AccountDao account;

	/**
   * This method is used to process loan request. 
   * @param  loanreq :This is the  paramter to process loanreq
   * @return String  : This returns String message,else else throws
   * an exception which is handled globally
   */
	
	
	@Override
	public String loanRequest(LoanRequests loanreq) {
		
		String s1 = loanreq.getAccountId();
		Optional<AccountDetails> details = account.findById(s1);

		if (details.isPresent()) {
			dao.save(loanreq);

			return "Your Loan Request is successful";
		} else {

			throw new BankAccountNotFound("No BankAccount found with " + loanreq.getAccountId()
					+ "\n You need to have an Bank Account to applay Loan");
		}

	}

}

```

### Sample 2

```java

/*
 * Project Name : 
 *
 * 
 * */
package com.capgemini.pecunia.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entities.Transactions;
import com.capgemini.pecunia.service.PassbookMaintenanceService;


/**
* The PassbookController class implements an implements updatePassbook method
*
* @author   :Harsh Kumarr
* @version  :1.0
* @since    :YYYY-MM-DD 
*/
@RestController
@RequestMapping("/bank")
@CrossOrigin(origins = "http://localhost:4200")
public class PassbookController {

	// Tells the application context to inject an instance of PassbookMaintenanceService here
	@Autowired
	private PassbookMaintenanceService service;

	//Fetching the transactions till last updated date
	
   /**
   * This method is used to Fetching the transactions till last updated date. 
   * @param accountId       :This is the  paramter 
   * @return ResponseEntity : This returns list of Transactions
   */
   
	@GetMapping("/updatePassbook/{accountId}")
	public  ResponseEntity<List<Transactions>> updatePassbook(@PathVariable("accountId") String accountId)
	{
			List<Transactions> list = service.updatePassbook(accountId);
			return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
		}
		
}



```

## Important Links

* Core Java - Overview, First Java Program, Variables, Datatypes, Literals, Operators, Expressions and Conditional Statements.		https://www.geeksforgeeks.org/java-programming-basics/
* Core Java - String, Arrays, Looping Statements, Methods, Class, Object, static		https://www.programiz.com/java-programming
* Core Java - Access Modifiers, Packages, Encapsulation		https://www.javatpoint.com/inheritance-in-java
* Core Java - Polymorphism, Inheritance, Abstraction, Interface		https://www.geeksforgeeks.org/polymorphism-in-java/
* Core Java - Collection Framework, ArrayList, Map, Set.		https://www.geeksforgeeks.org/collections-in-java-2/
* Core Java - File Handling, Threads and Garbage Collections, Exception Handling, Enums.		https://www.javatpoint.com/java-io
* Java 8 - Java 8 Features - Lambda Expressions, Streams, Filters, java.time.		https://www.journaldev.com/2389/java-8-features-with-examples
* Junit 5 and Maven - Writing basic tests, Assert Statements, Testing Exceptions		https://howtodoinjava.com/junit-5-tutorial/
* RDBMS - DDL Commands, DML Commands		https://www.javatpoint.com/mysql-tutorial
* RDBMS - Operators, Aggregate, String, Date Functions		https://www.geeksforgeeks.org/sql-tutorial/
* Web Basics - Learn the basics of HTML5 & CSS3		https://www.w3schools.com/html/
* JavaScript - Learn the basics of Javascript		https://www.javatpoint.com/javascript-tutorial![image](https://user-images.githubusercontent.com/42864715/172369342-f5a11d3a-15fe-46da-9253-4ef28c976f30.png)



## MongoDB Notes

```text

What is Mongo DB?
------------------

- Document Oriented Database
- Object Oriented and hence ORM is not required
- Non Relational
- No SQL
- Scalable
- Java Script as the querry language
- uses BSON (Binary JSON)


Default Port?
------------------ 
27017


Collection
------------
- alternate to tables in RDBMS
- contains documents(equivalent to rows in RDBMS)
- _id is a default field of a document
		- it is a 24 digit numeric value, can be auto-generated, or manually provide


Mongo DB Commands :
--------------------
- show all databases(non-empty)
	show dbs
 
- create or switch database
	use book_db

- create a collection
	db.createCollection("book")

- see all the collections
	db.getCollectionNames()

- Insert a new Document
	db.book.insert({title:"Angular Programming",author:"Harsh Kumar",price:545.0})
	- with auto generated id
	
	db.book.insert({_id:100101,title:"Java Programming",price:755.0, yearPublished:2020})
	- with manually provided ID

- how to fetch all the records
	db.book.find()
	db.book.find().pretty()

- how to merge the data
	db.book.save({_id:100101,title:'Java Programming', price:890}) - will update
	db.book.save({title:'Python for Beginers', price:890}) - will insert

- how to delete a document
	db.book.deleteMany({_id:100101})
	db.book.remove({title:'Angular Programming'})

- how to update the data
	db.book.update({title:"Python for Beginers"},{$set:{title:"Angular Programming", price:650}})

- how to fetch the data
	db.book.find({price:750})
	db.book.find({title:"Angular Programming"})
	db.book.find({$or:[{_id:100101},{title:"Angular Programming"}]})

- delete a database
	db.dropDatabase()

- delete a collection
	db.book.drop()

- get the document count
	db.book.find().count()

- using less than or greater then in find query

	 db.book.find({price:{$gt:700}})





```

## Practice Statement: Bookstore

**The Hammond Bookstore sells books of different genres, such as fiction, religion, adventure, cooking, travel, autobiographies, etc., written by different authors.The bookstore has had a good sale this past year. Now, the end of the year sale is on, and the books from the fiction genre are being sold at a discount of 25%.**

**Tasks :**

1. Implement appropriate access specifiers.
2. Write accessor and mutator methods for all the classes.
3. Access the variables of the classes only through accessor and mutator methods.

```java
class Book {
    // Implement data hiding by declaring member variables private
    int isbnNo;
    String bookName;
    String author;
    String genre;
    float price;
}



public class Bookstore {
    // Implement data hiding by declaring member variables private
    String bookStoreName;
    String bookStoreId;
    Book[] books;

    public Bookstore(String bookStoreName, String bookStoreId, Book[] books) {
        this.bookStoreName = bookStoreName;
        this.bookStoreId = bookStoreId;
        this.books = books;
    }

    //Declare getter and setter methods


    // Function to calculate the discount for a genre of books
    public float calculateDiscount(Book book,float discountPercentage)
    {
        return -1;
    }
}


public class BookStoreImpl {
    public static void main(String[] args) {
    
        // Declare and initialize author, book and bookstore objects

        // Use the get and set methods to set values to the variables

        //Display book details before discount is calculated

        //Calculate discount on the books by calling the methods

        //Display book details after discount is calculated
    }

}


## Practice Statement: Compare Customers

**Write a program to compare two customer objects that contain the name,unique Id, email and residential address.**

**Tasks**
1. Write appropriate accessor and mutator methods.
2. Override the equals method.

**Sample Input**

    address1 = area: "RRnagar", city: "Bangalore";
    address2 = area: "RRnagar", city: "Bangalore";
    customer1 = Id : 101, name : "John", email : "john@gmail.com" , address1
    customer1 = Id : 101, name : "John", email : "john@gmail.com" , address2

**Sample Output**

    The customers are the same.

**Boilerplates**
```java
package com.jap.oops;

public class Customer {

    public Customer() {
        //default Constructor
    }

    public Customer(int customerId, String name, String email, Address address) {

    }



    @Override
    public boolean equals(Object other) {

        return false;
    }

    public int getCustomerId() {
        return -1;
    }

    public void setCustomerId(int customerId) {

    }

    public String getName() {
        return "";
    }

    public void setName(String name) {

    }

    public String getEmail() {
        return "";
    }

    public void setEmail(String email) {

    }

    public Address getAddress() {
        return null;
    }

    public void setAddress(Address address) {

    }
}


```

```java

package com.jap.oops;

public class Address {

    public Address(){
        //default constructor
    }

    public Address(String area, String city) {

    }

    public String getArea() {
        return "";
    }

    public void setArea(String area) {
            }

    public String getCity() {
        return "";
    }

    public void setCity(String city) {

    }

    @Override
    public boolean equals(Object other) {


        return false;
    }
}


```




## MealDB URL

https://www.themealdb.com/api/json/v1/1/search.php?s=pasta


### AJAX Code Promise Based

```javascript


let XMLHttpRequest = require('xhr2');


async function getGitInfo() {
    return new Promise(
        (resolve,reject)=>{
            let xhr = new XMLHttpRequest();
            let username='ram1ujdxrweyteytfe'
            //let username=document.getElementById('username').value;
            xhr.open("GET", "https://api.github.com/users/"+username, true);

            xhr.onload = function(){
                    if(this.status==200){
                        resolve(xhr.response)
                    }
                    else{
                        reject({
                            "status":404,
                            "message":"Not Found"
                        })
                    }
                }
            xhr.send()
            

    }
)
}

getGitInfo().then(response=>console.log(response))
                .catch(response=>console.log(response))

```

## Authentication Module

### Angular Steps

* Step 1 : Create a component to accept username and password

* Step 2: Make an http request to send the credentials and get the jwt token in return

* Step 3: Store the JWT Token as a Session Storage item

```typescript

    this._loginService.authenticate(user).subscribe(
      data => sessionStorage.setItem("hm.auth",data.value)
    )



```


* Step 4: Create an interceptor and send the token as header with every request

```bash

ng generate interceptor [interceptor-name]

```

```typescript

const jwt = sessionStorage.getItem("hm.auth");
    if(jwt){
      request = request.clone({
        setHeaders:{
          auth:jwt
        }
      })
    }
    
    return next.handle(request);
  }

```





