package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AdminServiceIMPL implements AdminService {

    @Override
    public void saveAdmin(UserDto admin) {

    }

    @Override
    public UserDto getSelectedAdmin(String adminId) throws Exception {

        // Hardcoded dummy data
        UserDto selectedAdmin = new UserDto(
                "A001",
                "Sanduni",
                "Wijesinghe",
                "sanduni@example.com",
                "No. 222",
                "Ocean Road",
                "Sunset Avenue",
                "Matara",
                "adminPassword123",
                Role.ADMIN
        );

        if (adminId.equals(selectedAdmin.getId())) {
            return selectedAdmin;
        }
        throw new Exception("Admin not found");
    }

    @Override
    public List<UserDto> getAllAdmins() {
        List<UserDto> adminList = Arrays.asList(
                new UserDto(
                        "A001",
                        "Sanduni",
                        "Wijesinghe",
                        "sanduni@example.com",
                        "No. 222",
                        "Ocean Road",
                        "Sunset Avenue",
                        "Matara",
                        "adminPassword123",
                        Role.ADMIN
                ),
                new UserDto(
                        "A002",
                        "Dilshan",
                        "Jayawardena",
                        "dilshan@example.com",
                        "No. 333",
                        "Green Street",
                        "Market Lane",
                        "Negombo",
                        "adminPass456",
                        Role.ADMIN
                )
        );
        return adminList;
    }

    @Override
    public void updateAdmin(String adminId, UserDto toBeUpdatedAdmin) {

    }

    @Override
    public void deleteAdmin(String adminId) {

    }
}
