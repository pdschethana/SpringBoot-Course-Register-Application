package lk.ijse.cmjd110.courseRegisterPro.service;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;

import java.util.List;

public interface GenericUserService<T> {
     void saveUser(T admin);
    T getSelectedUser(String adminId) throws Exception;



    List<T> getAllUser();

    void updateUser(String adminId, T toBeUpdatedAdmin);
    void deleteUser(String adminId);
}
