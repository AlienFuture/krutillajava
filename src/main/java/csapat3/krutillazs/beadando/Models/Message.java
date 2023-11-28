/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Models;

import csapat3.krutillazs.beadando.Abstracts.AbstractModel;
import csapat3.krutillazs.beadando.Enums.LogType;
import csapat3.krutillazs.beadando.Utils.Logger;

/**
 *
 * @author balazsvamos
 */
public class Message extends AbstractModel {
    
    public static final String FIELD_TITLE = "title";
    public static final String FIELD_CONTENT = "content";
    
    private String title;
    private String content;
    
    public Message() {
        super();
        Logger.log("Initializing Message object", LogType.INFO);
        this.title = "";
        this.content = "";
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getTitle() {
        return this.title;
    }
    public String getContent() {
        return this.content;
    }
    
}
