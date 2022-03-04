package reviews.data;

public class Hairdresser extends Business {
    boolean unisex;

    public Hairdresser(String nombre, String location, Review[] review, boolean unisex)
    {
        super(nombre, location, review);
        this.unisex = unisex;

    }

    @Override
    public String toString() {
        return "Hairdresser " + super.toString() + " - " + this.unisex;
    }

}