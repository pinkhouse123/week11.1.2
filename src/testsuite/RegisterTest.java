package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Click on Register link
        /*driver.findElement(By.linkText("Register")).click();*/
        clickOnElement(By.linkText("Register"));

        String expectedResult = "Register";
        /*WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualResult = message.getText();*/
        String actualResult = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));

        Assert.assertEquals("Not in Register Page", expectedResult, actualResult);

        // Select gender radio button
        // driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        clickOnElement(By.xpath("//input[@id='gender-female']"));
        // Enter First name
        //driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Umi");
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "Umi");
        // Enter Lash name
        //driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");
        sendTextToElement(By.xpath("//input[@id='LastName']"), "Patel");
        //Select Day Month and Year
        //driver.findElement((By.xpath("//select[@name='DateOfBirthDay']"))).sendKeys("14");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"),"14");
        //driver.findElement((By.xpath("//select[@name='DateOfBirthMonth']"))).sendKeys("February");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"),"February");
        //driver.findElement((By.xpath("//select[@name='DateOfBirthYear']"))).sendKeys("2000");
        sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"),"2000");
        //Enter email, password and confirm password
        //driver.findElement((By.xpath("//input[@name='Email']"))).sendKeys("umipatel@gmail.com");
        sendTextToElement(By.xpath("//input[@name='Email']"),"umipatel@gmail.com");
        //driver.findElement((By.xpath("//input[@id='Company']"))).sendKeys("123abc");
        sendTextToElement(By.xpath("//input[@id='Company']"),"123abc");
        //driver.findElement((By.xpath("//input[@id='Newsletter']"))).click();
        clickOnElement(By.xpath("//input[@id='Newsletter']"));
        //driver.findElement((By.xpath("//input[@id='Password']"))).sendKeys("umi123");
        sendTextToElement(By.xpath("//input[@id='Password']"),"umi123");
        //driver.findElement((By.xpath("//input[@id='ConfirmPassword']"))).sendKeys("umi123");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"umi123");
        // Click Register button
        //driver.findElement((By.xpath("//button[@id='register-button']"))).click();
        clickOnElement(By.xpath("//button[@id='register-button']"));

    }

    @After
    public void stop() {
        closeBrowser();

    }

}
