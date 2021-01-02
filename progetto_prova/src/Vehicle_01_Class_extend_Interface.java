public class Vehicle_01_Class_extend_Interface implements Vehicle_Interface{
    private String targa;
    private int nposti;
    private int cilindrata;
    private int kilometraggio;

    public void Vehicle_01_Class_extend_Interface(){
        // empty ctor
    }

    public Vehicle_01_Class_extend_Interface(String targa, int nposti, int cilindrata, int kilometraggio) {
        this.targa = targa;
        this.nposti = nposti;
        this.cilindrata = cilindrata;
        this.kilometraggio = kilometraggio;
    }

    public String getTarga(){
        return "targa: " + this.targa;
    }

    public int getKilometraggio(){
        return this.kilometraggio;
    }

    public final void setNposti(int posti){ // implemented method and also final
        this.nposti = posti;
    }
}
