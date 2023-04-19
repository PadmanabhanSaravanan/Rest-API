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
* [**RestFul Web API**](#restful-web-api)<!-- style="font-size:18px" -->
* [**An Intuitive understanding of REST**](#an-intuitive-understanding-of-rest) <!-- style="font-size:18px" -->
* [**REST Constraints or Principles**](#rest-constraints) <!-- style="font-size:18px" -->
* [**Serialization**](#serialization)<!-- style="font-size:18px" -->
* [**Deserialization**](#deserialization)<!-- style="font-size:18px" -->
* [**Richardson Maturity Model**](#richardson-maturity-model)<!-- style="font-size:18px" -->

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

### **An Intuitive understanding of REST**

* Rest is an architectural style
* Restful is referred to web services that implements REST
* It is simply a program that returns data from the database to the client in a format that it requests.
* It is based on HTTP, it reterives data through standard HTTP methods. GET,PUT,POST & DELETE.

### **REST Constraints or Principles** 

Architectural Constraints of RESTful API: There are six architectural constraints which makes any web service are listed below:

* [**Uniform Interface**](#uniform-interface)
* [**Stateless**](#stateless)
* [**Cacheable**](#cacheable)
* [**Client-Server**](#client-server)
* [**Layered System**](#layered-system)
* [**Code on Demand**](#code-on-demand)

#### **Uniform Interface**

It is a key constraint that differentiate between a REST API and Non-REST API. It suggests that there should be an uniform way of interacting with a given server irrespective of device or type of application (website, mobile app). 

There are four guidelines principle of Uniform Interface are:

* **Resource-Based** : Individual resources are identified in requests. For example: API/users.
* **Manipulation of Resources Through Representations** : Client has representation of resource and it contains enough information to modify or delete the resource on the server, provided it has permission to do so. Example: Usually user get a user id when user request for a list of users and then use that id to delete or modify that particular user.
* **Self-descriptive Messages** : Each message includes enough information to describe how to process the message so that server can easily analyses the request.
* **Hypermedia as the Engine of Application State (HATEOAS)** : It need to include links for each response so that client can discover other resources easily.

#### **Stateless**

It means that the necessary state to handle the request is contained within the request itself and server would not store anything related to the session. In REST, the client must include all information for the server to fulfill the request whether as a part of query params, headers or URI. Statelessness enables greater availability since the server does not have to maintain, update or communicate that session state. There is a drawback when the client need to send too much data to the server so it reduces the scope of network optimization and requires more bandwidth.

#### **Cacheable**

Every response should include whether the response is cacheable or not and for how much duration responses can be cached at the client side. Client will return the data from its cache for any subsequent request and there would be no need to send the request again to the server. A well-managed caching partially or completely eliminates some client–server interactions, further improving availability and performance. But sometime there are chances that user may receive stale data. 

#### **Client-Server**

REST application should have a client-server architecture. A Client is someone who is requesting resources and are not concerned with data storage, which remains internal to each server, and server is someone who holds the resources and are not concerned with the user interface or user state. They can evolve independently. Client doesn’t need to know anything about business logic and server doesn’t need to know anything about frontend UI. 

#### **Layered system**

An application architecture needs to be composed of multiple layers. Each layer doesn’t know any thing about any layer other than that of immediate layer and there can be lot of intermediate servers between client and the end server. Intermediary servers may improve system availability by enabling load-balancing and by providing shared caches. 

#### **Code on demand**

It is an optional feature. According to this, servers can also provide executable code to the client. The examples of code on demand may include the compiled components such as Java Servlets and Server-Side Scripts such as JavaScript. 

### **Serialization**

Serialization is a process of converting an object from its current state to a stream of bytes which can be written to a file or transported through a network or stored in a database.

Can serialize to any encoding format. Popular ones are Xml & JSON.

![image serialization](images/serialization-diagram.png)

### **Deserialization**

Deserialization is the process of converting a stream of data into objects.The main purpose of serialization and deserialization is to persist the data and recreate whenever needed.

Can Deserialize from any encoding format. Popular ones are Xml & JSON.

![image deserialization](images/deserialization.jpg)

### **Richardson Maturity Model**

* Richardson Maturity Model is a model developed by Lenoard Richardson.
* It grades APIs by their RestFul maturity.
* It breaks down the principal element of the REST approach into four levels (0 to 3).

There are four levels:

* [**Level 0: The Swamp of POX**](#level-0-the-swamp-of-pox)
* [**Level 1: Resources**](#level-1-resources)
* [**Level 2: HTTP Verbs**](#level-2-http-verbs)
* [**Level 3: Hypermedia Control**](#level-3-hypermedia-control)

![image Richardson Maturity Model](images/richardson.png)

#### **Level 0 The Swamp of POX**

Level 0 is also often referred to as POX (Plain Old XML). At level 0, HTTP is used only as a transport protocol. For zero maturity level services, we use a single URL and a single HTTP method. We send a request to the same URI for obtaining and posting the data. Only the POST method can be used. for example, A particular company can have a lot of customers or users. We have only one endpoint for all the customers. All operations are performed via the POST method.  

```markdown
To get the data: POST http://localhost:8080/users
To post the data: POST http://localhost:8080/users
```

#### **Level 1 Resources**

In level 1 , each resource is mapped to a specific URI. However, only one HTTP method (POST) is used for retrieving and creating data. for example, we need to access the employees working in a company.

```markdown
To add an employee to a particular department:
POST/department/<department-id>/employee
To access a specific employee :
POST/department/<department-id>/employee/<employee-id>
```

#### **Level 2 HTTP Verbs**

At Level 2 requests are sent with the correct HTTP verb. A correct HTTP response code is returned for each request.

For example: To get the users of the company, we send a request with the URI

```markdown
http://localhost:8080/users and the server sends proper response 200 OK.
```

#### **Level 3 Hypermedia Control**

Level 3 is the highest level. It is the combination of level 2 and HATEOAS. It also provides support for HATEOAS. It is helpful in self-documentation.

For example, if we send a GET request for customers, we will get a response for customers in JSON format with self-documenting Hypermedia.