import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.homework.vacation.services.VacationService;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/bonus.csv")

    public void ShouldCalcExactFirst(int expected, int income, int expences, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }
}