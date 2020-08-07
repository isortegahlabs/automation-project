package com.isortegah.framework.testRunner.directExecution;

import cucumber.api.cli.Main;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MainMainTest {

    @Test
    public void test(){
        Main.main(new String[]{ "--threads",  "4",
                "-p", "pretty",
                "-g", "com.isortegah.framework.steps",
                "classpath:features"});
    }
}
