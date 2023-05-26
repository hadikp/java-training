package training.loanCalculate;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Instalment {

    //törlesztőrészlet
    private int loanPrize; //hitelbírálati díj

    public double getYearLoan(double interest, int loan, int year){ //adott összegű hitelt adott évek alatt mennyi az éves törlesztőrészlet
        double wholeInterest = 1 + interest;
        double powNumber = Math.pow(wholeInterest, year);
        return Math.round((loan * powNumber * interest) / (powNumber - 1));
    }
}
