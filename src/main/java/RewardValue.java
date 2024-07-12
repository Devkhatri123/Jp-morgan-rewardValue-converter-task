public class RewardValue {
    final double milesRate =  0.0035D;
    final double cash;
    final double miles;
    public RewardValue(double cashValue){
        this.cash = cashValue;
        this.miles = cashValue / milesRate;
    }
    public RewardValue(float MilesValue){
        this.miles = MilesValue;
        this.cash =  MilesValue * milesRate;
    }
    public double getMilesValue(){
        return miles;
    }
    public double getCash(){
        return cash;
    }
}
