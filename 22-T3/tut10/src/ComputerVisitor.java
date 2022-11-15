
public class ComputerVisitor {
    
    private boolean validated = false;
    
    public void visit(Mouse v) {
        System.out.println("Looking at mouse " + v.toString());
    }
    
    public void visit(Keyboard v) {
        System.out.println("Looking at keyboard " + v.toString() + " which has " + v.getNumKeys() + " keys.");
    }
    
    public void visit(Computer c) {
        System.out.println("Looking at computer " + c.toString() + " with memory " + c.getMemory() + " GB");
    }
    
    
    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }
    
    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        ComputerComponent mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();
        
        computer.accept(visitor);
        keyboard.accept(visitor);
        mouse.accept(visitor);

    }



}