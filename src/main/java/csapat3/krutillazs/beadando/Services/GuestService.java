/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Enums.LogType;
import csapat3.krutillazs.beadando.Models.Guest;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Repositories.GuestRepository;
import csapat3.krutillazs.beadando.Utils.Logger;

/**
 *
 * @author balazsvamos
 */
public class GuestService {
    private final DatabaseManager databaseManager = DatabaseManager.getInstance();
    private final GuestRepository guestRepository = new GuestRepository();
    
    public boolean addGuest(Guest guest) {
        Logger.log("Adding guest using Service", LogType.INFO);
        return guestRepository.add(guest);
    }
    
}
