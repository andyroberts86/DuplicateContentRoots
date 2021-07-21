# DuplicateContentRoots

This is a sample project to assist with the stackoverflow issue here: https://stackoverflow.com/q/68471719/855597

To demonstrate the error Duplicate content roots detected in shared test modules

app is the top level module that has a dependency on all other modules.

feature1 and feature2 modules only have a dependency on shared.

shaared module doesn't depend on any other modules.

```      
       |----feature1----|
app ---|----------------|--- shared
       |----feature2----|
```

Shared includes a helper test function called createTestUser.

The following has been added to each of the modules

```
sourceSets {
    test {
        java {
            srcDir '../shared/src/test/java'
        }
    }
}
```

This allows them to access the createTestUser function in shared/src/test/com/appt/shared


Running `./gradlew test` executes the tests as expected, however Android Studio shows createTestUser function as a 
