package com.example.inventoryservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableDiscoveryClient
@RestController //delete later
@OpenAPIDefinition
@CrossOrigin(origins = {"http://localhost:9091"}, methods = {RequestMethod.GET})
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);

    }

    //delete later
    @GetMapping("/get")
    public String deleteLater() {
        return "Test done perfectly";
    }//delete later

    @PostMapping("/get")
    public String deleteLater(@RequestBody String name) {
        return "Test done perfectly " + name;
    }
}
