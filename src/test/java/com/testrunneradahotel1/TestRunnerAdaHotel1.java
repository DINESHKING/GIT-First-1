package com.testrunneradahotel1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Adahotel1.feature",glue="com.stepdefinitionadahotel1",monochrome=true)
public class TestRunnerAdaHotel1 {


}
