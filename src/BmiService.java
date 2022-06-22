public class BmiService {
    public double calculate(double weight, double height){
        double result = weight / (height * height) * 10_000;
        return result;
    }
}