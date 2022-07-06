package com.creativesoftware.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponse {

//    get the random port number, then the testing framework can inject a random port to
//    local server port
    @LocalServerPort
    private int port;

//    get a test rest template from the context
    @Autowired
    private TestRestTemplate testRestTemplate;

//    In the following test case, it passes if the string that we put in the
//    controller is same as the string served at the localhost random port
//    "Hello World works perfectly" is what is put on the controller
    @Test
    public void shouldPassIfStringMatches(){
        assertEquals("Hello World works perfectly",
                testRestTemplate.getForObject("http://localhost:"+port+"/", String.class ));
    }
}
