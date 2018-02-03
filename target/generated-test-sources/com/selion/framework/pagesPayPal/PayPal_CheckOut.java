package com.selion.framework.pagesPayPal;

import com.paypal.selion.testcomponents.BasicPageImpl;
import com.paypal.selion.platform.html.SelectList;
import com.paypal.selion.platform.html.TextField;
import com.paypal.selion.platform.html.Button;
import com.paypal.selion.platform.html.Label;

public class PayPal_CheckOut extends BasicPageImpl {

    private TextField phoneNumberTextField;
    private Button controlqa_rest_api_1_SubscribeButton;
    private TextField passwordTextField;
    private SelectList billingStateList;
    private Button guestCheckOutButton;
    private TextField expiryValueTextField;
    private Button guestCKOSubmitButton;
    private Button controlqa_rest_api_2_BuyNowButton;
    private TextField cardNumberTextField;
    private TextField lastNameTextField;
    private TextField emailTextField;
    private TextField cvvTextField;
    private TextField firstNameTextField;
    private Button controlqa_rest_api_3_AddToCartButton;
    private TextField billingCityTextField;
    private Button loginButton;
    private TextField billingAddressTextField;
    private Button element_Label_goes_hereButton;
    private Label storeTitleLabel;
    private TextField billingZIPTextField;


     /**
     * SeLion GUI Html Object Standard
     *    
     * The naming conventions followed in SeLion for html elements are as follows,
     *
     * <alias>{corresponding class name of the html element in SeLion} where - <alias> will be the object name with its 
     * first letter in lowercase.
     * 
     * <alias>Button                For Button html element.
     * <alias>CheckBox              For Check Box html element.
     * <alias>DatePicker            For Date Picker html element.
     * <alias>Form                  For Form html element.
     * <alias>Image                 For Image html element.
     * <alias>Label                 For Label html element.
     * <alias>Link                  For Link html element.
     * <alias>RadioButton           For Radio Button html element.
     * <alias>List                  For Select List html element.
     * <alias>Table                 For Table html element.
     * <alias>TextField             For Text Field html element.
     * <alias>Container             For Container html element.
     * 
     */
     

    private static String CLASS_NAME = "PayPal_CheckOut";
    private static String PAGE_DOMAIN = "pagesPayPal";


    /**
     * Creates a new PayPal_CheckOut object
     */
    public PayPal_CheckOut() {
        super.initPage(PAGE_DOMAIN, CLASS_NAME);
    }
    
    /**
     * Creates a new PayPal_CheckOut object
     *
     * @param siteLocale
     *            The Country locale for the site you are accessing
     */
    public PayPal_CheckOut(String siteLocale) {
        super.initPage(PAGE_DOMAIN, CLASS_NAME, siteLocale);
    }

    public PayPal_CheckOut getPage() {
        return this;
    }



    /**
     * Used to get phoneNumberTextField in the page PayPal_CheckOut
     *
     * @return phoneNumberTextField
     */
    public TextField getPhoneNumberTextField() {
        TextField element = this.phoneNumberTextField;
        if(element == null) {
            this.phoneNumberTextField = new TextField(getObjectMap().get("phoneNumberTextField"), "phoneNumberTextField",
                    this);
        }
        return this.phoneNumberTextField;
    }

    /**
     * Used to set the value of phoneNumberTextField in the page PayPal_CheckOut.
     */
    public void setPhoneNumberTextFieldValue(String phoneNumber) {
        getPhoneNumberTextField().type(phoneNumber);
    }
    
    /**
     * Used to get the value of phoneNumberTextField in the page PayPal_CheckOut.
     *
     * @return text in phoneNumberTextField
     */
    public String getPhoneNumberTextFieldValue() {
        return getPhoneNumberTextField().getText();
    }



    /**
     * Used to get controlqa_rest_api_1_SubscribeButton in the page PayPal_CheckOut
     *
     * @return controlqa_rest_api_1_SubscribeButton
     */
    public Button getControlqa_rest_api_1_SubscribeButton() {
        Button element = this.controlqa_rest_api_1_SubscribeButton;
        if(element == null) {
            this.controlqa_rest_api_1_SubscribeButton = new Button(getObjectMap().get("controlqa_rest_api_1_SubscribeButton"), "controlqa_rest_api_1_SubscribeButton",
                    this);
        }
        return this.controlqa_rest_api_1_SubscribeButton;
    }

    /**
     * Used to click controlqa_rest_api_1_SubscribeButton in the page PayPal_CheckOut and check that resulting page contains expected item.
     */
    public void clickControlqa_rest_api_1_SubscribeButton(Object... expected) {
        getControlqa_rest_api_1_SubscribeButton().click(expected);
    }

    /**
     * Used to click controlqa_rest_api_1_SubscribeButton in the page PayPal_CheckOut
     */
    public void clickControlqa_rest_api_1_SubscribeButton() {
        getControlqa_rest_api_1_SubscribeButton().click();
    }

    /**
     * Used to get the value of controlqa_rest_api_1_SubscribeButton in the page PayPal_CheckOut.
     *
     * @return text in controlqa_rest_api_1_SubscribeButton
     */
    public String getControlqa_rest_api_1_SubscribeButtonValue() {
        return getControlqa_rest_api_1_SubscribeButton().getText();
    }



    /**
     * Used to get passwordTextField in the page PayPal_CheckOut
     *
     * @return passwordTextField
     */
    public TextField getPasswordTextField() {
        TextField element = this.passwordTextField;
        if(element == null) {
            this.passwordTextField = new TextField(getObjectMap().get("passwordTextField"), "passwordTextField",
                    this);
        }
        return this.passwordTextField;
    }

    /**
     * Used to set the value of passwordTextField in the page PayPal_CheckOut.
     */
    public void setPasswordTextFieldValue(String password) {
        getPasswordTextField().type(password);
    }
    
    /**
     * Used to get the value of passwordTextField in the page PayPal_CheckOut.
     *
     * @return text in passwordTextField
     */
    public String getPasswordTextFieldValue() {
        return getPasswordTextField().getText();
    }



    /**
     * Used to get billingStateList in the page PayPal_CheckOut
     *
     * @return billingStateList
     */
    public SelectList getBillingStateList() {
        SelectList element = this.billingStateList;
        if(element == null) {
            this.billingStateList = new SelectList(getObjectMap().get("billingStateList"), "billingStateList",
                    this);
        }
        return this.billingStateList;
    }

    /**
     * Used to select element in the control billingStateList based on the value.
     */
    public void selectBillingStateListByValue(String value) {
        getBillingStateList().selectByValue(value);
    }

    /**
     * Used to select element in the control billingStateList based on the label.
     */
    public void selectBillingStateListByLabel(String label) {
        getBillingStateList().selectByLabel(label);
    }

    /**
     * Used to select element in the control billingStateList based on the index
     */
    public void selectBillingStateListByIndex(int index) {
        getBillingStateList().selectByIndex(index);
    }


    /**
     * Used to get guestCheckOutButton in the page PayPal_CheckOut
     *
     * @return guestCheckOutButton
     */
    public Button getGuestCheckOutButton() {
        Button element = this.guestCheckOutButton;
        if(element == null) {
            this.guestCheckOutButton = new Button(getObjectMap().get("guestCheckOutButton"), "guestCheckOutButton",
                    this);
        }
        return this.guestCheckOutButton;
    }

    /**
     * Used to click guestCheckOutButton in the page PayPal_CheckOut and check that resulting page contains expected item.
     */
    public void clickGuestCheckOutButton(Object... expected) {
        getGuestCheckOutButton().click(expected);
    }

    /**
     * Used to click guestCheckOutButton in the page PayPal_CheckOut
     */
    public void clickGuestCheckOutButton() {
        getGuestCheckOutButton().click();
    }

    /**
     * Used to get the value of guestCheckOutButton in the page PayPal_CheckOut.
     *
     * @return text in guestCheckOutButton
     */
    public String getGuestCheckOutButtonValue() {
        return getGuestCheckOutButton().getText();
    }



    /**
     * Used to get expiryValueTextField in the page PayPal_CheckOut
     *
     * @return expiryValueTextField
     */
    public TextField getExpiryValueTextField() {
        TextField element = this.expiryValueTextField;
        if(element == null) {
            this.expiryValueTextField = new TextField(getObjectMap().get("expiryValueTextField"), "expiryValueTextField",
                    this);
        }
        return this.expiryValueTextField;
    }

    /**
     * Used to set the value of expiryValueTextField in the page PayPal_CheckOut.
     */
    public void setExpiryValueTextFieldValue(String expiryValue) {
        getExpiryValueTextField().type(expiryValue);
    }
    
    /**
     * Used to get the value of expiryValueTextField in the page PayPal_CheckOut.
     *
     * @return text in expiryValueTextField
     */
    public String getExpiryValueTextFieldValue() {
        return getExpiryValueTextField().getText();
    }



    /**
     * Used to get guestCKOSubmitButton in the page PayPal_CheckOut
     *
     * @return guestCKOSubmitButton
     */
    public Button getGuestCKOSubmitButton() {
        Button element = this.guestCKOSubmitButton;
        if(element == null) {
            this.guestCKOSubmitButton = new Button(getObjectMap().get("guestCKOSubmitButton"), "guestCKOSubmitButton",
                    this);
        }
        return this.guestCKOSubmitButton;
    }

    /**
     * Used to click guestCKOSubmitButton in the page PayPal_CheckOut and check that resulting page contains expected item.
     */
    public void clickGuestCKOSubmitButton(Object... expected) {
        getGuestCKOSubmitButton().click(expected);
    }

    /**
     * Used to click guestCKOSubmitButton in the page PayPal_CheckOut
     */
    public void clickGuestCKOSubmitButton() {
        getGuestCKOSubmitButton().click();
    }

    /**
     * Used to get the value of guestCKOSubmitButton in the page PayPal_CheckOut.
     *
     * @return text in guestCKOSubmitButton
     */
    public String getGuestCKOSubmitButtonValue() {
        return getGuestCKOSubmitButton().getText();
    }



    /**
     * Used to get controlqa_rest_api_2_BuyNowButton in the page PayPal_CheckOut
     *
     * @return controlqa_rest_api_2_BuyNowButton
     */
    public Button getControlqa_rest_api_2_BuyNowButton() {
        Button element = this.controlqa_rest_api_2_BuyNowButton;
        if(element == null) {
            this.controlqa_rest_api_2_BuyNowButton = new Button(getObjectMap().get("controlqa_rest_api_2_BuyNowButton"), "controlqa_rest_api_2_BuyNowButton",
                    this);
        }
        return this.controlqa_rest_api_2_BuyNowButton;
    }

    /**
     * Used to click controlqa_rest_api_2_BuyNowButton in the page PayPal_CheckOut and check that resulting page contains expected item.
     */
    public void clickControlqa_rest_api_2_BuyNowButton(Object... expected) {
        getControlqa_rest_api_2_BuyNowButton().click(expected);
    }

    /**
     * Used to click controlqa_rest_api_2_BuyNowButton in the page PayPal_CheckOut
     */
    public void clickControlqa_rest_api_2_BuyNowButton() {
        getControlqa_rest_api_2_BuyNowButton().click();
    }

    /**
     * Used to get the value of controlqa_rest_api_2_BuyNowButton in the page PayPal_CheckOut.
     *
     * @return text in controlqa_rest_api_2_BuyNowButton
     */
    public String getControlqa_rest_api_2_BuyNowButtonValue() {
        return getControlqa_rest_api_2_BuyNowButton().getText();
    }



    /**
     * Used to get cardNumberTextField in the page PayPal_CheckOut
     *
     * @return cardNumberTextField
     */
    public TextField getCardNumberTextField() {
        TextField element = this.cardNumberTextField;
        if(element == null) {
            this.cardNumberTextField = new TextField(getObjectMap().get("cardNumberTextField"), "cardNumberTextField",
                    this);
        }
        return this.cardNumberTextField;
    }

    /**
     * Used to set the value of cardNumberTextField in the page PayPal_CheckOut.
     */
    public void setCardNumberTextFieldValue(String cardNumber) {
        getCardNumberTextField().type(cardNumber);
    }
    
    /**
     * Used to get the value of cardNumberTextField in the page PayPal_CheckOut.
     *
     * @return text in cardNumberTextField
     */
    public String getCardNumberTextFieldValue() {
        return getCardNumberTextField().getText();
    }



    /**
     * Used to get lastNameTextField in the page PayPal_CheckOut
     *
     * @return lastNameTextField
     */
    public TextField getLastNameTextField() {
        TextField element = this.lastNameTextField;
        if(element == null) {
            this.lastNameTextField = new TextField(getObjectMap().get("lastNameTextField"), "lastNameTextField",
                    this);
        }
        return this.lastNameTextField;
    }

    /**
     * Used to set the value of lastNameTextField in the page PayPal_CheckOut.
     */
    public void setLastNameTextFieldValue(String lastName) {
        getLastNameTextField().type(lastName);
    }
    
    /**
     * Used to get the value of lastNameTextField in the page PayPal_CheckOut.
     *
     * @return text in lastNameTextField
     */
    public String getLastNameTextFieldValue() {
        return getLastNameTextField().getText();
    }



    /**
     * Used to get emailTextField in the page PayPal_CheckOut
     *
     * @return emailTextField
     */
    public TextField getEmailTextField() {
        TextField element = this.emailTextField;
        if(element == null) {
            this.emailTextField = new TextField(getObjectMap().get("emailTextField"), "emailTextField",
                    this);
        }
        return this.emailTextField;
    }

    /**
     * Used to set the value of emailTextField in the page PayPal_CheckOut.
     */
    public void setEmailTextFieldValue(String email) {
        getEmailTextField().type(email);
    }
    
    /**
     * Used to get the value of emailTextField in the page PayPal_CheckOut.
     *
     * @return text in emailTextField
     */
    public String getEmailTextFieldValue() {
        return getEmailTextField().getText();
    }



    /**
     * Used to get cvvTextField in the page PayPal_CheckOut
     *
     * @return cvvTextField
     */
    public TextField getCvvTextField() {
        TextField element = this.cvvTextField;
        if(element == null) {
            this.cvvTextField = new TextField(getObjectMap().get("cvvTextField"), "cvvTextField",
                    this);
        }
        return this.cvvTextField;
    }

    /**
     * Used to set the value of cvvTextField in the page PayPal_CheckOut.
     */
    public void setCvvTextFieldValue(String cvv) {
        getCvvTextField().type(cvv);
    }
    
    /**
     * Used to get the value of cvvTextField in the page PayPal_CheckOut.
     *
     * @return text in cvvTextField
     */
    public String getCvvTextFieldValue() {
        return getCvvTextField().getText();
    }



    /**
     * Used to get firstNameTextField in the page PayPal_CheckOut
     *
     * @return firstNameTextField
     */
    public TextField getFirstNameTextField() {
        TextField element = this.firstNameTextField;
        if(element == null) {
            this.firstNameTextField = new TextField(getObjectMap().get("firstNameTextField"), "firstNameTextField",
                    this);
        }
        return this.firstNameTextField;
    }

    /**
     * Used to set the value of firstNameTextField in the page PayPal_CheckOut.
     */
    public void setFirstNameTextFieldValue(String firstName) {
        getFirstNameTextField().type(firstName);
    }
    
    /**
     * Used to get the value of firstNameTextField in the page PayPal_CheckOut.
     *
     * @return text in firstNameTextField
     */
    public String getFirstNameTextFieldValue() {
        return getFirstNameTextField().getText();
    }



    /**
     * Used to get controlqa_rest_api_3_AddToCartButton in the page PayPal_CheckOut
     *
     * @return controlqa_rest_api_3_AddToCartButton
     */
    public Button getControlqa_rest_api_3_AddToCartButton() {
        Button element = this.controlqa_rest_api_3_AddToCartButton;
        if(element == null) {
            this.controlqa_rest_api_3_AddToCartButton = new Button(getObjectMap().get("controlqa_rest_api_3_AddToCartButton"), "controlqa_rest_api_3_AddToCartButton",
                    this);
        }
        return this.controlqa_rest_api_3_AddToCartButton;
    }

    /**
     * Used to click controlqa_rest_api_3_AddToCartButton in the page PayPal_CheckOut and check that resulting page contains expected item.
     */
    public void clickControlqa_rest_api_3_AddToCartButton(Object... expected) {
        getControlqa_rest_api_3_AddToCartButton().click(expected);
    }

    /**
     * Used to click controlqa_rest_api_3_AddToCartButton in the page PayPal_CheckOut
     */
    public void clickControlqa_rest_api_3_AddToCartButton() {
        getControlqa_rest_api_3_AddToCartButton().click();
    }

    /**
     * Used to get the value of controlqa_rest_api_3_AddToCartButton in the page PayPal_CheckOut.
     *
     * @return text in controlqa_rest_api_3_AddToCartButton
     */
    public String getControlqa_rest_api_3_AddToCartButtonValue() {
        return getControlqa_rest_api_3_AddToCartButton().getText();
    }



    /**
     * Used to get billingCityTextField in the page PayPal_CheckOut
     *
     * @return billingCityTextField
     */
    public TextField getBillingCityTextField() {
        TextField element = this.billingCityTextField;
        if(element == null) {
            this.billingCityTextField = new TextField(getObjectMap().get("billingCityTextField"), "billingCityTextField",
                    this);
        }
        return this.billingCityTextField;
    }

    /**
     * Used to set the value of billingCityTextField in the page PayPal_CheckOut.
     */
    public void setBillingCityTextFieldValue(String billingCity) {
        getBillingCityTextField().type(billingCity);
    }
    
    /**
     * Used to get the value of billingCityTextField in the page PayPal_CheckOut.
     *
     * @return text in billingCityTextField
     */
    public String getBillingCityTextFieldValue() {
        return getBillingCityTextField().getText();
    }



    /**
     * Used to get loginButton in the page PayPal_CheckOut
     *
     * @return loginButton
     */
    public Button getLoginButton() {
        Button element = this.loginButton;
        if(element == null) {
            this.loginButton = new Button(getObjectMap().get("loginButton"), "loginButton",
                    this);
        }
        return this.loginButton;
    }

    /**
     * Used to click loginButton in the page PayPal_CheckOut and check that resulting page contains expected item.
     */
    public void clickLoginButton(Object... expected) {
        getLoginButton().click(expected);
    }

    /**
     * Used to click loginButton in the page PayPal_CheckOut
     */
    public void clickLoginButton() {
        getLoginButton().click();
    }

    /**
     * Used to get the value of loginButton in the page PayPal_CheckOut.
     *
     * @return text in loginButton
     */
    public String getLoginButtonValue() {
        return getLoginButton().getText();
    }



    /**
     * Used to get billingAddressTextField in the page PayPal_CheckOut
     *
     * @return billingAddressTextField
     */
    public TextField getBillingAddressTextField() {
        TextField element = this.billingAddressTextField;
        if(element == null) {
            this.billingAddressTextField = new TextField(getObjectMap().get("billingAddressTextField"), "billingAddressTextField",
                    this);
        }
        return this.billingAddressTextField;
    }

    /**
     * Used to set the value of billingAddressTextField in the page PayPal_CheckOut.
     */
    public void setBillingAddressTextFieldValue(String billingAddress) {
        getBillingAddressTextField().type(billingAddress);
    }
    
    /**
     * Used to get the value of billingAddressTextField in the page PayPal_CheckOut.
     *
     * @return text in billingAddressTextField
     */
    public String getBillingAddressTextFieldValue() {
        return getBillingAddressTextField().getText();
    }



    /**
     * Used to get element_Label_goes_hereButton in the page PayPal_CheckOut
     *
     * @return element_Label_goes_hereButton
     */
    public Button getElement_Label_goes_hereButton() {
        Button element = this.element_Label_goes_hereButton;
        if(element == null) {
            this.element_Label_goes_hereButton = new Button(getObjectMap().get("element_Label_goes_hereButton"), "element_Label_goes_hereButton",
                    this);
        }
        return this.element_Label_goes_hereButton;
    }

    /**
     * Used to click element_Label_goes_hereButton in the page PayPal_CheckOut and check that resulting page contains expected item.
     */
    public void clickElement_Label_goes_hereButton(Object... expected) {
        getElement_Label_goes_hereButton().click(expected);
    }

    /**
     * Used to click element_Label_goes_hereButton in the page PayPal_CheckOut
     */
    public void clickElement_Label_goes_hereButton() {
        getElement_Label_goes_hereButton().click();
    }

    /**
     * Used to get the value of element_Label_goes_hereButton in the page PayPal_CheckOut.
     *
     * @return text in element_Label_goes_hereButton
     */
    public String getElement_Label_goes_hereButtonValue() {
        return getElement_Label_goes_hereButton().getText();
    }



    /**
     * Used to get storeTitleLabel in the page PayPal_CheckOut
     *
     * @return storeTitleLabel
     */
    public Label getStoreTitleLabel() {
        Label element = this.storeTitleLabel;
        if(element == null) {
            this.storeTitleLabel = new Label(getObjectMap().get("storeTitleLabel"), "storeTitleLabel",
                    this);
        }
        return this.storeTitleLabel;
    }

    /**
     * Used to check for the specific text available in the control storeTitleLabel
     */
    public boolean isTextPresentForStoreTitleLabel(String pattern) {
        return getStoreTitleLabel().isTextPresent(pattern);
    }



    /**
     * Used to get billingZIPTextField in the page PayPal_CheckOut
     *
     * @return billingZIPTextField
     */
    public TextField getBillingZIPTextField() {
        TextField element = this.billingZIPTextField;
        if(element == null) {
            this.billingZIPTextField = new TextField(getObjectMap().get("billingZIPTextField"), "billingZIPTextField",
                    this);
        }
        return this.billingZIPTextField;
    }

    /**
     * Used to set the value of billingZIPTextField in the page PayPal_CheckOut.
     */
    public void setBillingZIPTextFieldValue(String billingZIP) {
        getBillingZIPTextField().type(billingZIP);
    }
    
    /**
     * Used to get the value of billingZIPTextField in the page PayPal_CheckOut.
     *
     * @return text in billingZIPTextField
     */
    public String getBillingZIPTextFieldValue() {
        return getBillingZIPTextField().getText();
    }

}

