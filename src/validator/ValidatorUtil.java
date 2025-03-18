package validator;


import exception.CustomCheckException;

public class ValidatorUtil {
    public static void validate(LoginRequest request) throws CustomCheckException {
        if (request.username() == null) {
            throw new NullPointerException("username is null");
        } else if (request.username().isEmpty() || request.username().isBlank()) {
            throw new CustomCheckException("username kosong");
        } else if (request.password() == null) {
            throw new NullPointerException("password is null");
        } else if (request.password().isEmpty() || request.password().isBlank()) {
            throw new CustomCheckException("password kosong");
        }

    }
    public static  void register (RegisterRequest request) throws CustomCheckException {
        boolean hasUpper = true, hasLower =true,hasSymbol =true,hasNumber = true;

        for(char c : request.password().toCharArray()) {
                if(Character.isLowerCase(c)) hasLower = false;
                if(Character.isUpperCase(c)) hasUpper = false;
                if(Character.isDigit(c)) hasSymbol = false;
                if(isSymbol(c)) hasSymbol = false;

        }
        if (request.username() == null) {
            throw new NullPointerException("username is null");
        } else if (request.username().isEmpty() || request.username().isBlank()) {
            throw new CustomCheckException("username kosong");
        } else if (request.password() == null) {
            throw new NullPointerException("password is null");
        } else if (request.password().isEmpty() || request.password().isBlank()) {
            throw new CustomCheckException("password kosong");
        }else if (request.username().length() < 5){
            throw new CustomCheckException("username harus lebih dari 5 huruf");
        }else if (hasSymbol || hasUpper  || hasLower ){
            throw new CustomCheckException("password harus ada huruf besar, huruf kecil, dan simbol");
        }

    }
    public static boolean isSymbol(char c) {
        return !Character.isLetterOrDigit(c);
    }
}
