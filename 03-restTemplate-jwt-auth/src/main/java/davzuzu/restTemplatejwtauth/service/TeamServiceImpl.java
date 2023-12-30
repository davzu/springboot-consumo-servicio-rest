package davzuzu.restTemplatejwtauth.service;

import davzuzu.restTemplatejwtauth.dto.TeamResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class TeamServiceImpl extends AbstractClient implements TeamService {

    public TeamServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public TeamResponse findAll(String token) {
        String uri = baseUrl + "/team";
        HttpEntity<Void> requestentity = new HttpEntity<>(buildAuthToken(token));
        ResponseEntity<TeamResponse> response = restTemplate.exchange(uri, HttpMethod.GET, requestentity, TeamResponse.class);

        if(response.getStatusCode().is2xxSuccessful()) {
            log.info("successfully user creation: {}", response.getBody().getStatus());
            return response.getBody();
        }
        log.error("Error in user creation - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }
}
