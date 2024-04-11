package com.AP.Asianpaints;
import org.junit.runner.RunWith;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberPropertiesProvider;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",             
                "html:target/Cucumber.html",
                "html:test-output"},
		features = "src/test/resources/features",
		glue= {"Steps"}, 
		tags="@tag3")
public class TestRunner extends AbstractTestNGCucumberTests
{
	private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass(ITestContext context) {
        XmlTest currentXmlTest = context.getCurrentXmlTest();
        CucumberPropertiesProvider properties = currentXmlTest::getParameter;
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass(), properties);
    }
    public @interface SuppressWarnings {
        /**
         * The set of warnings that are to be suppressed by the compiler in the
         * annotated element.  Duplicate names are permitted.  The second and
         * successive occurrences of a name are ignored.  The presence of
         * unrecognized warning names is <i>not</i> an error: Compilers must
         * ignore any warning names they do not recognize.  They are, however,
         * free to emit a warning if an annotation contains an unrecognized
         * warning name.
         *
         * <p> The string {@code "unchecked"} is used to suppress
         * unchecked warnings. Compiler vendors should document the
         * additional warning names they support in conjunction with this
         * annotation type. They are encouraged to cooperate to ensure
         * that the same names work across multiple compilers.
         * @return the set of warnings to be suppressed
         */
        String[] value();
    }
    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        // the 'featureWrapper' parameter solely exists to display the feature
        // file in a test report
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    /**
     * Returns two dimensional array of {@link PickleWrapper}s with their
     * associated {@link FeatureWrapper}s.
     *
     * @return a two dimensional array of scenarios features.
     */
    @DataProvider
    public Object[][] scenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }
}
