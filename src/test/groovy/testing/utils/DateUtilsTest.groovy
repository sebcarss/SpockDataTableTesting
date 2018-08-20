package testing.utils

import spock.lang.Specification

import static java.time.LocalDateTime.now

class DateUtilsTest extends Specification {

    def DateUtils utils = new DateUtils()

    def "Date is not current" () {
        when: "Current date is not between the start date and the end date"

        def result = utils.isCurrent(startDate, endDate)

        then: "Returned result is false"

        assert result == false : message

        where:

        startDate                | endDate                  | message
        now().plusDays(2)  | now().plusDays(2)  | "Start date is in the future"
        now().minusDays(2) | now().minusDays(2) | "End date is in the past"
    }
}
