package com.isortegah.framework.testRunner.directExecution;

import org.testng.annotations.Test;
import cucumber.runtime.Runtime;

public class RuntimeBuilderTest {

    @Test
    public void testSingleFeature() {
        //StringBuilder parallel = new StringBuilder();
        Runtime.builder()
                .withArgs("--threads", "3",
                        "-p","pretty",
                        "--glue","com.isortegah.framework.steps",
                        "classpath:features")
                //.withAdditionalPlugins(new JSONFormatter(parallel))
                .build()
                .run();

        ///StringBuilder serial = new StringBuilder();
        Runtime.builder()
                .withArgs("--threads", "1",
                        "-p","pretty",
                        "--glue","com.isortegah.framework.steps",
                        "src/test/resources/features")
                //.withAdditionalPlugins(new JSONFormatter(serial))
                .build()
                .run();

    }

    @Test
    public void testMultipleFeatures() {
        //StringBuilder parallel = new StringBuilder();
        Runtime.builder()
                .withArgs("--threads", "3",
                        "-p","pretty",
                        "--glue","com.isortegah.framework.steps",
                        "src/test/resources/features",
                        "src/test/resources/features")
                //.withAdditionalPlugins(new JSONFormatter(parallel))
                .build()
                .run();


        //StringBuilder serial = new StringBuilder();
        Runtime.builder()
                .withArgs("--threads", "1",
                        "-p","pretty",
                        "--glue","com.isortegah.framework.steps",
                        "src/test/resources/features",
                        "src/test/resources/features")
                //.withAdditionalPlugins(new JSONFormatter(serial))
                .build()
                .run();

    }
}
