package training.loanCalculate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instalment {

    //törlesztőrészlet
    private int fund; //induló tőke
    private double interest; //éves kamatláb
    private int loanPrize; //hitelbírálati díj
    private int year;

    public double calculateCompoundInterest(){ //kamatos kamat
        return this.fund * (Math.pow((1 + this.interest), year));
    }
}
