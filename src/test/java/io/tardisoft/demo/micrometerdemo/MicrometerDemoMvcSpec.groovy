package io.tardisoft.demo.micrometerdemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Specification

@WebFluxTest(MicrometerDemoApplication)
class MicrometerDemoMvcSpec extends Specification {

    @Autowired
    private WebTestClient webClient

    def "test index"() {
        expect:
        webClient
                .get()
                .uri("/")
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("Index")
    }

    def "test hello"() {
        expect:
        webClient
                .get()
                .uri("/hello")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus()
                .isOk()
                .expectBody(String.class)
                .isEqualTo("Hello")
    }

    def "test hello Christian"() {
        expect:
        webClient
                .get()
                .uri("/hello/Christian")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .exchange()
                .expectStatus()
                .isOk()
                .expectBody(String.class)
                .isEqualTo("Hello Christian")
    }
}
