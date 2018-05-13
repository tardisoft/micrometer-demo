package io.tardisoft.demo.micrometerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class MicrometerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrometerDemoApplication.class, args);
    }

    @RequestMapping("/")
    public Mono<ResponseEntity<String>> index() {
        return Mono.just(ResponseEntity.ok("Hello World"));
    }

}
