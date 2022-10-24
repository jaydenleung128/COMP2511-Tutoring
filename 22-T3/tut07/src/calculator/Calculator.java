package calculator;

public class Calculator {
    
    private Expression expr; 
    
    public Calculator(Expression expr) {
        this.expr = expr;
    }
    
    public double calculate() {
        return expr.calculate();
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new SubtractionExpression(
            new AdditionExpression(
                new AdditionExpression(new Number(1), new Number(2)), 
                new DivisionExpression(new Number(3), new Number(4))
            ), 
            new MultiplicationExpression(
                new DivisionExpression(new Number(5), new Number(10)),
                new MultiplicationExpression(new Number(7), new Number(8))    
            )
        ));
        
        System.out.println(calculator.calculate()); // -24.25
    }
}
