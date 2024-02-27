public class Main {

    public static void main(String[] args) {

        User user1 = User.getInstance();
        user1.stampaInfo();

        User user2 = new User("Anna", 25);
        user2.stampaInfo();
    }
}