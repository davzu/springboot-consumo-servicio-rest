package davzuzu.restTemplatejwtauth.controller;

import davzuzu.restTemplatejwtauth.dto.TeamResponse;
import davzuzu.restTemplatejwtauth.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    public TeamResponse findAll(@RequestHeader(name="x-token") String token) {
        return teamService.findAll(token);
    }

}
