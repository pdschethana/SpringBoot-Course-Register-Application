package lk.ijse.cmjd110.courseRegisterPro.controller.common;

import lk.ijse.cmjd110.courseRegisterPro.dto.UserDto;
import lk.ijse.cmjd110.courseRegisterPro.service.GenericUserService;
import lk.ijse.cmjd110.courseRegisterPro.service.impl.AdminServiceIMPL;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/admin")

public class AdminController extends GenericController<UserDto>{


    protected AdminController(AdminServiceIMPL adminServiceIMPL) {
        super(adminServiceIMPL);
    }
}









