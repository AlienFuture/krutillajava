/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Repositories;

import csapat3.krutillazs.beadando.Abstracts.AbstractRepository;
import csapat3.krutillazs.beadando.Interfaces.Repository.Addable;
import csapat3.krutillazs.beadando.Interfaces.Repository.Deletable;
import csapat3.krutillazs.beadando.Models.Enums.Gender;
import csapat3.krutillazs.beadando.Models.Guest;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author balazsvamos
 */
public class GuestRepository extends AbstractRepository<Guest, Integer> implements Addable<Guest>, Deletable<Guest>{

    @Override
    public Guest findById(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Guest> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Guest findById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Guest guest) {
        try {
            String sql = "INSERT INTO guests (firstname, lastname, phone, address, birthday, stay_at, stay_until) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, guest.getFirstName());
            statement.setString(2, guest.getLastName());
            statement.setString(3, guest.getPhoneNumber());
            statement.setString(4, guest.getAddress());
            statement.setDate(5, new java.sql.Date(guest.getBirthday().getTime()));
            statement.setDate(6, new java.sql.Date(guest.getStayFromDate().getTime()));
            statement.setDate(7, new java.sql.Date(guest.getStayUntilDate().getTime()));
            
            return statement.executeUpdate() > 0;
            
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public void remove(Guest entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
