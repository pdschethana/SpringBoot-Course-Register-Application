package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.LecturerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LecturerServiceIMPL implements LecturerService {

    @Override
    public void saveLecture(UserDto lecturer) {
        // Save logic (dummy for now)
    }




    @Override
    public UserDto getSelectedLecturer(String lecturerId) throws Exception {
        UserDto selectedLecturer = new UserDto(
                "L001",
                "Supuni",
                "Chethana",
                "supuni@example.com",
                "No. 123",
                "Main Street",
                "Ward Place",
                "Colombo",
                "securePassword123",
                Role.LECTURER
        );

        if (lecturerId.equals(selectedLecturer.getId())) {
            return selectedLecturer;
        }

        throw new Exception("Lecturer not found");
    }

    @Override
    public List<UserDto> getAllLecturers() {
        List<UserDto> lecturerList = Arrays.asList(
                new UserDto(
                        "L001",
                        "Supuni",
                        "Chethana",
                        "supuni@example.com",
                        "No. 123",
                        "Main Street",
                        "Ward Place",
                        "Colombo",
                        "securePassword123",
                        Role.LECTURER
                ),
                new UserDto(
                        "L002",
                        "Kasun",
                        "Perera",
                        "kasun@example.com",
                        "No. 456",
                        "Park Avenue",
                        "Liberty Circle",
                        "Galle",
                        "password456",
                        Role.LECTURER
                ),
                new UserDto(
                        "L003",
                        "Nadeesha",
                        "Fernando",
                        "nadeesha@example.com",
                        "No. 789",
                        "River Road",
                        "Palm Grove",
                        "Kandy",
                        "mypassword789",
                        Role.LECTURER
                )
        );
        return lecturerList;
    }

    @Override
    public void updateLecturer(String lecturerId, UserDto toBeUpdatedLecturer) {
        // Update logic (dummy for now)
    }

    @Override
    public void deleteLecturer(String lecturerId) {
        // Delete logic (dummy for now)
    }
}
