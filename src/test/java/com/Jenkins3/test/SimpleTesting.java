package com.Jenkins3.test;

import com.Jenkins3.base.BaseClass;
import org.testng.annotations.Test;

public class SimpleTesting extends BaseClass {

    @Test
    public void TestCase1(){
        System.out.println("This is for jenkins Test1");
    }
    @Test
    public void TestCase2(){
        System.out.println("This is for jenkins Test2");
    }
    @Test
    public void TestCase3(){
        System.out.println("This is for jenkins Test3");
    }
}
