package lk.ijse.cmjd110.courseRegisterPro.controller.common;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.GenericUserService;
import lk.ijse.cmjd110.courseRegisterPro.service.impl.LecturerServiceIMPL;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/lecturer")

public class LecturerController extends  GenericController<UserDto>{
@Autowired

    protected LecturerController(LecturerServiceIMPL lecturerService) {
        super(lecturerService);
    }
}
