package Main;

public class Calculator {

    public double addition(double input1, double input2){
        double sum = input1 + input2;
        return sum;
    }

    //function for subtraction
    public double subtraction(double input1, double input2){
        double sum = input1 - input2;
        return sum;
    }

    //function for multiplication
    public double multiplication(double input1, double input2){
        double sum = input1 * input2;
        return sum;
    }

    // function for division
    public double division(double input1, double input2){
        double sum = input1 / input2;
        return sum;
    }

    public double percentage(double amount, double percent){
        double sum = amount*percent;
        sum = sum/100;
        return sum;
    }
}
