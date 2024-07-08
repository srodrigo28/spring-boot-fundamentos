### Java Spring Framework && ThymeLife Fundamentos

* Reference:
```Java TreinaWeb
https://www.treinaweb.com.br/painel/cursos/spring-framework-fundamentos/aula/5/subaula/4
```

* H2 Dependência
```
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

* src/main/resources application.properties

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

* Acessando no navegador
```
http://localhost:8080/h2-console/
```

```JDBC URL:
jdbc:h2:mem:testdb
```