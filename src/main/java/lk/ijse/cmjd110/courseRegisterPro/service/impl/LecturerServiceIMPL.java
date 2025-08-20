package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.cmjd110.courseRegisterPro.dao.LecturerDao;
import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.GenericUserService;
import lk.ijse.cmjd110.courseRegisterPro.util.EntityDTOConversionHandle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor

public class LecturerServiceIMPL implements GenericUserService<UserDto> {
   private final LecturerDao lecturerDao;
   private final EntityDTOConversionHandle entityDTOConversionHandle;


    @Override
    public void saveUser(UserDto admin) {
    }

    @Override
    public UserDto getSelectedUser(String adminId) throws Exception {
        return null;
    }

    @Override
    public List<UserDto> getAllUser() {
        return List.of();
    }

    @Override
    public void updateUser(String adminId, UserDto toBeUpdatedAdmin) {
    }

    @Override
    public void deleteUser(String adminId) {
    }
}
