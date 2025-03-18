package Service;

public interface Ilogin {
    void login(String username, String password) throws Exception;
    void register(String username, String password) throws Exception;
    void viewuser() throws Exception;
}
