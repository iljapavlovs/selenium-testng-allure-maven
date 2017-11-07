# selenium-testng-allure-maven
Sample project using:
1. Selenium WebDriver
2. TestNg
3. Allure2
4. Maven


### Command for execution

#### To run tests and generate Allure report:
```
mvn clean site -P [singleThreaded,nogrid,grid,parallelSuite]
```

* *singleThreaded* - execute tests sequentially, omits parallel execution
* *nogrid* - execute tests locally
* *grid* - execute tests on Selenium Grid. Grid Hub can be set in pom in `seleniumGridURL` property
* Thread count can be set via `-Dthreads` argument
* *parallelSuite* - run parallel suite

For example, invoking 
```
clean verify -P parallelPlugin,nogrid -Dthreads=3 -Dbrowser=chrome
``` 
will execute tests in parallel 3 threads on local machine and using *cucumber-jvm-parallel-plugin* plugin. In addition, `-Dbrowser` setting will set browser to Chrome.


#### Reports
Reports will be generated in `target/site` folder