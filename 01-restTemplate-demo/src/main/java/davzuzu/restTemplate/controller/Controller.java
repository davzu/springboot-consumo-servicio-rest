package davzuzu.restTemplate.controller;

import davzuzu.restTemplate.model.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final RestTemplate restTemplate;


    @GetMapping("/test/{id}")
    public Result getApi(@PathVariable String id) {
//        String url = "https://jsonplaceholder.typicode.com/todos/" + id;
//        Result result = restTemplate.getForObject(url, Result.class);

        // El nombre del parametro debe ser el mismo que el de la variable
        // También se puede pasar un Map<String, String> en lugar de cada una de las variables
        String url = "https://jsonplaceholder.typicode.com/todos/{id}";
        Result result = restTemplate.getForObject(url, Result.class, id);
        log.info("Result: " + result);
        return result;
    }

    @GetMapping("/test/list")
    public List<Result> getListResult() {
        String url = "https://jsonplaceholder.typicode.com/todos";
        Result[] results = restTemplate.getForObject(url, Result[].class);
        return Arrays.asList(results);
    }
}
