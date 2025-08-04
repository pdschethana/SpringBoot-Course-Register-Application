package lk.ijse.cmjd110.courseRegisterPro.controller;

import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.StudentService;
import lk.ijse.cmjd110.courseRegisterPro.service.impl.StudentServiceIMPL;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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
    public ResponseEntity<UserDto> saveStudent(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    // Get a selected student
    @GetMapping(value="{studentId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> getSelectedStudent(@PathVariable String studentId) {
        System.out.println("Student id is " + studentId);
        //var studentServiceIMPL=new StudentServiceIMPL();

        try{
            var selectedStudent=new UserDto();
             selectedStudent=studentService.getSelectedStudent(studentId);
            return new ResponseEntity<>(selectedStudent,HttpStatus.OK);
        }catch (Exception ex){
            // Todo: insert a log message
            ex.printStackTrace();
           return  new ResponseEntity<>(HttpStatus.BAD_REQUEST) ;
        }



    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<UserDto>> getAllStudent() {
        List<UserDto> studentList = Arrays.asList(
                new UserDto(
                        "U001",
                        "Supuni",
                        "Chethana",
                        "supuni@example.com",
                        "No. 123",
                        "Main Street",
                        "Ward Place",
                        "Colombo",
                        "securePassword123",
                        Role.STUDENT
                ),
                new UserDto(
                        "U002",
                        "Kasun",
                        "Perera",
                        "kasun@example.com",
                        "No. 456",
                        "Park Avenue",
                        "Liberty Circle",
                        "Galle",
                        "password456",
                        Role.STUDENT
                ),
                new UserDto(
                        "U003",
                        "Nadeesha",
                        "Fernando",
                        "nadeesha@example.com",
                        "No. 789",
                        "River Road",
                        "Palm Grove",
                        "Kandy",
                        "mypassword789",
                        Role.STUDENT
                )
        );

        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    @PatchMapping
    public void updateStudent(@RequestParam ("stuId") String studentId,@RequestParam String stuCity,@RequestBody UserDto toBeUpdatedStudentDetails){
        System.out.println("Student ID" +studentId);
        System.out.println("student city" +stuCity);
        System.out.println("To be updated students Details"+toBeUpdatedStudentDetails);
    }
    @DeleteMapping
    public void deleteStudent(@RequestHeader("X-studentId") String studentId){
        System.out.println("To be deleted ID : " +studentId);
    }

}
