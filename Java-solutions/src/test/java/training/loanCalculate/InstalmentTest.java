package training.loanCalculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstalmentTest {

    @Test
    void testInstalment(){
        Instalment instalment = new Instalment(6000_000, 0.25, 10_000, 1);
        double yearInterest = instalment.calculateCompoundInterest();
        System.out.printf("Össz pénz: %,.2f", yearInterest);
        System.out.printf("Hozam: %,.2f", yearInterest - instalment.getFund());
        Instalment instalment2 = new Instalment(10_000, 0.05, 10_000, 20);
        double yearInterest20 = instalment2.calculateCompoundInterest();
        System.out.printf("Össz pénz: %,.2f", yearInterest20);

    }
}