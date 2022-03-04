package reviews.data;

public abstract class Business {
    private String nombre;
    private String location;
    private Review[] review;
    
    public Business(String nombre, String location, Review[] reviews)
    {
        this.nombre = nombre;
        this.location = location;
        this.review = reviews;
    }

    public double reviewAverage()
    {
        float count = 0;
        
        for (int i = 0; i < getReview().length; i++)
        {
            count += review[i].getRating();
        }
        return (count / getReview().length);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Review[] getReview()
    {
        return this.review;
    }

    @Override
    public String toString() {
        return this.nombre + " ( " + this.location + " ) " + "\n Review Average: " + reviewAverage();
    }


}
