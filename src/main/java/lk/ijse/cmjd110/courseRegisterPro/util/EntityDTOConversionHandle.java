package lk.ijse.cmjd110.courseRegisterPro.util;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.entities.StudentEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor

public class EntityDTOConversionHandle {
     private final ModelMapper modelMapper;

     // Student
    public UserDto toStudentDTO(StudentEntity student){
        return modelMapper.map(student,UserDto.class);

    }
    public StudentEntity toStudentEntity(UserDto userDto){
        return modelMapper.map(userDto,StudentEntity.class);
    }
       public List<UserDto>getStudentDTOList(List<StudentEntity>studentEntityList){
        return modelMapper.map(studentEntityList,new TypeToken<List<UserDto>>(){}.getType());
       }

}
