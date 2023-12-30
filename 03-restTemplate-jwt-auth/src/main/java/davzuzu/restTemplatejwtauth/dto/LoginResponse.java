package davzuzu.restTemplatejwtauth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoginResponse {

    private String status;
    @JsonProperty("Data")
    private RegisteredDataUser registeredDataUser;
}
