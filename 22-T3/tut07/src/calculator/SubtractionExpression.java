package calculator;

public class SubtractionExpression implements Expression {
    
    private Expression e1;
    private Expression e2;
    
    public SubtractionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public double calculate() {
        return e1.calculate() - e2.calculate();
    }

}
