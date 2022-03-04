package reviews.main;
import java.util.Scanner;
import reviews.data.*;

public class Main {
    public static void main(String[] args) {
        Management manage = new Management();
        Scanner sc = new Scanner(System.in);
        String id, pass;
        User user;

        manage.initialize();

        do
        {
            System.out.println("Dime el usuario ");
            id = sc.nextLine();
            System.out.println("Dime la contraseña ");
            pass = sc.nextLine();
            user = manage.checkUSers(id, pass);
        }while(user == null);
        System.out.println("Elige una de las siguientes opciones ");
        System.out.println("0 - Exit ");
        System.out.println("1 - My Reviews ");
        System.out.println("2 - Business List ");
        System.out.println("3 - Top Rated Business ");
        System.out.println("4 - Edit my Reviews ");
        String opc = sc.nextLine();

        switch(opc)
        {
            case "0": break;
            case "1": manage.showReviews(user);
                        break;
            case "2": manage.sortBusinessByName();
                        break;
            case "3": System.out.println("Dime el tipo de negocio que quieres ");
                        System.out.println("1 - Restaurants ");
                        System.out.println("2 - Haidressers ");
                        System.out.println("3 - Garages ");
                        int opcion = sc.nextInt();
                        if (opcion == 1)
                        {
                            manage.sortBusinessByRating(opcion);
                        }
                        else if (opcion == 2)
                        {
                            manage.sortBusinessByRating(opcion);
                        }
                        else 
                            manage.sortBusinessByRating(opcion);
                        break;
        }

        sc.close();
    }
}
