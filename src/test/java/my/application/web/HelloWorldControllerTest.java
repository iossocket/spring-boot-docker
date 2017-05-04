package my.application.web;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HelloWorldControllerTest {
    @Test
    public void shouldReturnHelloWorldWithOK () {
        ResponseEntity responseEntity = new HelloWorldController().helloWorld();

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assert.assertEquals("HelloWorld", responseEntity.getBody().toString());
    }
}