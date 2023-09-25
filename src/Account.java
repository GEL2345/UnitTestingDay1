public class Account {
    String username;
    String password;

    public void printDetails() {
        System.out.println(username + " , " + password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.username = "John1";
        a.password = "123456";

        a.printDetails();

    }

}
