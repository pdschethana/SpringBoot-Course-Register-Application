package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd110.courseRegisterPro.dao.StudentDao;
import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.entities.StudentEntity;
import lk.ijse.cmjd110.courseRegisterPro.service.StudentService;
import lk.ijse.cmjd110.courseRegisterPro.util.EntityDTOConversionHandle;
import lk.ijse.cmjd110.courseRegisterPro.util.IDGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class StudentServiceIMPL implements StudentService {
    private final StudentDao studentDao;
    private final EntityDTOConversionHandle conversionHandle;

    @Override
    public void saveStudent(UserDto student) {
        var studentEntity=conversionHandle.toStudentEntity(student);
        studentEntity.setStudentId(IDGenerator.studentIdGen());
        studentDao.save(studentEntity);

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
return studentList;

    }

    @Override
    public void updateStudent(String studentId, UserDto toBeUpdatedStudent) {

    }

    @Override
    public void deleteStudent(String studentId) {

    }
}
