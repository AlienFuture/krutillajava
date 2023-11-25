/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Models;

import csapat3.krutillazs.beadando.Abstracts.AbstractModel;
import csapat3.krutillazs.beadando.Interfaces.ContainerInterface;
import csapat3.krutillazs.beadando.Services.GeneralService;
import csapat3.krutillazs.beadando.Utils.Container;
import java.util.Date;

/**
 *
 * @author balazsvamos
 */
public class Student extends AbstractModel {
    private String firstname;
    private String lastname;
    private String neptunCode;
    private Date birthday;
    private String birthdayPlace;
    private String phone;
    private String address;
    
    private String username;
    private String password;
    
    public Student() {
        super();
        this.firstname = "";
        this.lastname = "";
        this.birthday = new Date();
        this.birthdayPlace = "";
        this.phone = "";
        this.address = "";
        this.username = "";
        this.password = "";
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
    
    public void setBirthdayPlace(String place) {
        this.birthdayPlace = place;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }
    
    public void setNeptunCode(String neptun) {
        this.neptunCode = neptun;
    }
    
    public void setUserName(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        ContainerInterface container = ContainerInterface.getInstance();
        this.password = container.resolve(GeneralService.class).encryptPassword(password);
    }
    
    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }
    
    public String getNeptunCode() {
        return this.neptunCode;
    }

    public Date getBirthday() {
        return this.birthday;
    }
    
    public String getBirthdayPlace() {
        return this.birthdayPlace;
    }

    public String getAddress() {
        return this.address;
    }
    
    public String getPhoneNumber() {
        return this.phone;
    }
    
    public String getUserName() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    
}
