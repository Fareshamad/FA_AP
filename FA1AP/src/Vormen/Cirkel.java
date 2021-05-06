package Vormen;

public class Cirkel extends Vorm implements Rondvormig{
    private int straal;

    public Cirkel(int straal){
        this.straal = straal;
    }

    @Override
    public int berekenOppervlakte() {
        return (int) (this.straal*this.straal*Math.PI);
    }

    @Override
    public int geefStraal() {
        return this.straal;
    }

}
