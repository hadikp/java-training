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
        System.out.println(yearLoan/12);
    }

}