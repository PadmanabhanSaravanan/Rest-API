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
* [**Need of Rest**](#need-of-rest)<!-- style="font-size:18px" -->
* [**Rest Principle**](#rest-principle)<!-- style="font-size:18px" -->
* [**RestFul Web API**](#restful-web-api)<!-- style="font-size:18px" -->
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

### **Need of Rest**

* Seperate Client & Server
* REST is Independent of platform and language
* Flexibility & Scalability
* Not Constrained to one format can return (Xml,JSON etcc)
* Since built on top of HTTP, can take adavantage of HTTP cache
* Easy to use
* Discoverability

### **Rest Principle**

* **Uniform interface** : All API requests for the same resource should look the same, no matter where the request comes from. The REST API should ensure that the same piece of data, such as the name or email address of a user, belongs to only one uniform resource identifier (URI). Resources shouldn’t be too large but should contain every piece of information that the client might need.
* **Client-server decoupling** : In REST API design, client and server applications must be completely independent of each other. The only information the client application should know is the URI of the requested resource; it can't interact with the server application in any other ways. Similarly, a server application shouldn't modify the client application other than passing it to the requested data via HTTP.
* **Statelessness** : REST APIs are stateless, meaning that each request needs to include all the information necessary for processing it. In other words, REST APIs do not require any server-side sessions. Server applications aren’t allowed to store any data related to a client request.
* **Cacheability** : When possible, resources should be cacheable on the client or server side. Server responses also need to contain information about whether caching is allowed for the delivered resource. The goal is to improve performance on the client side, while increasing scalability on the server side.
* **Layered system architecture** In REST APIs, the calls and responses go through different layers. As a rule of thumb, don’t assume that the client and server applications connect directly to each other. There may be a number of different intermediaries in the communication loop. REST APIs need to be designed so that neither the client nor the server can tell whether it communicates with the end application or an intermediary.
* **Code on demand** : REST APIs usually send static resources, but in certain cases, responses can also contain executable code (such as Java applets). In these cases, the code should only run on-demand.

### **RestFul Web API**

Web API is an API as the name suggests, it can be accessed over the web using the HTTP protocol. It is a framework that helps you to create and develop HTTP based RESTFUL services. The web API can be developed by using different technologies such as java, ASP.NET, etc. 

**Need for Web API**<!-- style="font-size:20px;font-family:Times New Roman;" -->

* A Web API helps to access service data from different internet devices like browsers, mobile apps, and other devices.
* Helps to work on RESTful web services.
* Helps to develop light weighted and maintainable Web Services.
* Used to create both types of services RESTful and non-RESTful services.
* Also supports JSON, XML, and other data formats.
* Helps to develop services supporting all features of HTTP services such as like caching, request/response headers, versioning, etc.