Name : xxxxxxxxx

Project Title : Daily Mail Travel Coding Challenge 

Installation guide: This is a maven project. so It's assumed that the host running this code have Java and maven installed and JAVA_HOME already set. Here is the guide for maven installation just in case : https://maven.apache.org/install.html

Project get all dependencies from maven repository. So no additional installation needed.

Below are the dependencies are being used for this project :

Junit, Cucumber, Serenity, JavaFaker 

Build and run your project : 
This is maven project and tests are written in JUnit . so we use maven command line commands to run the project from terminal as below to pick up JUnit tests and see the serenity reports:
mvn verify
or mvn clean verify

A link will then be provided where you can find your Serenity report in the target folder.

Framework is built with Cucumber BDD in combination with Serenity but can be expanded to integrate more advanced Serenity report features.  It is created using  basic Page Object Model design pattern with Serentity Steps but it can be improved if needed.