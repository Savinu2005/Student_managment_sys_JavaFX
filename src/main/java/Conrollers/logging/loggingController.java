package Conrollers.logging;

public class loggingController {
    public boolean checkUserNameandPassword(String username, String password) {
            if (username.equals("savinu") && password.equals("1234")) {
                return true;
            }
            return false;
        }

    }

