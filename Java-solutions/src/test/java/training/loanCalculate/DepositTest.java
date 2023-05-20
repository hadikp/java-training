package training.loanCalculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    @Test
    void testCalculateCompoundByYear(){ //kamatos kamat
        Deposit instalment = new Deposit(6000_000, 0.16,1);
        double yearInterest = instalment.calculateCompoundInterestByYear();
        assertEquals(6_960_000, yearInterest, 0.5);
        //System.out.printf("Össz pénz: %,.2f", yearInterest);
        assertEquals(960_000, yearInterest - instalment.getFund(), 0.5);

        Deposit instalment2 = new Deposit(10_000, 0.05, 20);
        double yearInterest20 = instalment2.calculateCompoundInterestByYear();
        assertEquals(26_533, yearInterest20, 0.05);

        Deposit instalment3 = new Deposit(1000_000, 0.04,10);
        double yearInterest10 = instalment3.calculateCompoundInterestByYear();
        assertEquals(1_480_244.3, yearInterest10, 0.5);
    }

    @Test
    void testCalculateCompoundByMonth(){
        Deposit instalment3 = new Deposit(1000_000, 0.04,10);
        double monthInterest10 = instalment3.calculateCompoundInterestByMonth();
        assertEquals(1_490_833, monthInterest10, 0.5);
    }

    @Test
    void testGetAnnuity(){
        Deposit instalment = new Deposit(0.06, 20, 12000);
        double yearMoney = instalment.getAnnuity();
        assertEquals(467_912.7, yearMoney, 0.1);

        Deposit instalment2 = new Deposit(0.06, 20, 102_584);
        double yearMoney2 = instalment2.getAnnuity();
        assertEquals(4000_029.9, yearMoney2, 0.1);
    }

    @Test
    void testGetYearAnnuity(){
        Deposit instalment = new Deposit();
        long year2Mil = instalment.getYearAnnuity(0.06, 2000_000, 15_000);
        long year10Mil = instalment.getYearAnnuity(0.06, 2000_000, 150_000);
        assertEquals(37, year2Mil);
        assertEquals(10, year10Mil);
    }
}