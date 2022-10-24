package calculator;

public class AdditionExpression implements Expression {
    private Expression e1;
    private Expression e2;
    
    public AdditionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public double calculate() {
        return e1.calculate() + e2.calculate();
    }

}
