# Getting Started

To build the project:

1. Configure DB connection in `src/main/application.properties` and `pom.xml` (`jooq-codegen-maven` plugin if you would like to regenerate jOOQ files)
2. Execute in a command line: `./mvnw spring-boot:run`
3. Open in a browser: http://localhost:8080/gui
4. Execute in the opened GraphQL client one of allowed query.

E.g.
```
{
  orders(country: "CA") {
    id
    items { quantity amount sku description price }
    user { id name email country }
    total
  }
}
```
or
```
{
  ordersWithoutItems(country: "US") {
    id
    user { id name email country }
    total
  }
}
```
or without `country` argument.
