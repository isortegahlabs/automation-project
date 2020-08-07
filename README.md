# Automation Project

## Prerequisitos

* Verificar versión de chromedriver
* Ubicación de binario de firefox

Revisión de opciones 

Usage: java cucumber.api.cli.Main

```
mvn test -Dcucumber.options="-h"
```

[Cliente](https://github.com/cucumber/cucumber-jvm/blob/v4.2.6/core/src/main/resources/cucumber/api/cli/USAGE.txt)

## Referencia

### Cucumber

[Manejo lambdas](https://medium.com/@bcarunmail/sharing-state-between-cucumber-step-definitions-using-java-and-spring-972bc31117af)

### TestNG 

[cucumber-jvm](https://github.com/cucumber/cucumber-jvm/blob/580090bc2f7cdcc29830c2118f2ab2525663f81e/testng/README.md)  
[Using TestNG](https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html)  
[RunParallelCukesTest](https://github.com/cucumber/cucumber-jvm/blob/e471442b0bd6a6d263bbcac03c8079107a36d84d/spring/src/test/java/cucumber/runtime/java/spring/threading/RunParallelCukesTest.java)  
[Runtime Builder](https://github.com/cucumber/cucumber-jvm/blob/f84035870c2b6a94c07bf8dda829f335b549c4c5/core/src/test/java/cucumber/runtime/formatter/JsonParallelRuntimeTest.java)  
[Main main](http://grasshopper.tech/283/)

### Junit 4

JUnit. Unfortunately due to framework limitations
JUnit4 can only execute features in parallel. [*](https://cucumber.ghost.io/blog/announcing-cucumber-jvm-4-0-0/)

[Junit 4](https://docs.cucumber.io/guides/10-minute-tutorial/)  
[Junit 5](https://dzone.com/articles/embrace-junit5)

Assume
Through [Assume](https://junit.org/junit4/javadoc/4.12/org/junit/Assume.html#Assume()) JUnit provides:

a set of methods useful for stating assumptions about the conditions in which a test is meaningful. A failed assumption does not mean the code is broken, but that the test provides no useful information. The default JUnit runner skips tests with failing assumptions. Custom runners may behave differently.

The Cucumber runner supports Assume and will marked skipped scenarios as skipped.

