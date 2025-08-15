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
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class StudentServiceIMPL implements StudentService {
    private final StudentDao studentDao;
    private final EntityDTOConversionHandle conversionHandle;

    @Override
    public void saveStudent(UserDto student) {
        var studentEntity=conversionHandle.toStudentEntity(student);
        studentEntity.setId(IDGenerator.studentIdGen());
        studentDao.save(studentEntity);

    }

    @Override
    public UserDto getSelectedStudent(String studentId) throws Exception {

        Optional<StudentEntity> foundStudent=studentDao.findById(studentId);
if (!foundStudent.isPresent()){
    throw new Exception("Student not found");
}
    StudentEntity selectedStudent=studentDao.getReferenceById(studentId);
    return conversionHandle.toStudentDTO(selectedStudent);


    }

    @Override
    public List<UserDto> getAllStudents() {

        return  conversionHandle.getStudentDTOList(studentDao.findAll());

    }

    @Override
    public void updateStudent(String studentId, UserDto toBeUpdatedStudent) throws Exception {
        Optional<StudentEntity> foundStudent=studentDao.findById(studentId);
        if (!foundStudent.isPresent()){
            throw new Exception("Student not found");
        }
        foundStudent.get().setCity(toBeUpdatedStudent.getCity());
        foundStudent.get().setEmail(toBeUpdatedStudent.getEmail());
        foundStudent.get().setFirstName(toBeUpdatedStudent.getFirstName());
        foundStudent.get().setLastName(toBeUpdatedStudent.getLastName());
        foundStudent.get().setAddressLine1(toBeUpdatedStudent.getAddressLine1());
        foundStudent.get().setAddressLine2(toBeUpdatedStudent.getAddressLine2());
        foundStudent.get().setAddressLine3(toBeUpdatedStudent.getAddressLine3());
        foundStudent.get().setPassword(toBeUpdatedStudent.getPassword());
        foundStudent.get().setRole(toBeUpdatedStudent.getRole());



    }

    @Override
    public void deleteStudent(String studentId) throws Exception {

        Optional<StudentEntity> foundStudent=studentDao.findById(studentId);
        if (!foundStudent.isPresent()){
            throw new Exception("Student not found");
        }
        studentDao.deleteById(studentId);

    }
}
