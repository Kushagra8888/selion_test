![ @](https://www.getcontrol.co/wp-content/uploads/2016/01/dark-medium-transparent.png)
![](http://paypal.github.io/SeLion/images/selion-horiz-notag.svg)





# ControlBoard UI Automation project:
 
Project based on open source automation framework named SeLion - 
Selenium WebDriver API implementation developed and supported by PayPal engineers.

## Resources (PayPal.SeLion):

* [Quick Start and Docs](http://paypal.github.io/SeLion/html/documentation.html#what-is-selion)
* [SeLion Introduction](http://www.symbio.com/solutions/quality-assurance/selion-test-automation/)
* [Source files on GitHub](https://github.com/paypal/SeLion)
* [Dev talk on Gitter](https://gitter.im/paypal/SeLion)

## What’s in SeLion?

* WebDriver – Makes direct calls to the browser using each browser’s native support for automation
* IOS-Driver – Automate any IOS native, hybrid, or mobile web application
* Selendroid – A test automation framework which drives off the UI of Android native and hybrid applications
* Maven – A software project management and comprehension tool
* TestNG – A testing framework using annotations to provide a more powerful way to test your code in various ways: unit, regression, functional, integration and more

## How SeLion Works

SeLion uses Page Objects as a base methodology, commonly recommended by the Selenium community. 
Page element identifiers are not hard coded in the test cases but outlined in a YAML page definition file which is converted into a Java class which can then be referred to in test cases. 

If the page element changes, the classes get regenerated. 
Multiple teams accessing the same classes, don’t have to change anything in their test case code, removing the need to re-write or maintain the base page classes.


# Selenium Grid configuration

Selenium Grid with browser nodes can be configured via Docker containers.
See step by step guide how to download and run containers on Confluence: 


* [Run Selenium Hub as a Docker container](https://getcontrol.atlassian.net/wiki/display/ENG/Run+Selenium+Hub+as+a+Docker+container)


# Resources (Control):

* Steps to run LOCAL test:                                          
``
mvn clean test -DsuiteXmlFile=src/test/resources/YourTestSuiteFile.xml -DBase_Url=https://int-controlboard.getcontrol.co
``

* Steps to run REMOTE test:  
         
  We will be running tests via Jenkins job with tests pointing to Selenium Grid configured above.
  
  

    

