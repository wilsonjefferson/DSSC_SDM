public interface Vehicle_Interface {
    public String getTarga();
    public int getKilometraggio();
    public void setNposti(int posti);
    public static void speak(){ // static method has a body in Interfaces
        System.out.println("Hello human, I'm a Transformer!");
    }
}
