package training.loanCalculate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instalment {

    //törlesztőrészlet
    private int loan;
    private double interest; //kamat
    private int loanPrize; //hitelbírálati díj
    private int monthTime;

    public double calculateInstalment(){
        return (this.loan * (1 + this.interest / 100) + this.loanPrize) / this.monthTime;
    }
}
