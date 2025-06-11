package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    protected static BrowserDriver driver;

    @Before
    public void SetUpTest() {
        driver = new BrowserDriver();        
    }

    @After
    public void TearDownTest() {
        driver.close();
    }
}
