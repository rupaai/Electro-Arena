package dbproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseHandler ob = new DatabaseHandler();
        ob.setConnection("electroarena2", "root", "");
        //ob.getCatagoryName();
        //signUp su = new signUp();
        String type;
        type = "customer";
        String email;
        email = "labiba";
        String password;
        password = "labiba";
        //ob.getTypeID(type);
        ob.signIn(email, password, type);
    }
    
}
