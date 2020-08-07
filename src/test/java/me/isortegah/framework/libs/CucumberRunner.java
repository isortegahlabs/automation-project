package me.isortegah.framework.libs;

import cucumber.runtime.*;
import cucumber.runtime.Runtime;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CucumberRunner {

    private RuntimeOptions runtimeOptions;
    private final Runtime runtime;

    public CucumberRunner(Class<?> clazz) throws URISyntaxException {
        RuntimeOptionsFactory runtimeOptionsFactory = new RuntimeOptionsFactory(clazz);
        runtimeOptions = runtimeOptionsFactory.create();

        List<URI> uniqueGlue = new ArrayList<>();

        uniqueGlue.add(new URI("classpath:com/isortegah/framework/steps"));

        runtimeOptions.getGlue().clear();
        runtimeOptions.getGlue().addAll(uniqueGlue);

        runtime = Runtime.builder().withRuntimeOptions(runtimeOptions).build();
    }

    public void runCukes() {
        runtime.run();
    }
}
