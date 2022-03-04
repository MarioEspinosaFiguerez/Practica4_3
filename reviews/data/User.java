package reviews.data;

public class User {
    private String login;
    private String password;

    public User(String login, String password)
    {
        this.login = login;
        this.password = password;
    }


    public String getLogin() {
        return this.login;
    }
    
    public String getPassword() {
        return this.password;
    }


    @Override
    public String toString() {
        return "El login es: " + getLogin() + "\n La contraseña es: " + getPassword();
    }

}