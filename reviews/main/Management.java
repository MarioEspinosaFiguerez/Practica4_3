package reviews.main;
import reviews.data.*;

public class Management {
   User[] users = new User[12];
   Business[] businesses = new Business[6]; 
   Review[] reviews = new Review[12];

   public void initialize()
   {
      users[0] = new User("Joeri", "Joeri");
      users[1] = new User("Ismael", "Ismael");
      users[2] = new User("Aaron", "Aaron");
      users[3] = new User("Mario", "Mario");
      users[4] = new User("Jorge", "Jorge");
      users[5] = new User("Raul", "Raul");
      users[6] = new User("Junior", "Junior");
      users[7] = new User("Jhony", "Jhony");
      users[8] = new User("Cristian", "Cristian");
      users[9] = new User("Borja", "Borja");
      users[10] = new User("Maria", "Maria");
      users[11] = new User("Vero", "Vero");

      reviews[0] = new Review(users[0], "Servicio de acuerdo a su calidad", 5);
      reviews[1] = new Review(users[1], "Buen servicio, aunque mejorable", 2.5f);   
      reviews[2] = new Review(users[2], "Pésimo servicio", 1); 
      reviews[3] = new Review(users[3], "Increible servicio, volveremos seguro", 5); 
      reviews[4] = new Review(users[4], "Aunque empezamos con mala pata, ya que tardaron mucho en atendernos, el resto de maravilla", 4); 
      reviews[5] = new Review(users[5], "Bastante mal en general", 2.5f);
      reviews[6] = new Review(users[6], "Mejorable", 3); 
      reviews[7] = new Review(users[7], "Buenos precios", 3.5f); 
      reviews[8] = new Review(users[8], "Corte Perfecto", 5); 
      reviews[9] = new Review(users[9], "Me ha cortado lo que ha querido", 1); 
      reviews[10] = new Review(users[10], "Buen corte aun que algo caro", 4); 
      reviews[11] = new Review(users[11], "Estupendo servicio y barato", 5); 

      businesses[0] = new Hairdresser("Pablo", "New York", new Review[]{reviews[8], reviews[9]}, true);
      businesses[1] = new Hairdresser("Joeri", "California", new Review[]{reviews[10], reviews[11]}, false);
      businesses[2] = new Restaurant("Italiana", "Pizza", new Review[]{reviews[5], reviews[7]}, "Milano");
      businesses[3] = new Restaurant("Francesa", "Crepe", new Review[]{reviews[2], reviews[4]}, "Paris");
      businesses[4] = new Garage(100, "GaraG", new Review[]{reviews[6], reviews[1]}, "Alicante");
      businesses[5] = new Garage((float) 1750.43, "Garages Yusep", new Review[]{reviews[0], reviews[3]}, "Alcoi");
   }
   public User checkUSers(String login, String password)
   {
      for (User u : users) {
         if (login.equals(u.getLogin() ) && password.equals(u.getPassword()) )
            return u;
      }
      return null;
   }

   public void showReviews(User user)
   {
      for (int i = 0; i < businesses.length; i++)
         for(int j = 0; j < businesses[i].getReview().length; j++)
         {
            if (user.equals(businesses[i].getReview()[j].getUser()) )
            {
               System.out.println(businesses[i].getNombre() );
               System.out.println(businesses[i].getReview()[j].toString() );
            }
         }
   
   }

   public void sortBusinessByName()
   {
      for (int i = 0; i < businesses.length; i++)
      {
         for (int j = i + 1; j < businesses.length; j++)
         {
            Business aux = businesses[i];
            businesses[i] = businesses[j];
            businesses[j] = aux;
         }
      }
         for (int i = 0; i < businesses.length; i++)
            System.out.println(businesses[i].toString() );
      }

   public void sortBusinessByRating(int type)
   {
      for (int i = 0; i < businesses.length; i++)
         for (int j = 0; j < ; j++)
         {
            
         }
   }
}
