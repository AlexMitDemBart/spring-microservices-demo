package azo.developer.provider.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class ProviderController {

    @GetMapping("/time")
    public ResponseEntity<String> time() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return ResponseEntity.ok().body(dtf.format(LocalDateTime.now()));
    }
}
