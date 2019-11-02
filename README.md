# configclient

Config Client: In any microservice if we want to keep our application properties as centralized we can go for config client concept.

**TO Implement Config Client we need below steps:**

* Need to add web, actuator, config client dependencies
* Need to keep @RefreshScope annotation in controller class
* In bootstrap properties file we have to keep application name, config server URL, management security = false
