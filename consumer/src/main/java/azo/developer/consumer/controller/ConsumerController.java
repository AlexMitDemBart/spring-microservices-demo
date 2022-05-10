package azo.developer.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/time")
    public ResponseEntity<String> callProvider() {
        String url = "http://provider/time";
        return ResponseEntity.ok().body("Die ermittelte Uhrzeit ist " + restTemplate.getForObject(url, String.class));
    }

}
