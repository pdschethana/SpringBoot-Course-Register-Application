package lk.ijse.cmjd110.courseRegisterPro.controller;

import lk.ijse.cmjd110.courseRegisterPro.dto.EnrollmentDTO;
import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/enrollment")
@RequiredArgsConstructor
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    // Save enrollment
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EnrollmentDTO> saveEnrollment(@RequestBody EnrollmentDTO enrollment) {
        return new ResponseEntity<>(enrollment, HttpStatus.CREATED);
    }

    // Get a selected enrollment
    @GetMapping(value = "{enrollmentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EnrollmentDTO> getSelectedEnrollment(@PathVariable String enrollmentId) {
        System.out.println("Enrollment Id is " + enrollmentId);
        try {
            EnrollmentDTO selectedEnrollment = enrollmentService.getSelectedEnrollment(enrollmentId);
            return new ResponseEntity<>(selectedEnrollment, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // Get all enrollments
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EnrollmentDTO>> getAllEnrollment() {
        return new ResponseEntity<>(enrollmentService.getAllEnrollments(), HttpStatus.OK);
    }

    // Update enrollment
    @PatchMapping
    public void updateStudent(@RequestParam ("enrollmentId") String enrolmentId,@RequestBody EnrollmentDTO toBeUpdatedEnrollmentDetails){
        System.out.println("Enrolment ID" +enrolmentId);

        System.out.println("To be updated enrollment Details"+toBeUpdatedEnrollmentDetails);
    }
    // Delete enrollment
    @DeleteMapping
    public void deleteEnrollment(@RequestHeader("X-enrollmentId") String enrollmentId){
        System.out.println("To be deleted ID : " +enrollmentId);
    }

}
