package Vormen;

public class Ellips extends Vorm implements Rondvormig{
    private int halveLangeAs;
    private int halveKorteAs;
    private int straal;

    public Ellips(int halvelangeAs, int halveKorteAs, int straal){
        this.halveLangeAs = halvelangeAs;
        this.halveKorteAs = halveKorteAs;
        this.straal = straal;
    }

    @Override
    public int berekenOppervlakte() {
        return (int) (Math.PI*halveKorteAs*halveLangeAs);
    }

    @Override
    public int geefStraal() {
        return this.straal;
    }
}
