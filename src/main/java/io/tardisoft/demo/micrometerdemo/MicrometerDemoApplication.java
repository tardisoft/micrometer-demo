package io.tardisoft.demo.micrometerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class MicrometerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrometerDemoApplication.class, args);
    }

    @GetMapping("/")
    public Mono<ResponseEntity<String>> index() {
        return Mono.just(ResponseEntity.ok("Index"));
    }

    @GetMapping(value = "/hello")
    public Mono<ResponseEntity<String>> hello() {
        return Mono.just(ResponseEntity.ok("Hello"));
    }

    @GetMapping(value = "/hello/{name}")
    public Mono<ResponseEntity<String>> hello(@PathVariable("name") String name) {
        return Mono.just(ResponseEntity.ok("Hello " + name));
    }
}
