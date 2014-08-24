FoodTrucks
==========

###Food Trucks###
A service that tells the user what types of food trucks might be found near a specific location on a map.

![Food Trucks V1.0](https://raw.githubusercontent.com/Abiel/FoodTrucks/master/doc/layout-1.png)

It mashes up the following APIs to achieve its goal.
-Google Maps
-Google GeoLocation
-DataSF

###The Technology Stack###
The following technologies are used to implement Food Trucks V1.0

<ol>
<li>Bootstrap 3.0 | JS | JQuery | CSS </li>
<li>JSP</li>
<li>Spring | Java | Maven</li>
<li>3rd Party APIs</li>
</ol>

###How to start developing###
Want to be a committer for FoodTrucks? 
Clone the project:
```
git clone https://github.com/Abiel/FoodTrucks.git
```
Notify the team of any feature you are working, implement your changes and push your changes as follows
```
git add -A
git commit -m "A very detailed comment of what is done should be here."
git push origin master
```

###How to deploy###
Please deploy the app only when there are 0 test failures and 0 test errors. To run tests:
```
mvn test
```
To generate war file to be deployed:
```
mvn war:war
```
scp ths file to our server and deploy it in our server.
```
scp foodtrucks.war ubuntu@10.1.345.678
sudo cp foodtrucks.war /usr/lib/tomcat7/webapps/
```

###Unit Tests###
Under src/main/test a set of unit tests are included. Whenever a feature is implemented and/or modified please include all tests that validate those changes. Make sure all tests are passing.
![Food Trucks V1.0](https://raw.githubusercontent.com/Abiel/FoodTrucks/master/doc/tests.png)

###Next Features###
In no particular order we have the following features to be implemented:
<ul>
<li>User management: enable users to signup and create simple profiles.</li>
<li>User Reviews & Likes: enabling users to review, like, and rate trucks.</li>
<li>Recommendations & user targeting: based on their reviews & likes, recommend trucks to users.</li>
<li>Sentiment Analysis: a feature for truck owners to get analysis of what users are discussing regarding their service.</li>
</ul>


Contacts:
abiel [dot] m [dot] woldu [at] gmail [dot] com



