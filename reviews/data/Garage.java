package reviews.data;

public class Garage extends Business {
    private float priceHour;

    public Garage(float priceHour, String nombre, Review[] review , String location) {
        super(nombre, location, review);
        this.priceHour = priceHour;
    }


    public float getPriceHour() {
        return this.priceHour;
    }

    public void setPriceHour(float priceHour) {
        this.priceHour = priceHour;
    }


    @Override
    public String toString() {
        return "Garage " + super.toString() + " - " + getPriceHour() + " €/h ";
    }

}
