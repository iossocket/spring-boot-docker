package springboot.spike.web;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HelloWorldControllerTest {
    @Test
    public void shouldReturnHelloWorldWithOK () {
        //given
        //when
        ResponseEntity responseEntity = new HelloWorldController().helloWorld();
        //then
        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assert.assertEquals("HelloWorld", responseEntity.getBody().toString());
    }
}