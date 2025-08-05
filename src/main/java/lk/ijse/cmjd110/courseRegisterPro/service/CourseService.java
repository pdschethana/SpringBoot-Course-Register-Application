package lk.ijse.cmjd110.courseRegisterPro.service;

import lk.ijse.cmjd110.courseRegisterPro.dto.CourseDTO;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;

import java.util.List;

public interface CourseService {
    void saveCourse(CourseDTO course);
    CourseDTO getSelectedCourse(String courseId) throws Exception;



    List<CourseDTO> getAllCourses();

    void updateCourse(String courseId, CourseDTO toBeUpdatedCourse);
    void deleteCourse(String courseId);
}
