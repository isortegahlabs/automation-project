package me.isortegah.framework.libs;

import cucumber.api.testng.PickleEventWrapper;
import cucumber.runtime.CucumberException;
import gherkin.events.PickleEvent;

class CucumberExceptionWrapper implements PickleEventWrapper {
    private CucumberException exception;

    CucumberExceptionWrapper(CucumberException e) {
        this.exception = e;
    }

    @Override
    public PickleEvent getPickleEvent() {
        throw this.exception;
    }

}