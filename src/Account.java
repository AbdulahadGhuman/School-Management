public class Account {
    private String Username;
    private String Password;
    private String AccountType;
    public void setUsername (String newUsername) {
        this.Username = newUsername;
    }
    public void setPassword (String newPassword) {
        this.Password = newPassword;
    }
    public void setAccountType (String newAccountType) {
        this.AccountType = newAccountType;
    }
    public String getUsername () {
        return this.Username;
    }
    public String getPassword () {
        return this.Password;
    }
    public String getAccountType () {
        return this.AccountType;
    }
}
