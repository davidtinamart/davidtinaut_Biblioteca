# Biblioteca de Tinaut
### Vista

<img width="718" alt="index" src="https://github.com/davidtinamart/davidtinaut_Biblioteca/assets/113375951/eec754b2-bc61-442f-b20b-71e8765c4351">

### Docker Config BBDD

<img width="288" alt="dockercompose" src="https://github.com/davidtinamart/davidtinaut_Biblioteca/assets/113375951/c70483d9-28ec-4204-9618-3629bf198e20">

### Docker Contenedor BBDD

<img width="709" alt="bbdddocker" src="https://github.com/davidtinamart/davidtinaut_Biblioteca/assets/113375951/aaca2d51-d129-449d-92cd-1971c19958a7">



## Development

When starting the application `docker compose up` is called and the app will connect to the contained services.
[Docker](https://www.docker.com/get-started/) must be available on the current system.

During development it is recommended to use the profile `local`. In IntelliJ `-Dspring.profiles.active=local` can be
added in the VM options of the Run Configuration after enabling this property in "Modify options". Create your own
`application-local.yml` file to override settings for development.

Lombok must be supported by your IDE. For IntelliJ install the Lombok plugin and enable annotation processing -
[learn more](https://bootify.io/next-steps/spring-boot-with-lombok.html).

In addition to the Spring Boot application, the DevServer must also be started. [Node.js](https://nodejs.org/) has to be
available on the system - the latest LTS version is recommended. On first usage and after updates the dependencies have to be installed:

```
npm install
```

The DevServer can now be started as follows:

```
npm run devserver
```

Using a proxy the whole application is now accessible under `localhost:8081`. All changes to the templates and JS/CSS
files are immediately visible in the browser.

## Build

The application can be built using the following command:

```
mvnw clean package
```

Node.js is automatically downloaded using the `frontend-maven-plugin` and the final JS/CSS files are integrated into the jar.

Start your application with the following command - here with the profile `production`:

```
java -Dspring.profiles.active=production -jar ./target/bibliotecatinaut-0.0.1-SNAPSHOT.jar
```

If required, a Docker image can be created with the Spring Boot plugin. Add `SPRING_PROFILES_ACTIVE=production` as
environment variable when running the container.

```
mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=io.bootify/bibliotecatinaut
```

## Further readings

* [Maven docs](https://maven.apache.org/guides/index.html)  
* [Spring Boot reference](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)  
* [Spring Data JPA reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)  
* [Thymeleaf docs](https://www.thymeleaf.org/documentation.html)  
* [Webpack concepts](https://webpack.js.org/concepts/)  
* [npm docs](https://docs.npmjs.com/)  
* [Bootstrap docs](https://getbootstrap.com/docs/5.3/getting-started/introduction/)  
* [Htmx in a nutshell](https://htmx.org/docs/)  
* [Learn Spring Boot with Thymeleaf](https://www.wimdeblauwe.com/books/taming-thymeleaf/)  
