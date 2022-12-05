package com.Tests;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestRegister.class, TestCart.class })
public class AllTests {

}
