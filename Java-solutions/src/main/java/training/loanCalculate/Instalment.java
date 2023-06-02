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

    public double getMonthLoan(double interest, int loan, int year) { //havi törlesztőrészlet
        double wholeInterestByMonth = 1 + interest / 12;
        double powNumByMonth = Math.pow(wholeInterestByMonth, year * 12);
        return Math.round((loan * powNumByMonth * (wholeInterestByMonth - 1)) / (powNumByMonth - 1));
    }
}
