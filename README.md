Hello World using undertow webserver [undertow is the default web server in Jboss Wildfly]

Compile & Run directly using compiler plugin

> mvn clean compile exec:java -Dexec.mainClass="com.educatereality.Main"

Send a GET request to undertow web server

> curl http://localhost:8080



Build a jar with dependencies

> mvn clean package


Run undertow server using Jar

> java -jar target/undertow-1.0-SNAPSHOT.jar


Send a GET request to undertow web server

> curl http://localhost:8080