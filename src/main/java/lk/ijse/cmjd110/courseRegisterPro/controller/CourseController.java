package lk.ijse.cmjd110.courseRegisterPro.controller;

import lk.ijse.cmjd110.courseRegisterPro.dto.CourseDTO;
import lk.ijse.cmjd110.courseRegisterPro.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/course")
@RequiredArgsConstructor

public class CourseController {
    private final CourseService courseService;
    @PostMapping
    public ResponseEntity<CourseDTO>savecourse(@RequestBody CourseDTO courseDTO){
        return new ResponseEntity<>(courseDTO , HttpStatus.CREATED);
    }
    @GetMapping("{courseId}")
    public ResponseEntity<CourseDTO>getSelectedCourse(@PathVariable String courseId){
        try{
            courseService.getSelectedCourse(courseId);
            return new ResponseEntity<>(courseService.getSelectedCourse(courseId) ,HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping
    public ResponseEntity<List<CourseDTO>>getAllCourses(){
       return new ResponseEntity<>(courseService.getAllCourses(),HttpStatus.OK);
    }
    @DeleteMapping ("{courseId}")
    public void deleteCourse(@PathVariable String courseId){

    }
    @PatchMapping ("{courseId}")
    public void updateCourse(@PathVariable String courseId,CourseDTO courseDTO){

    }

}
