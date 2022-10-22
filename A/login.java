package A;

public class login {

    public static void main(String[] args) {

        VerifyPassword.verifyPassword();
        GenerateToken.generatetoken();
        MessageToUser.messageToUser();
    }
}
class VerifyPassword {
    public static void verifyPassword() {
        System.out.println("Password Verified");
    }
}

class GenerateToken {
    public static void generatetoken(){ System.out.println("Generate Token");}
}

class MessageToUser {
    public static void messageToUser(){System.out.println("Password Valid!");}
}
