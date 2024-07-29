# API Tests
Luki Ramadon

## IDE / Plugins Used
- Eclipse 4.32.0
- OpenJDK Runtime Environment Zulu17.46+19-CA (build 17.0.9+8-LTS)
- io.rest-assured.rest-assured: 5.4.0
- org.testng: 7.10.2
- io.rest-assured.json-schema-validator: 5.4.0



## Things Validated for Each Test Case
- HTTP Status: should be 200 (get) and 201 (created, when create new post)
- JSON Schema on response
- Schema file stored on `schemas` folder on root project

## Running The Project 
- Open this project folder on Eclipse 
- Open up `TestExample.java`
- Click `Run` to run individual test case, or click `Run All` to run the suite / all test cases
  - report generated on `test-output` folder 