package validator;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Login Request");

    }
    public LoginRequest(String username){
        this(username, "");
    }

}
