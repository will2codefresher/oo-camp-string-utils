### Involve jacoco in gradle 
1. add plugin jacoco
```angular2html
plugins 'jacoco'
``` 
2. config jacoco
```angular2html
jacoco {
    toolVersion '0.8.4'
}
```
3. config jacoco specification
```angular2html
jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit {
                minimum = 1
            }
        }
    }
}
```
4. append jacoco coverage report generation and rule check to test
```angular2html
test.finalizedBy jacocoTestReport, jacocoTestCoverageVerification
```

### Guideline reference
[Definitive Guide to the JaCoCo Gradle Plugin](https://reflectoring.io/jacoco/)