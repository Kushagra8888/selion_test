/*-------------------------------------------------------------------------------------------------------------------*\
|  Copyright (C) 2014 PayPal                                                                                          |
|                                                                                                                     |
|  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     |
|  with the License.                                                                                                  |
|                                                                                                                     |
|  You may obtain a copy of the License at                                                                            |
|                                                                                                                     |
|       http://www.apache.org/licenses/LICENSE-2.0                                                                    |
|                                                                                                                     |
|  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   |
|  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  |
|  the specific language governing permissions and limitations under the License.                                     |
\*-------------------------------------------------------------------------------------------------------------------*/

package com.selion.framework.dataobjects;

/**
 * This is a simple POJO (Plain Old Java Object) that represents the information that is stored
 * in the excel workbook located @ src/test/resources/testdata/MyDataFile.xls.
 * The class name is intentionally named to match with the worksheet "SimpleData" in the above
 * mentioned spreadsheet, because that is how SimpleExcelDataProvider}
 * will understand as to what sheet to read data from.
 */
public class PayPalData {

    private String cardNumber;
    private String expiryDate;
    private String csc;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String emailAddress;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCsc() {
        return csc;
    }

    public void setCsc(String csc) {
        this.csc = csc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder("PayPalData{");
        sb.append("carNumber='").append(cardNumber).append(';')
            .append("expiryDate='").append(expiryDate).append(';')
            .append("csc='").append(csc).append(';')
            .append("firstName='").append(firstName).append(';')
            .append("lastName='").append(lastName).append(';')
            .append("streetAddress='").append(streetAddress).append(';')
            .append("city='").append(city).append(';')
            .append("state='").append(state).append(';')
            .append("zip='").append(zip).append(';')
            .append("phoneNumber='").append(phoneNumber).append(';')
            .append("emailAddress='").append(emailAddress).append(';')
            .append("}");
        return sb.toString();
    }
}
