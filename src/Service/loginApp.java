package Service;

import Service.impl.loginImpl;
import exception.CustomCheckException;
import validator.InputUtil;


import java.util.Scanner;

import static Service.Cli.tampilan;

public class loginApp {
    public static void main(String[] args) throws Exception {
        loginImpl login = new loginImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            tampilan();
            String number = InputUtil.inputString("masukkan Nomor: ");
            switch (number) {
                case "1":
                    String username = InputUtil.inputString("masukkan username: ");
                    String password = InputUtil.inputString("masukkan Password: ");
                    try {

                        login.login(username, password);
                    } catch (CustomCheckException e) {
                    }
                    break;
                case "2":
                    String username2 = InputUtil.inputString("masukkan username: ");
                    String password2 = InputUtil.inputString("masukkan Password: ");
                    try {

                        login.register(username2, password2);

                    } catch (NullPointerException | CustomCheckException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    case "3":
                        login.viewuser();
                        break;
            }

        }


    }
}
