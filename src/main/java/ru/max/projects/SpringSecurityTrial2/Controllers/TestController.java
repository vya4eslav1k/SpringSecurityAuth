package ru.max.projects.SpringSecurityTrial2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/welcome")
    public String welcome(){
        return "This is unprotected page";
    }

//    @GetMapping("/users")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
//    public String pageForUser(){
//        return "This is page for only users";
//    }


//    @GetMapping("/admins")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
//    public String pageForAdmins(){
//        return "This is page for only admins";
//    }


    @GetMapping("/all")
    public String pageForAll(){
        return "This is page for all employees";
    }

}
