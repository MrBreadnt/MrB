public class Neyron{
    private double weight = 0.5;
    public double lastError = 0;
    public double smoothing = 0.00001;
    public double ProcessInputData(double input){
        return input * weight;
    }
    public double RestoreInputData(double output){
        return output / weight;
    }
    public void Train(double input, double expectedResult){
        var actualResult = input * weight;
        lastError = expectedResult - actualResult;
        var correction = (lastError / actualResult) * smoothing;
        weight += correction;
    }
}