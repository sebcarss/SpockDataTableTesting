package testing.utils

import spock.lang.Specification

import java.time.LocalDateTime

class DateUtilsTest extends Specification {

    def DateUtils utils = new DateUtils()

    def "Current date is before start date" () {
        given: "Start date is in the future"

        def startDate = LocalDateTime.now().plusDays(2)

        when: "Start date is checked to see if in the past"

        def result = utils.isCurrent(startDate)

        then: "Returned result is false"

        result == false
    }
}
