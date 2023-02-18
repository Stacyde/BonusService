import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.BonusService;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCalcExact(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}