package testing.utils

import spock.lang.Specification

import static java.time.LocalDateTime.now

class DateUtilsTest extends Specification {

    def DateUtils utils = new DateUtils()

    def "Checks for current date" () {
        when: "Start date and end date are passed into isCurrent method"

        def result = utils.isCurrent(startDate, endDate)

        then: "Returned result is expected from data table"

        assert result == expected : message

        where:

        startDate                | endDate                  | expected | message
        now().plusDays(2)  | now().plusDays(2)  | false    | "Start date is in the future"
        now().minusDays(2) | now().minusDays(2) | false    | "End date is in the past"
        now().minusDays(2) | now().plusDays(2)  | true     | "Dates are current"
    }
}
