import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /* Creating instances of User */
        User user1 = new User("John", "Smith", TitleEnum.Monsieur);
        User user2 = new User("Bangalore", "Smith", TitleEnum.Madame);
        User user3 = new User("Richard", "Smith", TitleEnum.Monsieur);
        User user4 = new User("Fabrizia", "Smith", TitleEnum.Autre);
        User user5 = new User("Joanne", "Smith", TitleEnum.Madame);

        // USING ENUM AS KEY ----------------------------

        /* I cannot have the same Key in a HashMap, so I cannot repeat the title.
        The first key with the title Monsieur will be replaced for the other using the same title */
        Map<TitleEnum, User> users = new HashMap<TitleEnum, User>();

        users.put(user1.getTitle(), user1);
        users.put(user2.getTitle(), user2);
        users.put(user3.getTitle(), user3);
        users.put(user4.getTitle(), user4);
        users.put(user5.getTitle(), user5);

        System.out.println("PRINTING WITH TITLE KEYS");
        /* Iterating the Hashmap Users */
        for (Map.Entry<TitleEnum, User> i : users.entrySet()) {
            String keyTitle = String.valueOf(i.getKey());
            Object firstname = i.getValue().getFirstname();
            Object lastname = i.getValue().getLastname();
            System.out.println(keyTitle + " " + firstname + " " + lastname);

        }

        // USING INTEGER AS KEY ----------------------------
        Map<Integer, User> usersNumberIndex = new HashMap<Integer, User>();

        usersNumberIndex.put(1, user1);
        usersNumberIndex.put(2, user2);
        usersNumberIndex.put(3, user3);
        usersNumberIndex.put(4, user4);
        usersNumberIndex.put(5, user5);

        System.out.println("PRINTING WITH NUMBERS KEYS");
        for (Map.Entry<Integer, User> i : usersNumberIndex.entrySet()) {
            String keyTitle = String.valueOf(i.getKey());
            Object firstname = i.getValue().getFirstname();
            Object lastname = i.getValue().getLastname();
            Object title = i.getValue().getTitle();
            System.out.println(keyTitle + " " + title + " " + firstname + " " + lastname + " ");
        }
    }
}
