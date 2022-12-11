package com.education.ztu;


public class Main4 {

    public static void main(String[] args) {

        try {
            chekCredentials("dasdsa", "fsdf_", "fsdf_");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public static boolean chekCredentials(String login, String password, String confirmPassword) throws Exception {

        if(!login.matches("^[a-zA-Z0-9-_\\.]{0,20}$"))
            throw new WrongPasswordException("incorrect login");

        if(!password.matches("^[a-zA-Z0-9-_\\.]{0,20}$") || password != confirmPassword)
            throw new WrongPasswordException("incorrect password");

        return true;
    }

}
