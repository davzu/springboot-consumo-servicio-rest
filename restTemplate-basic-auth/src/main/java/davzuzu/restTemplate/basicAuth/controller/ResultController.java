package davzuzu.restTemplate.basicAuth.controller;

import davzuzu.restTemplate.basicAuth.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class ResultController {

    private final ResultService resultService;

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id) {
        return new ResponseEntity(resultService.getById(id), HttpStatus.OK);
    }
}
