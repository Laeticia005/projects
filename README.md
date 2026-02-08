# Servlet Hello – Apache Tomcat

## Description
This project is a simple Java web application that demonstrates the implementation, compilation, and deployment of a Servlet using Apache Tomcat.  
The servlet displays a message **“Hello Laeticia Mallat”** when accessed from a web browser.  
An HTML page is also provided with a link to invoke the servlet.

---

## Project Structure
The project follows the standard Maven web application structure:

``` text
src/
└── main/
├── java/
│ └── org.example/
│ └── HelloServlet.java
└── webapp/
└── index.html
pom.xml
```

- `HelloServlet.java`: Servlet implementation
- `index.html`: HTML page containing a link to the servlet
- `pom.xml`: Maven configuration file

---

## Technologies and Versions
- **Java JDK**: (e.g. 17)
- **Maven**: Apache Maven
- **Apache Tomcat**: 9.0.x
- **IDE**: IntelliJ IDEA (Community Edition)

---

## Servlet Implementation
The servlet extends `HttpServlet` and is mapped using the annotation:

```java
@WebServlet("/hello")
```
When accessed via HTTP GET, it returns a simple HTML response displaying:Hello Laeticia Mallat

## Build Instructions

To compile and package the project, run the following command in the project root:
```
mvn clean package
```
This generates a WAR file in the target directory:
```
servlet-hello-1.0-SNAPSHOT.war
```

## Deployment on Tomcat

Copy the generated WAR file:
```
target/servlet-hello-1.0-SNAPSHOT.war
```
Paste it into the Tomcat webapps directory:
```
apache-tomcat-9.0.xx/webapps/
```
Start Tomcat using:
```
catalina.bat run
```
Tomcat automatically deploys the application.
Testing in Browser

Once Tomcat is running, the application can be accessed using:

Servlet URL
http://localhost:8080/servlet-hello-1.0-SNAPSHOT/hello
HTML Page
http://localhost:8080/servlet-hello-1.0-SNAPSHOT/index.html

## Author
Laeticia Mallat

