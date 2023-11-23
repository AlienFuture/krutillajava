/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Models.Message;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Repositories.MessageOfDayRepository;
import csapat3.krutillazs.beadando.Repositories.UserRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author balazsvamos
 */
public class MessageService {
        private final DatabaseManager databaseManager = DatabaseManager.getInstance();
        private final MessageOfDayRepository messageRepository = new MessageOfDayRepository();
        
        public List<Message> getAllMessages() throws SQLException {
            return messageRepository.findAll();
        }
        
        public String getLatestMessageContent() throws SQLException {
            return messageRepository.findLatest().getContent();
        }
}
