package training.loanCalculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstalmentTest {

    @Test
    void testInstalment(){
        Instalment instalment = new Instalment(1000_000, 14.39, 10_000, 60);
        double monthInstalment = instalment.calculateInstalment();
        System.out.printf("%.2f", monthInstalment);
    }
}