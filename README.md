#Spring Boot Sandbox

Experimenting with various things needed to get Spring Boot working for a web 
application.

## Running in Netbeans

Using the Netbeans plugin from https://github.com/AlexFalappa/nb-springboot/wiki

* File --> New Project --> Spring Project from Initializr
* Web, and dev tools added in the wizard
* selected all options on the last page of the wizard

## DevTools

if run via the Run command at the top of the menu in netbeans (not the 
run on the main class)

* Application can be stopped cleanly in the output window
* LiveReload works for css, js, changes in controllers, and freemarker templates


## Features
* logback configured
* port configured in application.properties
* freemarker set to use includes (al a tiles)
* use of webjars for javascript dependencies


# Postgres JPA
* https://github.com/AlgiersJUG/spring-boot-postgres-sample
* http://blog.netgloo.com/2014/10/27/using-mysql-in-spring-boot-via-spring-data-jpa-and-hibernate/
* https://github.com/netgloo/spring-boot-samples
* uses the sample database in derby provided by Netbeans
* database data is from https://github.com/donhenton/dbscripts/blob/master/postgres_birt_create.sql
and https://github.com/donhenton/dbscripts/blob/master/postgres_birt_load.sql