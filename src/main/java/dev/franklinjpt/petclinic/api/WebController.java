package dev.franklinjpt.petclinic.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class WebController {

    @GetMapping
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello world");
    }
}
