package testing.utils

import spock.lang.Specification

import static java.time.LocalDateTime.now

class DateUtilsTest extends Specification {

    def DateUtils utils = new DateUtils()

    def "Current date is before start date" () {
        given: "Start date and end date are in the future"

        def startDate = now().plusDays(2)
        def endDate = now().plusDays(2)

        when: "Start date is checked to see if in the past"

        def result = utils.isCurrent(startDate, endDate)

        then: "Returned result is false"

        result == false
    }

    def "Current date is after end date" () {
        given: "Start date and end date are in the past"

        def startDate = now().minusDays(2)
        def endDate = now().minusDays(2)

        when: "End date is checked to see if in the past"

        def result = utils.isCurrent(startDate, endDate)

        then: "Returned result is false"

        result == false
    }
}
