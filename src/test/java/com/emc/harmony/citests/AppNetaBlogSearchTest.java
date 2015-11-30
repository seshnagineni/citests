package com.emc.harmony.citests;

import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class AppNetaBlogSearchTest {
  @Test
  public void testSearchReturnsResults() {
    //Create instance of PhantomJS driver
    DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
    // capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/Users/sesh_nagineni/Downloads/phantomjs-2.0.0-macosx/bin/phantomjs");
    capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/root/phantomjs/bin/phantomjs");
    PhantomJSDriver driver = new PhantomJSDriver(capabilities);
 
    //Navigate to the page
    driver.get("http://estorestg.emc.com/");
    driver.manage().window().setSize( new Dimension( 1124, 850 ) );
 
    System.out.println("here1");
    //Click the Blog link
    driver.findElement(By.linkText("Entry-Level Storage")).click();
    System.out.println("here2");
 
    //Input the search term into the search box
   // String searchTerm = "Testing";
   // driver.findElement(By.id("s")).sendKeys(searchTerm);
 
    //Click the Search button
   // driver.findElement(By.cssSelector("input[value='Search']")).click();
 
    //Find the results
    //List<WebElement> results = driver.findElements(By.cssSelector(".post"));
 
    //Verify that at least one post is found
    //Assert.assertTrue(results.size() > 0);
 
    //Navigate to the first post result
    //results.get(0).findElement(By.cssSelector("a[rel='bookmark']")).click();
 
    //Verify that the search term is contained within the post
    
    // System.out.println(driver.getPageSource());
    Assert.assertTrue(driver.getPageSource().contains("/Product-Family/DATA-DOMAIN-PRODUCTS/EMC-Data-Domain-DD2200/p/DDM-DataDomain-DD2200"));
   // Assert.assertEquals(expected, actual);
  
  }
}