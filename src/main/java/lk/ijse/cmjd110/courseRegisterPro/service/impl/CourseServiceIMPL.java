package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import lk.ijse.cmjd110.courseRegisterPro.dto.CourseDTO;
import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.CourseService;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
@Service

public class CourseServiceIMPL implements CourseService {
    @Override
    public void saveCourse(CourseDTO course) {

    }

    @Override
    public CourseDTO getSelectedCourse(String courseId) throws Exception {
        CourseDTO selectedCourse = new CourseDTO(
                "C001",
                "CS101",
                "Introduction to Programming",
                "Learn the basics of programming using Java.",
                3,
                "Monday",
                LocalTime.of(9, 0),
                LocalTime.of(11, 0),
                "L001"

        );

        if (courseId.equals(selectedCourse.getCourseId())){
            return selectedCourse;
        }

        throw new Exception("Course not found");
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        List<CourseDTO> courseList = Arrays.asList(
                new CourseDTO(
                        "C001",
                        "CS101",
                        "Introduction to Programming",
                        "Learn the basics of programming using Java.",
                        3,
                        "Monday",
                        LocalTime.of(9, 0),
                        LocalTime.of(11, 0),
                        "L001"
                ),
                new CourseDTO(
                        "C002",
                        "CS102",
                        "Data Structures",
                        "Study arrays, linked lists, stacks, queues, trees, and graphs.",
                        4,
                        "Wednesday",
                        LocalTime.of(10, 0),
                        LocalTime.of(12, 0),
                        "L002"
                ),
                new CourseDTO(
                        "C003",
                        "CS201",
                        "Database Systems",
                        "Understand relational databases, normalization, and SQL.",
                        3,
                        "Friday",
                        LocalTime.of(13, 30),
                        LocalTime.of(15, 30),
                        "L003"
                )
        );
        return courseList;
    }



    @Override
    public void updateCourse(String courseId, CourseDTO toBeUpdatedCourse) {

    }

    @Override
    public void deleteCourse(String courseId) {

    }
}
