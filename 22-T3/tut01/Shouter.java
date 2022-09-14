package example;


public class Shouter {
    // Variables
    private String message;
    
    // Methods
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String shout() {
        return message.toUpperCase();
    }
    
    public static void main(String[] args) {
        Shouter shouter = new Shouter();
        shouter.setMessage("yeet");
        
        System.out.println(shouter.getMessage());
        
        System.out.println(shouter.shout());
    }
}
