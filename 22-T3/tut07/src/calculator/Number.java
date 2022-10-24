package calculator;

public class Number implements Expression {
    public double num;
    
    public Number(double num) {
        this.num = num;
    }
    
    @Override
    public double calculate() {
        return num;
    }
}
