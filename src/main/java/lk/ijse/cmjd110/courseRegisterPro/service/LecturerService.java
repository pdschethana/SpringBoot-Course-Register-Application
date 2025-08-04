package lk.ijse.cmjd110.courseRegisterPro.service;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;

import java.util.List;

public interface LecturerService {
    void saveLecture(UserDto lecturer);
    UserDto getSelectedStudent(String lecturerId) throws Exception;


    UserDto getSelectedLecturer(String studentId) throws Exception;

    List<UserDto> getAllLecturers();

    void updateLecturer(String lecturerId, UserDto toBeUpdatedLecturer);
    void deleteLecturer(String lecturerId);
}
