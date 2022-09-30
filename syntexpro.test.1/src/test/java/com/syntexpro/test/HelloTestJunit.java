package com.syntexpro.test;

import com.syntexpro.dev.Hello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTestJunit {

    @Test
    public void helloTest(){
        Hello hello = new Hello();
        Assertions.assertEquals("I am a java developer", hello.callHello());
    }
}
