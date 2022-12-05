package com.Tests;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestRegister.class, TestOpenNewAccount.class, TestAccountsOverview.class  })
public class AllTests {

}
