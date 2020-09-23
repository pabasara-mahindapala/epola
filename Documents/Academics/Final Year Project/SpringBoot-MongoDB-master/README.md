**Tools used** 

1. Java
2. Maven
3. Spring with Web + MongoDb + Dev dependency
4. Spring Tool Suite

**Entry point** 
App1Application.java 

**Sample Url to run locally**

http://localhost:8090/rest/order/all

http://localhost:8090/rest/inventory/all

http://localhost:8090/rest/account/all

http://localhost:8090/rest/order/add

http://localhost:8090/rest/order/searchOrderByEmail/emailId{emailId}

eg: http://localhost:8090/rest/order/searchOrderByEmail/emailIduser1@domain.com

Application support Rest API, for placing ecommerce order post validation, there could be multiple opportunities to extend this work future by providing features like 

1. Search Order by
	a) Product
	b) Account
	c) OrderValue etc
2. Update Order 
3. Remove Order 
4. Return Order 

Similarly for inventory and account management we can think for multiple crud operation 

To make documentation easy we can work with tools like **Swagger**

This project also needs to configure **application.properties** with server setting like (sample included)

**#application**


spring.application.name=ecomApplication 


server.port=8090



**#Mongo DB**

spring.data.mongodb.port=27017

spring.data.mongodb.host=localhost

spring.data.mongodb.database=myDatabase

