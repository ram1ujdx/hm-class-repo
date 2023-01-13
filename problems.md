## Practice Statement :A Mobile Phone List​

***Imagine that you wish to purchase a mobile phone with specifications that include the brand name, cost, screen size, battery life, storage space and camera pixels. You have a list of the latest models available. Create a program that performs the following activities given in the list:​**

    1. Find phones of a particular brand.
    2. Find the phones whose cost is $500 and above.
    3. Enlist the phones which have camera specification as 12 MP and more


### Boilerplates

```java

public class Mobile {

    private String brandName;
    private String modelName;
    private double cost;
    private String screenSize;
    private String batteryLife;
    private String storageSpace;
    private int cameraPixels;

    //getter and setter

    //constructor

    //toString method


}
```

```java

public class MobileStore {



    public MobileStore()
    {

    }
   
    //Find phones of a particular brand.
    public List<Mobile> findPhoneByBrand(String brandName)
    {

        return null;
    }

    //Find the phones whose cost is $500 and above.
    public List<Mobile> findPhoneCostMoreThan500$()
    {

      return null;
    }

    //Enlist the phones which have camera specification as 12 MP and more
    public List<Mobile> findPhonePixelMoreThan12MP()
    {

        return null;
    }


}


```

__Solve these two hacker rank problems on exception handling__

https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

https://www.hackerrank.com/challenges/java-exception-handling/problem

__Create a list of Student[name,age,height]. Create a custom exception InvalidHeightException that should be thrown when a user enters an height out of the given range of 4-6.8__

### Exercises on Lambdas and Stream

1. Write a method that uses lambda expression to format a given string, where a string should be shortened using the first letter or each word.
For ex., if input is “Indian Railways”, then expected output is “I.R.”.

1. Exercises on Collections and Lambdas-
* https://www.hackerrank.com/challenges/java-lambda-expressions/problem
* From a list of string Count String whose length is more than three
* Remove all empty Strings from List and display the new list

1. Find the distinct employees from a list of employees with duplicate employees

1. Write a Java program to count number of vowels in a given string using regular expression

1. Write a Java program to remove all the vowels of a given string. Return the new string.


## Java 8 Streams

-- Food Ordering App --

```text

Develop a Food Ordering App using Spring Boot. Refer to the class diagram below to develop required classes.
You can use either MySQL or Collections & Streams to store and retrive the data.

MenuItem
	- menuItemId:long
	- itemName:String
	- status:(available/not-available)
	- price:double
	- category (Veg/Nonveg)

Implement the following operations

Add a new item to the menu
Delete an item from the menu
Update the price of an item
Search an Item by Name
Display all the available items
Filter items category wise

Hints:
Create enums for status and category

```

### Spring Simple Exercise

```text

Employee
	-id:int
	-name:String
	-bu:BusinessUnit

BusinessUnit
	-buId
	-name

Create 1 Employee object and 1 BusinessUnit object



```

## Spring-Boot-MySQL Practice Problem

**Food Ordering App**

**Develop a Food Ordering App (JPA/MySQL). Refer to the class diagram below to develop required classes.**

```text
MenuItem
	- menuItemId:long
	- itemName:String
	- status: String(available/not-available)
	- price:double
	- category: String (Veg/Nonveg)
```

Implement the following operations(REST Endpoints):

* Add a new item to the menu
* Delete an item from the menu
* Update the price of an item
* Search an Item by Name
* Display all the available items
* Filter items category wise
* Create exceptions ItemNotFoundException and InvalidCategoryException that should be thrown if you input invalid data

* **Maintain Java Coding Standard.**
* **Use layered architecture**
