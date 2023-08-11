package com.grid.demo.testsuite;

import com.grid.demo.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class GridDemo extends TestBase {


    @Test
    public void testOne() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Page title is: " + driver.getTitle());
    }

}
