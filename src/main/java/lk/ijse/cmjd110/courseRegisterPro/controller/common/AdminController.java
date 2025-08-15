package lk.ijse.cmjd110.courseRegisterPro.controller.common;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    // field injection
    //@Autowired
    //private StudentService studentService;
    private final AdminService adminService;
// constructor injection
    //public StudentController(StudentService studentService) {
        //this.studentService = studentService;
    //}

    // Save student data
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDto> saveAdmin(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    // Get a selected student
    @GetMapping(value="{adminId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> getSelectedAdmin(@PathVariable String adminId) {
        System.out.println("Admin id is " + adminId);
        //var studentServiceIMPL=new StudentServiceIMPL();

        try{
            var selectedAdmin=new UserDto();
             selectedAdmin=adminService.getSelectedAdmin(adminId);
            return new ResponseEntity<>(selectedAdmin,HttpStatus.OK);
        }catch (Exception ex){
            // Todo: insert a log message
            ex.printStackTrace();
           return  new ResponseEntity<>(HttpStatus.BAD_REQUEST) ;
        }



    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<UserDto>> getAllAdmin() {

        return new ResponseEntity<>(adminService.getAllAdmins(), HttpStatus.OK);
    }
    @PatchMapping
    public void updateAdmin(@RequestParam ("admId") String adminId,@RequestParam String admCity,@RequestBody UserDto toBeUpdatedAdminDetails){
        System.out.println("Admin ID" +adminId);
        System.out.println("admin city" +admCity);
        System.out.println("To be updated admin Details"+toBeUpdatedAdminDetails);
    }
    @DeleteMapping
    public void deleteAdmin(@RequestHeader("X-adminId") String adminId){
        System.out.println("To be deleted ID : " +adminId);
    }

}
