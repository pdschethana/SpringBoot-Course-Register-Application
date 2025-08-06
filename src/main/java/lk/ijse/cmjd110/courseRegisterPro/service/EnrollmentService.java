package lk.ijse.cmjd110.courseRegisterPro.service;

import lk.ijse.cmjd110.courseRegisterPro.dto.EnrollmentDTO;

import java.util.List;

public interface EnrollmentService {

    void saveEnrollment(EnrollmentDTO enrollment); // ✅ Return type fixed

    EnrollmentDTO getSelectedEnrollment(String enrollmentId) throws Exception; // ✅ Type changed from UserDto

    List<EnrollmentDTO> getAllEnrollments(); // ✅ Match the method name with implementation

    void updateEnrollment(String enrollmentId, EnrollmentDTO toBeUpdatedEnrollment);

    void deleteEnrollment(String enrollmentId);
}
