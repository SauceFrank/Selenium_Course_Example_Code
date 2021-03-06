// filename: tests/TestDynamicLoading.java
package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import pageobjects.DynamicLoading;
import tests.groups.Deep;

import static org.junit.Assert.assertTrue;

@Category(Deep.class)
public class TestDynamicLoading extends BaseTest {

    private DynamicLoading dynamicLoading;

    @Before
    public void setUp() {
        dynamicLoading = new DynamicLoading(driver);
    }

    @Test
    public void hiddenElementLoads() {
        dynamicLoading.loadExample("1");
        assertTrue("finish text didn't display after lomvn clean test ading",
                dynamicLoading.finishTextPresent());
    }

    @Test
    public void elementAppears() {
        dynamicLoading.loadExample("2");
        assertTrue("finish text didn't render after loading",
                dynamicLoading.finishTextPresent());
    }
}