# CatsAndDogs Talk: Kotlin Server
A bare bones Kotlin Web Service using Spark framework for the Cats And Dogs Talk
This is the backend layer, exposed as a data layer to the [backend for frontend](https://github.com/RomainPiel/CatsAndDogs-kotlin-bff).

## How to set up the dev environment

- Install [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- Kotlin should be shipped with Intellij 15, for older versions [read this post](https://kotlinlang.org/docs/tutorials/getting-started.html)
- Install the [heroku toolbelt](https://devcenter.heroku.com/articles/heroku-cli)

## How to run the server

Build the project:
```
./gradlew stage
```
To run the server:
```
heroku local web
```

Then in your browser, open http://localhost:5000

## Other Components
* https://github.com/RomainPiel/CatsAndDogs-kotlin-bff
* https://github.com/michael-r-may/CatsAndDogs-Swift-Server
* https://github.com/michael-r-may/CatsAndDogsiOS
* https://github.com/RomainPiel/CatsAndDogs-Android
* https://github.com/RomainPiel/CatsAndDogs-kotlin-server

## Useful Links
* http://kotlinlang.org
* http://swift.org
* http://samnewman.io/patterns/architectural/bff/
