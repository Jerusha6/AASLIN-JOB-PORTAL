package com.aaslin.jobportal;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    public UserData addUser(@RequestParam("name") String name, @RequestParam("resume") MultipartFile resume) throws IOException {
        UserData userData = new UserData();
        userData.setName(name);
        userData.setResume(resume.getBytes());
        return userRepository.save(userData);
        
    }

    @GetMapping("/users")
    public String returnsome() {
        return "demo/user.html";
    }
}
