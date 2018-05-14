package io.tardisoft.demo.micrometerdemo

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import spock.lang.Specification

@SpringBootTest
@DirtiesContext
class MicrometerDemoApplicationSpec extends Specification {

    def "context loads"() {
        expect:
        true
    }
}
