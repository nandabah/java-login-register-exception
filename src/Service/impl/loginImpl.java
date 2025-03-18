package Service.impl;

import Service.Ilogin;
import Service.User;
import exception.CustomCheckException;
import validator.LoginRequest;
import validator.RegisterRequest;
import validator.ValidatorUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class loginImpl implements Ilogin {
    HashMap<String,User> users = new HashMap<String,User>();

    @Override
    public void login(String username, String password)  {
        LoginRequest login = new LoginRequest(username, password);
        for (String user : users.keySet()) {

            if(users.get(user).getPassword().equals(password) && users.get(user).getName().equals(username) ){
                    try{

                        ValidatorUtil.validate(login);
                        System.out.println("login success");
                    }catch (CustomCheckException e){
                        System.out.println(e.getMessage());
                    }
            }else{
                System.out.println("Login Failed");
            }
        }

    }

    @Override
    public void register(String username, String password) {
        LoginRequest login = new LoginRequest(username, password);
        RegisterRequest register = new RegisterRequest(username, password);
        boolean isValidate = false;
        try {
            ValidatorUtil.register(register);
            isValidate = true;
        } catch (CustomCheckException e) {
            System.out.println(e.getMessage());
        }
        if(isValidate){
            System.out.println("User Registered");
            users.put(username,new User(username, password));

        }else{
            System.out.println("Unregistered");
        }
    }

    @Override
    public void viewuser() throws Exception {
        System.out.println(users);
       for (String user : users.keySet()) {
           System.out.println(user );
           System.out.println(users.get(user).getName());
       }
    }
}
