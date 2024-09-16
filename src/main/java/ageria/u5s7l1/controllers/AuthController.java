package ageria.u5s7l1.controllers;

import ageria.u5s7l1.dto.EmployeeLoginDTO;
import ageria.u5s7l1.dto.EmployeeLoginRespDTO;
import ageria.u5s7l1.services.AuthService;
import ageria.u5s7l1.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    EmployeeService empplyeeService;

    @Autowired
    AuthService authService;


    @PostMapping("/login")
    public EmployeeLoginRespDTO login(@RequestBody EmployeeLoginDTO employeeLoginDTO) {
        return new EmployeeLoginRespDTO(this.authService.checkCredentialAndGenerateToken(employeeLoginDTO));
    }
}
