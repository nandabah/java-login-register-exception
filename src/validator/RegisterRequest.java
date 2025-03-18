package validator;

public record RegisterRequest(String username, String password) {
    public RegisterRequest {
        System.out.println("Register request");
    }

//    public RegisterRecord(String username){
//        this(username, "");
//    }
}
