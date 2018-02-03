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

    private String Country;
    private String Card;
    private String Csc;
    private String First;
    private String Last;
    private String Address;
    private String City;
    private String State;
    private String Zip;
    private String Phone;
    private String Email;


    public String getCountry () { return Country;}
    public void setCountry (String Country) { this.Country = Country; }

    public String getCard () { return Card;}
    public void setCard (String Card) { this.Card = Card; }

    public String getCsc () { return Csc;}
    public void setCsc (String Csc) { this.Csc = Csc; }

    public String getFirst () { return First;}
    public void setFirst (String First) { this.First = First; }

    public String getLast () { return Last;}
    public void setLast (String Last) { this.Last = Last; }

    public String getAddress () { return Address;}
    public void setAddress (String Address) { this.Address = Address; }

    public String getCity () { return City;}
    public void setCity (String City) { this.City = City; }

    public String getState () { return State;}
    public void setState (String State) { this.State = State; }

    public String getZip () { return Zip;}
    public void setZip (String Zip) { this.Zip = Zip; }

    public String getPhone () { return Phone;}
    public void setPhone (String Phone) { this.Phone = Phone; }

    public String getEmail () { return Email;}
    public void setEmail (String Email) { this.Email = Email; }


    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder("PayPalData{");
        sb.append(", Country='").append(Country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
