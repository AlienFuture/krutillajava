/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Models.Guest;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Repositories.GuestRepository;

/**
 *
 * @author balazsvamos
 */
public class GuestService {
    private final DatabaseManager databaseManager = DatabaseManager.getInstance();
    private final GuestRepository guestRepository = new GuestRepository();
    
    public boolean addGuest(Guest guest) {
        return guestRepository.add(guest);
    }
    
}
