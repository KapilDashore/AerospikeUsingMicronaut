package com.restapi;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
@OpenAPIDefinition(
        info = @Info(
                title = "aerospike",
                version = "0.0",
                description = "Ganesh API",
                license = @License(name = "Apache 2.0", url = "https://ganesh.bar"),
                contact = @Contact(url = "https://gigantic-server.com", name = "Ganesh Pawar", email = "pawarganesh1212@gmail.com")
        )
)



public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
