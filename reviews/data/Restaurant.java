package reviews.data;

public class Restaurant extends Business {
    private String foodType;

    public Restaurant(String foodType, String nombre, Review[] review , String location)
    {
        super(nombre, location, review);
        this.foodType = foodType;
    }

    

    public String getFoodType() {
        return this.foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Restaurant " + super.toString() + " - " + foodType;
    }
}
