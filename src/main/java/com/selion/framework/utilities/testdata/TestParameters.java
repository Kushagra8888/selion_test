/*
 * File: TC_01_LoginToControlDashboardTest.java
 * ----------------------------------------------
 * Test case for Control Dashboard > Login functionality;
 */
package com.selion.framework.utilities.testdata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;


public class TestParameters {

/*** Test accounts ***/
    //STRIPE
    public static final String testAccountStripe_Email = "selion.tests@mail.com";
    public static final String testAccountStripe_Password = "MEzz55me!";

    //PayPal
    public static final String testAccountPayPal_Email = "pp1@mail.com";
    public static final String testAccountPayPal_Password = "Testing1";

    //Square
    public static final String testAccountSquare_Email = "square.biz@mail.com";
    public static final String testAccountSquare_Password = "MEzz55me!";

/*** ControlBoard pages ***/
    //OnBoarding,
    public static final String URL_SignUp = "/signup";
    public static final String URL_Start1 =  "/start/1";
    public static final String URL_Start2 =  "/start/2";
    public static final String URL_Start3 =  "/start/3";
    public static final String URL_RecoverPassword =  "/reset-password-send-email/?email=controlqa%40mail.com";
    public static final String URL_Login =  "/login/";

    //Setting pages
    public static final String URL_setting_Account = "/settings/account";
    public static final String URL_setting_Preferences = "/settings/preferences";
    public static final String URL_setting_Upgrade = "/settings/upgrade";
    public static final String URL_setting_Billing = "/settings/billing";
    public static final String URL_setting_Password = "/settings/password";
    public static final String URL_setting_EmailUpdates = "/settings/email";

    //Charges and Customers
    public static final String URL_CUSTOMERS = "/customers";
    public static final String URL_CHARGES = "/charges";



    //Metric pages
    public static final String URL_Dashboard = "/metric/revenue";
    public static final String URL_Churn = "/metric/customer-churn";






    // Name
    public static final String spaces = "   ";
    public static final String shortfirstName = "Q";
    public static final String firstName = "John James \"Jimmy\"";
    public static final String lastName = "O'Grady";
    public static final String fullName = "John James \"Jimmy\" O'Grady";

//Emails
    //SignUp and SignIn validation emails
    public static final String badEmail1 = "badEmail1#gmailcom";
    public static final String badEmail2 = "badEmail2@gmailcom";
    public static final String emailWithLongerTLD = "brenda@LaParisBoutique.boutique"; // there was an issue where longer emails where rejected on Login page

    //Test Control accounts for various tests
    public static final String realEmail = "controlqa@mail.com";
    public static final String email_ControlQA = "controlqa@mail.com";
    public static final String email_ControlQA_SelionTests = "controlqa@selion.tests";
    public static final String email_ControlQA_iTunes = "controlqa_itunes@mail.com";
    public static final String email_ControlQA_Square = "square@control.co";
    public static final String email_Customer = "simplecustomer@mail.com";
    public static final String email_Barton = "controlqa_barton@mail.com";
    public static final String email_Square = "controlqa_square@mail.com";
    public static final String email_Portfolio = "qa.portfolio_b_@mail.com";

    //To test Plans/Upgrades/etc
    public static final String email_plans_TrialExpired = "qa.plans.TrialExpired@mail.com";
    public static final String email_plans_Starter = "qa.plans.Starter@mail.com";
    public static final String email_plans_StarterExceeded = "qa.plans.StarterExceeded@mail.com";





    //Passwords
    public static final String badPassword1 = "nocapitalltr1";
    public static final String badPassword2 = "NoNumberPass";
    public static final String badPassword3 = "Short1";
    public static final String goodPassword = "Testing1";
    public static final String password_Testing1 = "Testing1";
    public static final String password_Testing2 = "Testing2";


    public static final String goodStrongPassword = "!@#$%^&*()_+QA+_)(*&^%$#@!";

//Phone numbers
    public static final String phoneNum1 = "+44 (0) 1234 567890";
    public static final String phoneNum2 = "812-350-1234";
    public static final String phoneNum3 = "+86 8613810711234";

    //Card Info
    public static final String good_card = "4242424242424242";
    public static final String card_expiry = "0522";
    public static final String card_CVC = "424";
























}
