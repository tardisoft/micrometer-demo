package io.tardisoft.demo.micrometerdemo

import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

@RunWith(SpringRunner.class)
@SpringBootTest
class MicrometerDemoApplicationSpec extends Specification {

    def "context loads"() {
        expect:
        true
    }

}
