/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Repositories;

import csapat3.krutillazs.beadando.Abstracts.AbstractRepository;
import csapat3.krutillazs.beadando.Interfaces.Repository.Addable;
import csapat3.krutillazs.beadando.Interfaces.Repository.Deletable;
import csapat3.krutillazs.beadando.Interfaces.Repository.Updateable;
import csapat3.krutillazs.beadando.Models.Message;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author balazsvamos
 */
public class MessageOfDayRepository extends AbstractRepository<Message, Integer> implements Addable<Message>, Updateable<Message>, Deletable<Message>{
    @Override
    public Message findById(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Message> findAll() throws SQLException {
        List<Message> messages = new ArrayList<Message>();
        String querry = "SELECT * FROM messages";
        PreparedStatement statement = connection.prepareStatement(querry);
        
        ResultSet querryResult = statement.executeQuery();
        
        while(querryResult.next()) {
            int id = querryResult.getInt(Message.FIELD_ID);
            String title = querryResult.getString(Message.FIELD_TITLE);
            String content = querryResult.getString(Message.FIELD_CONTENT);
            String createdAt = querryResult.getString(Message.FIELD_CREATED_AT);
            String updatedAt = querryResult.getString(Message.FIELD_UPDATED_AT);
            
            Message message = new Message();
            message.setId(id);
            message.setTitle(title);
            message.setContent(content);
            message.setCreatedAt(createdAt);
            message.setUpdatedAt(updatedAt);
            messages.add(message);
        }
        
        return messages;
        
    }

    @Override
    public Message findById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Message findByTitle(String titleFilter) throws SQLException {
        Message message = new Message();
        String querry = "SELECT * FROM messages WHERE title = ? ORDER BY created_at DESC LIMIT 1";
        PreparedStatement statement = connection.prepareStatement(querry);
        statement.setString(1, titleFilter);
        
        ResultSet querryResult = statement.executeQuery();
        
        if(querryResult.next()) {
            int id = querryResult.getInt(Message.FIELD_ID);
            String title = querryResult.getString(Message.FIELD_TITLE);
            String content = querryResult.getString(Message.FIELD_CONTENT);
            String createdAt = querryResult.getString(Message.FIELD_CREATED_AT);
            String updatedAt = querryResult.getString(Message.FIELD_UPDATED_AT);
            
            message.setId(id);
            message.setTitle(title);
            message.setContent(content);
            message.setCreatedAt(createdAt);
            message.setUpdatedAt(updatedAt);
        }
        
        return message;
    }
    
    public Message findLatest() throws SQLException {
        Message message = new Message();
        String querry = "SELECT * FROM messages ORDER BY created_at DESC LIMIT 1";
        PreparedStatement statement = connection.prepareStatement(querry);
        
        ResultSet querryResult = statement.executeQuery();
        
        if(querryResult.next()) {
            int id = querryResult.getInt(Message.FIELD_ID);
            String title = querryResult.getString(Message.FIELD_TITLE);
            String content = querryResult.getString(Message.FIELD_CONTENT);
            String createdAt = querryResult.getString(Message.FIELD_CREATED_AT);
            String updatedAt = querryResult.getString(Message.FIELD_UPDATED_AT);
            
            message.setId(id);
            message.setTitle(title);
            message.setContent(content);
            message.setCreatedAt(createdAt);
            message.setUpdatedAt(updatedAt);
        }
        
        return message;
    }

    @Override
    public void add(Message entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Message entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Message entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
