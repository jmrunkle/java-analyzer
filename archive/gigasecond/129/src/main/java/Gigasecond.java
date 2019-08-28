import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static final int OFFSET = 1_000_000_000;
    private final LocalDateTime moment;

    Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay().plusSeconds(1_000_000_000);
    }

    Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(OFFSET);
    }

    LocalDateTime getDateTime() {
        return moment;
    }

}
