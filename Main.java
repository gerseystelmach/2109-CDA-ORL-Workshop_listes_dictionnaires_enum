import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("John", "Smith", TitleEnum.Monsieur);
        User user2 = new User("Bangalore", "Smith", TitleEnum.Madame);
        User user3 = new User("Richard", "Smith", TitleEnum.Monsieur);
        User user4 = new User("Fabrizia", "Smith", TitleEnum.Madame);
        User user5 = new User("Joanne", "Smith", TitleEnum.Autre);

        /* I cannot have the same KEY */
        Map<Integer, User> users = new HashMap<Integer, User>();

        users.put(1, user1);
        users.put(2, user2);
        users.put(3, user3);
        users.put(4, user4);
        users.put(5, user5);

        /* Iterating the Hashmap Users */
        for (Map.Entry<Integer, User> i : users.entrySet()) {
            String keyTitle = String.valueOf(i.getKey());
            Object firstname = i.getValue().getFirstname();
            Object lastname = i.getValue().getLastname();
            Object title = i.getValue().getTitle();
            System.out.println(keyTitle + " " + title + " " + firstname + " " + lastname + " " );
        }
    }


}
