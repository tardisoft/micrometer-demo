package io.tardisoft.demo.micrometerdemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.http.HttpHeaders
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
                .isEqualTo("Hello World")
    }

}
