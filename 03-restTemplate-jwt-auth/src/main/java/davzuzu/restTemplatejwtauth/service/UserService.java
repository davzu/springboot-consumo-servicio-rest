package davzuzu.restTemplatejwtauth.service;

import davzuzu.restTemplatejwtauth.dto.LoginRequest;
import davzuzu.restTemplatejwtauth.dto.LoginResponse;
import davzuzu.restTemplatejwtauth.dto.RegisterUserRequest;
import davzuzu.restTemplatejwtauth.dto.RegisteredUserResponse;

public interface UserService {

    RegisteredUserResponse create(RegisterUserRequest user);
    LoginResponse login(LoginRequest loginRequest);
}
