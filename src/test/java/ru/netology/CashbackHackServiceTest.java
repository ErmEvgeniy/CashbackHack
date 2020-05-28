package ru.netology;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    public void checkFunction (){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expect = 100;
        int actual = service.remain(amount);
        assertEquals(actual,expect);
    }

}