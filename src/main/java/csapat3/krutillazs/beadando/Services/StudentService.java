/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Enums.LogType;
import csapat3.krutillazs.beadando.Models.Student;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Repositories.StudentRepository;
import csapat3.krutillazs.beadando.Utils.Logger;

/**
 *
 * @author balazsvamos
 */
public class StudentService {
    private final DatabaseManager databaseManager = DatabaseManager.getInstance();
    private final StudentRepository repository = new StudentRepository();
    
    public boolean addStudent(Student student) {
         Logger.log("Adding student using Service", LogType.INFO);
        return repository.add(student);
    }
}
