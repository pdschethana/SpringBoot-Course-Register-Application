package lk.ijse.cmjd110.courseRegisterPro.controller.common;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
public class  StudentController {

    // field injection
    //@Autowired
    //private StudentService studentService;
    private final StudentService studentService;
// constructor injection
    //public StudentController(StudentService studentService) {
    //this.studentService = studentService;
    //}

    // Save student data
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> saveStudent(@RequestBody UserDto studentDTO) {
        studentService.saveStudent(studentDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // Get a selected student
    @GetMapping(value = "{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> getSelectedStudent(@PathVariable String studentId) {
        System.out.println("Student id is " + studentId);
        //var studentServiceIMPL=new StudentServiceIMPL();

        try {
            var selectedStudent = new UserDto();
            selectedStudent = studentService.getSelectedStudent(studentId);
            return new ResponseEntity<>(selectedStudent, HttpStatus.OK);
        } catch (Exception ex) {
            // Todo: insert a log message
            ex.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }


    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<UserDto>> getAllStudent() {

        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<Void> updateStudent(@RequestParam("id") String studentId, @RequestBody UserDto toBeUpdatedStudentDetails) {

        try {
            studentService.updateStudent(studentId, toBeUpdatedStudentDetails);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String studentId) {
        try {
            studentService.deleteStudent(studentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}

