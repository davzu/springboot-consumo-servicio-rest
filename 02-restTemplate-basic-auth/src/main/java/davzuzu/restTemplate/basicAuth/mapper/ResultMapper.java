package davzuzu.restTemplate.basicAuth.mapper;

import davzuzu.restTemplate.basicAuth.dto.ResultDTO;
import davzuzu.restTemplate.basicAuth.model.Result;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ResultMapper {

    public ResultDTO buildResultDTO(Result result) {
        return new ResultDTO(result.getId(), result.getValue());
    }

}
