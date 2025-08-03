package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceIMPL implements StudentService {

    @Override
    public void saveStudent(UserDto student) {

    }

    @Override
    public UserDto getSelectedStudent(String studentId) {



        // Hardcoded dummy data

        //return new UserDto                 can write like this . inline variable.
        var userDto = new UserDto(
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
        );
 return userDto;
    }

    @Override
    public List<UserDto> getAllStudents() {
        return List.of();
    }

    @Override
    public void updateStudent(String studentId, UserDto toBeUpdatedStudent) {

    }

    @Override
    public void deleteStudent(String studentId) {

    }
}
