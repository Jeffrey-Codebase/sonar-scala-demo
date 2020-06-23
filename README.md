### Sonar-Scala-Demo
This project is a simple Scala hello world project used to demo Sonar integration

### Test Command
mvn clean test scoverage:report scala:compile

### Sonar Command
 mvn sonar:sonar -Dsonar.host.url=http://HOST-NAME:9000 -Dsonar.login=xxxxxxx
