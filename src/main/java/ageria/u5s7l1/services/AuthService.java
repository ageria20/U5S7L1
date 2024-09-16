package ageria.u5s7l1.services;


import ageria.u5s7l1.dto.EmployeeLoginDTO;
import ageria.u5s7l1.entities.Employee;
import ageria.u5s7l1.exception.UnauthorizedException;
import ageria.u5s7l1.security.JWTTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    JWTTools jwtTools;

    public String checkCredentialAndGenerateToken(EmployeeLoginDTO body) {
        Employee found = this.employeeService.findFromEmail(body.email());
        if (found.getPassword().equals(body.password())) {
            return jwtTools.createToken(found);
        } else {
            throw new UnauthorizedException("CREDENTIAL ARE NOT VALID");
        }
    }

}
