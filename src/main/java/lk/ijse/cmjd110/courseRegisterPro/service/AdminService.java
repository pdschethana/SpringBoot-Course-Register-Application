package lk.ijse.cmjd110.courseRegisterPro.service;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;

import java.util.List;

public interface AdminService {
    void saveAdmin(UserDto admin);
    UserDto getSelectedAdmin(String adminId) throws Exception;



    List<UserDto> getAllAdmins();

    void updateAdmin(String adminId, UserDto toBeUpdatedAdmin);
    void deleteAdmin(String adminId);
}
