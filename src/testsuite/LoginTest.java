package testsuite;
/*1. Create the package ‘browserfactory’ and create the class
with the name ‘BaseTest’ inside the ‘browserfactory’
package. And write the browser setup code inside the
class ‘Base Test’.
2. Create the package ‘testsuite’ and create the following
class inside the ‘testsuite’ package.
1. LoginTest
3. Write down the following test into ‘LoginTest’ class
 1. userSholdLoginSuccessfullyWithValid Credentials
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify the text “PRODUCTS”
2. verifyThatSixProductsAreDisplayedOnPage
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify that six products are displayed
 on page

 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;


public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp(){
        //For opening browser
        openBrowser(baseUrl);
    }
    /** Enter “standard_user” username
     * Enter “secret_sauce” password
     * Click on ‘LOGIN’ button
     * Verify the text “PRODUCTS”
     * */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // enter Username
        sendTextToElement(By.name("user-name"),"standard_user");
        //Enter password field element
        sendTextToElement(By.name("password"),"secret_sauce");
        //click on LOGIN button
        clickOnElement(By.xpath("//input[@class='submit-button btn_action']"));
        //Verify the text “PRODUCTS”
        String expectedMessage = "PRODUCTS";
        String actualMessage = getTextFromElement(By.xpath("//span[@class='title']"));
        Assert.assertEquals("PRODUCTS",expectedMessage,actualMessage);

}

@Test
public void verifyThatSixProductsAreDisplayedOnPage(){
// enter Username
    sendTextToElement(By.name("user-name"),"standard_user");
    //Enter password field element
    sendTextToElement(By.name("password"),"secret_sauce");
    //click on LOGIN button
    clickOnElement(By.xpath("//input[@class='submit-button btn_action']"));
    //Verify the text “PRODUCTS”
    String expectedMessage = "PRODUCTS";
    String actualMessage = getTextFromElement(By.xpath("//span[@class='title']"));
    Assert.assertEquals("PRODUCTS",expectedMessage,actualMessage);
// Verify that six products are displayed on page
    boolean isInventoryDisplay=driver.findElement(By.xpath("//div[@id='inventory_container']")).isDisplayed();
    System.out.println("products are Displayed:"+isInventoryDisplay);

}
    @After
    public void tearDown(){
        closeBrowser();

    }
}
/*userShouldLoginSuccessfullyWithValidCredentials
        * click on the ‘Login’ link
        * Enter valid username
        * Enter valid password
        * Click on ‘LOGIN’ button
        * Verify the ‘Log out’ text is display

 */
/* userShouldNavigateToLoginPageSuccessfully
 * click on the ‘Login’ link
 * Verify the text ‘Welcome, Please Sign In!’

 */
/*verifyTheErrorMessage
* click on the ‘Login’ link
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘Login was unsuccessful.
 Please correct the errors and try again. No customer account found’
  */