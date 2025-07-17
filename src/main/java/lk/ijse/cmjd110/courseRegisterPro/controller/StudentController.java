package lk.ijse.cmjd110.courseRegisterPro.controller;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    // handle student's detail as crud operation
    // save data students

    @PostMapping(consumes = "application/json", produces = "application/json")

    //(consumes = MediaType.APPLICATION_JSON_VALUE,Produces=MediaType.APPLICATION_JSON_VALUE)

public ResponseEntity<UserDto> saveStudent(@RequestBody UserDto userDto ){

    return new ResponseEntity<>(userDto,HttpStatus.CREATED);
}


}
