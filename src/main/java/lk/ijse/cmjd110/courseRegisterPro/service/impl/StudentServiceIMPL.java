package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceIMPL implements StudentService {

    @Override
    public void saveStudent(UserDto student) {

    }

    @Override
    public UserDto getSelectedStudent(String studentId) throws Exception {


        // Hardcoded dummy data

        //return new UserDto                 can write like this . inline variable.
        UserDto selectedStudent = new UserDto(
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
        if (studentId.equals(selectedStudent.getUserId())) {

            return selectedStudent;
        }
        throw new Exception("Student not found");
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
