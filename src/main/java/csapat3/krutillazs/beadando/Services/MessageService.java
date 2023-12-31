/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Enums.LogType;
import csapat3.krutillazs.beadando.Models.Message;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Repositories.MessageOfDayRepository;
import csapat3.krutillazs.beadando.Repositories.UserRepository;
import csapat3.krutillazs.beadando.Utils.Logger;
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
            Logger.log("Returning all message of day from database", LogType.INFO);
            return messageRepository.findAll();
        }
        
        public String getLatestMessageContent() throws SQLException {
            Logger.log("Returning message content", LogType.INFO);
            return messageRepository.findLatest().getContent();
        }
        
        public Message getLatestMessageByTitle(String title) throws SQLException {
            Logger.log("Returning message by title", LogType.INFO);
            return messageRepository.findByTitle(title);
        }
}
