
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void returnBoundary900() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(900);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void returnBoundary999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int actual = service.remain(999);
        int expected = 1;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void returnBoundary1000() { // этот тест не прошел из-за дефекта
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(1000);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void returnBoundary1001() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = service.remain(1001);
        int expected = 999;

        org.testng.Assert.assertEquals(actual, expected);
    }
}
