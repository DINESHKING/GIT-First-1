package com.testrunneradahotel;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Adahotel.feature",glue="com.stepdefenitionadahotel")
public class TestRunnerAdaHotel {

}
