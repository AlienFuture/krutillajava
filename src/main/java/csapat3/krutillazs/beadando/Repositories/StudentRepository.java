/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Repositories;

import csapat3.krutillazs.beadando.Abstracts.AbstractRepository;
import csapat3.krutillazs.beadando.Interfaces.Repository.Addable;
import csapat3.krutillazs.beadando.Models.Student;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author balazsvamos
 */
public class StudentRepository extends AbstractRepository<Student, Integer> implements Addable<Student> {

    @Override
    public Student findById(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student findById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Student student) {
        try {
            String sql = "INSERT INTO students (firstname, lastname, neptun_code, birthday, birthday_place, phone, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setString(3, student.getNeptunCode());
            statement.setDate(4, new java.sql.Date(student.getBirthday().getTime()));
            statement.setString(5, student.getBirthdayPlace());
            statement.setString(6, student.getPhoneNumber());
            statement.setString(7, student.getAddress());
            
            return statement.executeUpdate() > 0;
            
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
}
