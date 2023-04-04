package com.stl.EmployeeCheckTasksUpdateProgess;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;


@SuppressWarnings("unused")
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeCheckTasksAndUpdateProgessMicroserviceApplicationTests {

    
    @Test
    @Order(1)
    public void testupdatetask() {
        String jsonbody= "{\"status\" : \"100\"}";
        String token=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(jsonbody)
                .when()
                .put("http://localhost:8091/tasks/update/2")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
    @Test
    @Order(2)
    public void testgetallTasks() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8091/tasks/get")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
    @Test
    @Order(3)
    public void testgetEmployees() {
        String result=given()
                .header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
                .when()
                .get("http://localhost:8091/tasks/get/pavan@gmail.com")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString();
    }
    
}
