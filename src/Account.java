public class Account {
    String username;
    String password;

    public void printDetails() {
        System.out.println(username + " , " + password);
    }
    public static void main(String[] args) {
        Account a = new Account();
        a.username = "John1";
        a.password = "123456";

        a.printDetails();

    }

}
