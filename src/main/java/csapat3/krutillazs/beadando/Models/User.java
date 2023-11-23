/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Models;

import csapat3.krutillazs.beadando.Abstracts.AbstractModel;
import csapat3.krutillazs.beadando.Interfaces.ContainerInterface;
import csapat3.krutillazs.beadando.Services.GeneralService;

/**
 *
 * @author balazsvamos
 */
public class User extends AbstractModel {

    // database column name
    public static final String FIELD_USERNAME = "username";
    public static final String FIELD_LASTNAME = "lastname";
    public static final String FIELD_FIRSTNAME = "firstname";
    public static final String FIELD_PASSWORD = "password";

    private String username;
    private String password;
    private String firstname;
    private String lastname;

    public User() {
        super();
        this.username = "";
        this.password = "";
        this.firstname = "";
        this.lastname = "";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    
    public String getFullName() {
        return String.format("%s %s", lastname, firstname);
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        ContainerInterface container = ContainerInterface.getInstance();
        password = container.resolve(GeneralService.class).encryptPassword(password);

        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
