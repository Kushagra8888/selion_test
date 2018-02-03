/*
 File: CommonActions.java
 ----------------------------------------------
 This class used for storing common user actions like Login to Applications, etc.
 */
package com.selion.framework.common_actions;

    import com.paypal.selion.platform.grid.Grid;
    import com.selion.framework.utilities.testdata.TestParameters;
    import com.selion.framework.*;
    import com.selion.framework.common_actions.*;

    import java.util.Calendar;


public class CommonActions {

/*----------------------------------------------------------------------------------------------------------------------
 CONFIGURATION AND SETUP
----------------------------------------------------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------------------------------------------------
 TEST SNIPPETS
----------------------------------------------------------------------------------------------------------------------*/

    /* Create "wait x seconds" snippets */
    public void wait1Second() {
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}}

    public void wait2Seconds() {
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}}

    public void wait3Seconds() {
        try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}}

    public void wait4Seconds() {
        try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}}

    public void wait5Seconds() {
        try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}}

    public void wait10Seconds() {
        try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}}









}
