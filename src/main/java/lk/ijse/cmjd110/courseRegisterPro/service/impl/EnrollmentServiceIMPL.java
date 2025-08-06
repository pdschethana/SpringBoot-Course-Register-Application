package lk.ijse.cmjd110.courseRegisterPro.service.impl;

import lk.ijse.cmjd110.courseRegisterPro.dto.EnrollmentDTO;
import lk.ijse.cmjd110.courseRegisterPro.dto.Role;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.EnrollmentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EnrollmentServiceIMPL implements EnrollmentService {

    @Override
    public void saveEnrollment(EnrollmentDTO enrollment) {

    }

    @Override
    public EnrollmentDTO getSelectedEnrollment(String enrollmentId) throws Exception {
        EnrollmentDTO selectedEnrollment = new EnrollmentDTO(
                "E001",
                "U001",
                "C001",
                "2024-08-01",
                "95",
                "A"
        );

        if (enrollmentId.equals(selectedEnrollment.getEnrollId())) {
            return selectedEnrollment;
        }

        throw new Exception("Enrollment not found");
    }

    @Override
    public List<EnrollmentDTO> getAllEnrollments() {
        List<EnrollmentDTO> enrollmentList = Arrays.asList(
                new EnrollmentDTO(
                        "E001",
                        "U001",
                        "C001",
                        "2024-08-01",
                        "95",
                        "A"
                ),
                new EnrollmentDTO(
                        "E002",
                        "U001",
                        "C001",
                        "2024-08-04",
                        "80",
                        "A"
                ),
                new EnrollmentDTO(
                        "E003",
                        "U001",
                        "C001",
                        "2024-08-06",
                        "87",
                        "A"
                )

        );
        return  enrollmentList;
    }

    @Override
    public void updateEnrollment(String enrollmentId, EnrollmentDTO toBeUpdatedEnrollment) {
        System.out.println("Updating enrollment ID: " + enrollmentId);
        System.out.println("New enrollment data: " + toBeUpdatedEnrollment);
    }

    @Override
    public void deleteEnrollment(String enrollmentId) {
        System.out.println("Deleting enrollment ID: " + enrollmentId);
    }
}
