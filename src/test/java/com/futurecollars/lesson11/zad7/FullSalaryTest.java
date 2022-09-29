package com.futurecollars.lesson11.zad7;
import com.futurcollars.lesson11.zad7.BasicSalary;
import com.futurcollars.lesson11.zad7.FullSalary;
import com.futurcollars.lesson11.zad7.SaturdaySalary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class FullSalaryTest {
    @Test
    public void shouldGetFullPay() {
        //given
        BasicSalary basicSalary = Mockito.mock(BasicSalary.class);
        SaturdaySalary saturdaySalary = Mockito.mock(SaturdaySalary.class);
        FullSalary fullSalary = new FullSalary(basicSalary, saturdaySalary);
        // when
        when(basicSalary.getBasicSalary()).thenReturn(3000);
        when(saturdaySalary.getAmountSaturday()).thenReturn(500);
        int result = fullSalary.getFullPay(500, 4);
        // then
        Assertions.assertEquals(result, 5500);
    }
}
