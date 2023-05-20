package training.loanCalculate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deposit {
    private int fund; //induló tőke
    private double interest; //éves kamatláb 0.25%
    private int year;
    private int payment; //befizetés

    public Deposit(int fund, double interest, int year) {
        this.fund = fund;
        this.interest = interest;
        this.year = year;
    }

    public Deposit(double interest, int year, int payment) {
        this.interest = interest;
        this.year = year;
        this.payment = payment;
    }

    public double calculateCompoundInterestByYear(){ //kamatos kamat évente
        return this.fund * (Math.pow((1 + this.interest), year));
    }

    public double calculateCompoundInterestByMonth(){ //kamatos kamat havonta
        return this.fund * (Math.pow((1 + this.interest / 12), this.year * 12));
    }

    public double getAnnuity(){ //gyűjtőjáradék, Mennyi pénz gyűllik össze valamennyi év kamatos kamat után
        double wholeInterest = 1 + this.interest;
        return this.payment * wholeInterest * (Math.pow(wholeInterest, this.year) - 1) / (wholeInterest - 1);
    }

    public long getYearAnnuity(double interest, int fund, int payment){ //pénzgyűjtés éveinek a száma kamatos kamattal
        double wholeInterest = 1 + interest;
        double number = 1 + fund * (wholeInterest - 1) / (payment * wholeInterest);
        return Math.round(Math.log(number) / Math.log(wholeInterest));
    }
}
