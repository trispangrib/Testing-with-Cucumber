package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features", glue="stepDefinition")/*Folder penyipanan feature file*/

public class TestRunner {

}

