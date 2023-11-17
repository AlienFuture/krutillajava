/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Models;

/**
 *
 * @author balazsvamos
 */
public class User {
    public String _username;
    private String _firstname;
    private String _lastname;
    
    public User()
    {
        
    }
    
    public User(String username, String firstname, String lastname)
    {
        this._username = username;
        this._firstname = firstname;
        this._lastname = lastname;
    }
    
    public String getFullName()
    {
        return String.format("%s %s", _firstname, _lastname);
    }
}
