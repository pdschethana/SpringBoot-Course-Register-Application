package lk.ijse.cmjd110.courseRegisterPro.controller;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.LecturerService;
import lk.ijse.cmjd110.courseRegisterPro.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/lecturer")
@RequiredArgsConstructor
public class LecturerController {

    // field injection
    //@Autowired
    //private StudentService studentService;
    private final LecturerService lecturerService;
// constructor injection
    //public StudentController(StudentService studentService) {
        //this.studentService = studentService;
    //}

    // Save student data
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDto> saveLecturer(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    // Get a selected student
    @GetMapping(value="{LecturerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> getSelectedLecturer(@PathVariable String lecturerId) {
        System.out.println("Lecturer id is " + lecturerId);
        //var studentServiceIMPL=new StudentServiceIMPL();

        try{
            var selectedLecturer=new UserDto();
             selectedLecturer=lecturerService.getSelectedStudent(lecturerId);
            return new ResponseEntity<>(selectedLecturer,HttpStatus.OK);
        }catch (Exception ex){
            // Todo: insert a log message
            ex.printStackTrace();
           return  new ResponseEntity<>(HttpStatus.BAD_REQUEST) ;
        }



    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<UserDto>> getAllLecturer() {

        return new ResponseEntity<>(lecturerService.getAllLecturers(), HttpStatus.OK);
    }
    @PatchMapping
    public void updateLecturer(@RequestParam ("lecId") String lecturerId,@RequestParam String lecCity,@RequestBody UserDto toBeUpdatedLecturerDetails){
        System.out.println("Lecturer ID" +lecturerId);
        System.out.println("Lecturer city" +lecCity);
        System.out.println("To be updated lecture Details"+toBeUpdatedLecturerDetails);
    }
    @DeleteMapping
    public void deleteLecturer(@RequestHeader("X-lecturerId") String lecturerId){
        System.out.println("To be deleted ID : " +lecturerId);
    }

}
