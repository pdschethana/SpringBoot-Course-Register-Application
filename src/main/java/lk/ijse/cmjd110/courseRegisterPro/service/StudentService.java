package lk.ijse.cmjd110.courseRegisterPro.service;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;

import java.util.List;

public interface StudentService {
    void saveStudent(UserDto student);
    UserDto getSelectedStudent(String studentId) throws Exception;



    List<UserDto> getAllStudents();

    void updateStudent(String studentId, UserDto toBeUpdatedStudent) throws Exception;
    void deleteStudent(String studentId) throws Exception;
}
