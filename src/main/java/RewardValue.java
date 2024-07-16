public class RewardValue {
     double milesRate =  0.0035D;
     double cash;
     double miles;
    public RewardValue(double cashValue){
        this.cash = cashValue;
        this.miles = cashValue / milesRate;
    }
    public RewardValue(double MilesValue,boolean isMiles){
        this.miles = MilesValue;
        this.cash =  MilesValue * milesRate;
    }
    public double getMilesValue(){
        return miles;
    }
    public double getCashValue(){
        return cash;
    }
}
