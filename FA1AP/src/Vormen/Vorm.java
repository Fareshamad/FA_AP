package Vormen;

public abstract class Vorm {
    public abstract int berekenOppervlakte();

    @Override
    public String toString() {
        return "De oppervlakte van deze " + this.getClass().getSimpleName() + " is: \t" + this.berekenOppervlakte();
    }
}

