# Rest-API Tutorial

![image Icon](images/rest-api.PNG)

## TABLE OF CONTENT 

1. [**REST API**](#rest-api)<!-- style="font-size:20px" -->

2. **Request & Response**<!-- style="font-size:20px" -->

3. **Creating RestFul Services**<!-- style="font-size:20px" -->

4. **Working with Database**<!-- style="font-size:20px" -->

5. **Caching**<!-- style="font-size:20px" -->

## **REST API**

* [**Introduction**](#introduction)<!-- style="font-size:18px" -->
* **Need of Rest**<!-- style="font-size:18px" -->
* **RestFul Web API**<!-- style="font-size:18px" -->
* **Comparison of APIs**<!-- style="font-size:18px" -->
* **An Intuitive understanding of REST**<!-- style="font-size:18px" -->
* **REST Constraints**<!-- style="font-size:18px" -->
* **Concept of Serialization**<!-- style="font-size:18px" -->
* **Concept of Deserialization**<!-- style="font-size:18px" -->
* **Richardson Maturity Model**<!-- style="font-size:18px" -->

### **INTRODUCTION**

* REST API, is a web service that follows the principles of Representational State Transfer (REST) architecture.
* REST is a set of architectural constraints that are applied to web services, which can be used to create highly scalable and flexible web services.

![image Working1](images/rest-api-working.png)

**What is API?**<!-- style="font-size:20px;font-family:Times New Roman;" -->

Application Programming Interface (API) is a software interface that allows two applications to interact with each other without any user intervention.

![image Working](images/api-working.png)

**What is REST?**<!-- style="font-size:20px;font-family:Times New Roman;" -->

Representational State Transfer(REST), is an architectural style for providing standards between computer systems on the web, making it easier for systems to communicate with each other. 

For example, when a developer calls Instagram API to fetch a specific user (the resource), the API will return the state of that user, including their name, the number of posts that user posted on Instagram so far, how many followers they have, and more.

The representation of the state can be in a JSON format, and probably for most APIs this is indeed the case. It can also be in XML or HTML format.

What the server does when you, the client, call one of its APIs depends on 2 things that you need to provide to the server:

* An identifier for the resource you are interested in. This is the URL for the resource, also known as the endpoint. In fact, URL stands for Uniform Resource Locator.
* The operation you want the server to perform on that resource, in the form of an HTTP method, or verb. The common HTTP methods are GET, POST, PUT, and DELETE.