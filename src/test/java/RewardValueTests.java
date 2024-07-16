import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue,true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash = 10000;
        var rewardValue = new RewardValue(cash);
        double MilesExpectedValue = cash /rewardValue.milesRate ;
        assertEquals(MilesExpectedValue,rewardValue.getMilesValue());
       // assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
      double Miles = 10000;
        var rewardValue = new RewardValue(Miles,true);
        double CashExpectedValue = Miles * rewardValue.milesRate;
        assertEquals(CashExpectedValue,rewardValue.getCashValue());
    }
}
