package davzuzu.restTemplatejwtauth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TeamResponse {

    public String status;
    @JsonProperty("data")
    public List<Team> teams;
}
