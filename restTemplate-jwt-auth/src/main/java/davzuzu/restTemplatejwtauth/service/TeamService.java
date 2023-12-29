package davzuzu.restTemplatejwtauth.service;

import davzuzu.restTemplatejwtauth.dto.TeamResponse;

public interface TeamService {

    TeamResponse findAll(String token);
}
