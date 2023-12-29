package davzuzu.restTemplatejwtauth.controller;

import davzuzu.restTemplatejwtauth.dto.LoginRequest;
import davzuzu.restTemplatejwtauth.dto.LoginResponse;
import davzuzu.restTemplatejwtauth.dto.RegisterUserRequest;
import davzuzu.restTemplatejwtauth.dto.RegisteredUserResponse;
import davzuzu.restTemplatejwtauth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("worldcup/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public RegisteredUserResponse registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
        return userService.create(registerUserRequest);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }

}
