import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void returnBoundary900() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(900);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
}
