package training.loanCalculate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instalment {

    //törlesztőrészlet
    private int fund; //induló tőke
    private double interest; //éves kamatláb 0.25%
    private int loanPrize; //hitelbírálati díj
    private int year;

    public Instalment(int fund, double interest, int year) {
        this.fund = fund;
        this.interest = interest;
        this.year = year;
    }

    public double calculateCompoundInterestByYear(){ //kamatos kamat
        return this.fund * (Math.pow((1 + this.interest), year));
    }

    public double calculateCompoundInterestByMonth(){ //kamatos kamat
        return this.fund * (Math.pow((1 + this.interest / 12), year * 12));
    }
}
