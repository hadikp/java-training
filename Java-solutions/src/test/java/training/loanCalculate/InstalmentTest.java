package training.loanCalculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstalmentTest {

    @Test
    void testGetYearLoan(){
        Instalment instalment = new Instalment();
        double yearLoan = instalment.getYearLoan(0.07, 20_000_000, 20);
        //System.out.printf("Évi törlesztőrészlet: %,.2f", yearLoan);
        assertEquals(1_887_859, yearLoan, 0.1);
        assertEquals(157_321.6, yearLoan / 12, 0.1);
    }

    @Test
    void testGetMonthLoan(){
        Instalment instalment = new Instalment();
        double monthLoan = instalment.getMonthLoan(0.07, 20_000_000, 20);
        //System.out.printf("Havi törlesztőrészlet: %,.2f", monthLoan);
        assertEquals(155_060, monthLoan, 0.1);
    }

}