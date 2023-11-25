/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Models;

import csapat3.krutillazs.beadando.Abstracts.AbstractModel;
import csapat3.krutillazs.beadando.Models.Enums.Gender;
import java.util.Date;


/**
 *
 * @author balazsvamos
 */
public class Guest extends AbstractModel {
    private String firstname;
    private String lastname;
    private Date birthday;
    private String phone;
    private String address;
    private Date stayFrom;
    private Date stayUntil;
    
    public Guest() {
        super();
        this.firstname = "";
        this.lastname = "";
        this.birthday = new Date();
        this.phone = "";
        this.address = "";
        this.stayFrom = new Date();
        this.stayUntil = new Date();
    }
    
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }


    public void setStayFrom(Date stayFrom) {
        this.stayFrom = stayFrom;
    }    

    public void setStayUntil(Date stayUntil) {
        this.stayUntil = stayUntil;
    }
    
    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public String getAddress() {
        return this.address;
    }
    
    public String getPhoneNumber() {
        return this.phone;
    }
 
    
    public Date getStayFromDate() {
        return this.stayFrom;
    }      

    public Date getStayUntilDate() {
        return this.stayUntil;
    }      

    public String getFullName() {
        return String.format("% %", this.firstname, this.lastname);
    }
    
}
