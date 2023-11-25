/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Models.Student;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Repositories.StudentRepository;

/**
 *
 * @author balazsvamos
 */
public class StudentService {
    private final DatabaseManager databaseManager = DatabaseManager.getInstance();
    private final StudentRepository repository = new StudentRepository();
    
    public boolean addStudent(Student student) {
        return repository.add(student);
    }
}
