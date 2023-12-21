package davzuzu.restTemplate.basicAuth;

import davzuzu.restTemplate.basicAuth.dto.ResultDTO;
import davzuzu.restTemplate.basicAuth.mapper.ResultMapper;
import davzuzu.restTemplate.basicAuth.model.Result;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
public class ResultService {

    private final RestTemplate restTemplate;

    private String hash() {
        String credentials = "admin:1234";
        return Base64.encodeBase64String(credentials.getBytes());
    }

    public ResultDTO getById(Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Basic " + hash());
        ResponseEntity<Result> response =
                restTemplate.exchange("https://65lkg.wiremockapi.cloud/json/" + id.toString(),
                                        HttpMethod.GET,
                                        new HttpEntity<>(headers),
                                        Result.class);

        return ResultMapper.buildResultDTO(response.getBody());
    }

}
