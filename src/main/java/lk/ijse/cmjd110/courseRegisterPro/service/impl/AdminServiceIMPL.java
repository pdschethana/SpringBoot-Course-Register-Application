package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.GenericUserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AdminServiceIMPL implements GenericUserService<UserDto> {

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
