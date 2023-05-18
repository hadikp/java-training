package training.loanCalculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstalmentTest {

    @Test
    void testCalculateCompoundByYear(){ //kamatos kamat
        Instalment instalment = new Instalment(6000_000, 0.16,1);
        double yearInterest = instalment.calculateCompoundInterestByYear();
        assertEquals(6_960_000, yearInterest, 0.5);
        //System.out.printf("Össz pénz: %,.2f", yearInterest);
        assertEquals(960_000, yearInterest - instalment.getFund(), 0.5);

        Instalment instalment2 = new Instalment(10_000, 0.05, 20);
        double yearInterest20 = instalment2.calculateCompoundInterestByYear();
        assertEquals(26_533, yearInterest20, 0.05);

        Instalment instalment3 = new Instalment(1000_000, 0.04,10);
        double yearInterest10 = instalment3.calculateCompoundInterestByYear();
        assertEquals(1_480_244.3, yearInterest10, 0.5);
    }

    @Test
    void testCalculateCompoundByMonth(){
        Instalment instalment3 = new Instalment(1000_000, 0.04,10);
        double monthInterest10 = instalment3.calculateCompoundInterestByMonth();
        assertEquals(1_490_833, monthInterest10, 0.5);
    }
}