/*
 File: V5web_SignUpTests.java
 ----------------------------------------------
 Automation code for Functional tests of ControlBoard web application V5, see more details:
 1. Confluence - @ Pages/Engineering/Quality Assurance/..."
 2. TestRail - https://getcontrol.testrail.net/index.php?/suites/view/1
 */
package com.selion.framework.testsWeb;

import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.logger.SeLionLogger;
import com.paypal.selion.platform.dataprovider.ExcelDataProvider;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;

import com.selion.framework.common_actions.CommonActions;
import com.selion.framework.pagesPayPal.*;
import com.selion.framework.utilities.server.TestServerUtils;
import com.selion.framework.utilities.testdata.TestParameters;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Calendar;




public class DataGeneration_PayPal_Transactions {

    @BeforeClass
    public void startLocalServer() throws Exception {
        TestServerUtils.startServer();
    }

    private static String fileName = "src/test/resources/testData/MyDataFile.xls";
    private ExcelDataProvider dataSource;

/*----------------------------------------------------------------------------------------------------------------------
 CONFIGURATION AND SETUP
----------------------------------------------------------------------------------------------------------------------*/

    /* Loggers, Helpers, etc.. */
    private final ThreadLocal<com.paypal.test.utilities.logging.SimpleLogger> logger = new ThreadLocal<>();
    String className = this.getClass().getSimpleName();

    //need this defined independently for each test, so usernames created are unique
    public static final Calendar c = Calendar.getInstance();
    public static final int utcOffset = c.get(Calendar.ZONE_OFFSET) + c.get(Calendar.DST_OFFSET);
    public static final Long utcMills = c.getTimeInMillis() + utcOffset;

    /* Snippets and Common Actions */
    CommonActions user = new CommonActions();
    TestParameters testData = new TestParameters();

    /* Base URL */
    protected String baseURL = System.getProperty("Base_Url");


    /* Usernames and Passwords*/
    final private String cardNumber = "4916053614944639";
    final private String expiryDate = "12/23";
    final private String CSC = "654";
    final private String firstName = "Brenda";
    final private String lastName = "Lloyd";
    final private String streetAddress = "123 Terminal avenue";
    final private String city = "Los Angeles";
    final private String state = "Alabama";
    final private String ZIP = "90001";
    final private String phoneNumber = "612-532-8304";
    final private String emailAddress = "paypal.user@test-ing.com";

    /* YAML pages */
    PayPal_CheckOut paypalCKO = new PayPal_CheckOut("US");


/* Texts for verifications */
//    public static final String expected_txt_LogInLabel = "Log In";
//    public static final String expectLoginButtonText = "LOGIN";


/*----------------------------------------------------------------------------------------------------------------------
 WEB TESTS
----------------------------------------------------------------------------------------------------------------------*/

    @Test
    @WebTest(additionalCapabilities = {"useBooleanCaps:true", "key:value"})
    public void generateTestData_PayPal_Transactions_GuestCheckout() throws Exception {
    /* Test description:
        1. Open Checkout page for sandbox transactions
         */

        RemoteWebDriver driver = Grid.driver();
        logger.set(SeLionLogger.getLogger());
        WebDriverWait wait = new WebDriverWait(driver,20);

        logger.get().info("\n" + "\n" + "### ### ### STARTED: " + className + "\n");

        //Open test page with PayPal buttons
        driver.get(baseURL);

        //Click on BuyNow button
        paypalCKO.getControlqa_rest_api_2_BuyNowButton().click();
        WebDriverWaitUtils.waitUntilElementIsVisible(paypalCKO.getGuestCheckOutButton().getLocator());

        user.wait5Seconds();
        paypalCKO.clickGuestCheckOutButton();
        user.wait5Seconds();

        //Fill PayPal Guest Checkout form
        paypalCKO.getCardNumberTextField().type(cardNumber);
        paypalCKO.getExpiryValueTextField().type(expiryDate);
        paypalCKO.getCvvTextField().type(CSC);

        user.wait2Seconds();

        paypalCKO.getFirstNameTextField().type(firstName);
        paypalCKO.getLastNameTextField().type(lastName);
        paypalCKO.getBillingAddressTextField().type(streetAddress);
        paypalCKO.getBillingCityTextField().type(city);
        paypalCKO.getBillingStateList().addSelectionByLabel("California");
        paypalCKO.getBillingZIPTextField().type(ZIP);

        user.wait2Seconds();

        paypalCKO.getPhoneNumberTextField().type(phoneNumber);
        paypalCKO.getEmailTextField().type(emailAddress);

        user.wait3Seconds();

        paypalCKO.clickGuestCKOSubmitButton();
        user.wait10Seconds();

        user.wait10Seconds();
        
        logger.get().info("\n" + "### ### ### COMPLETED: " + className + "\n");
    }

/*----------------------------------------------------------------------------------------------------------------------
 TEARDOWN
----------------------------------------------------------------------------------------------------------------------*/

    @AfterClass
    public void shutdownLocalServer() throws Exception {
        TestServerUtils.stopServer();
    }

}


