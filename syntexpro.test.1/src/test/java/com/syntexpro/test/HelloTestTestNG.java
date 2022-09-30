package com.syntexpro.test;

import com.syntexpro.dev.Hello;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloTestTestNG {

    @Test
    public void helloTest(){
        Hello hello = new Hello();
        Assert.assertEquals(hello.callHello(),"I am a java developer");

    }


}
