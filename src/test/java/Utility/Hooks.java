package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    protected static BrowserDriver browser;
    
    @Before
    public void SetUpTest() {
    	browser = new BrowserDriver();   
    }

    @After
    public void TearDownTest() {
        browser.close();
    }
}
