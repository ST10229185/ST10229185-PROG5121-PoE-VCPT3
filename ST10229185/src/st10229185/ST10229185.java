/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10229185;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class ST10229185 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner inputDevice = new Scanner(System.in);
        Login myLogin = new Login();
        
        System.out.print("Please enter your username >>");
        myLogin.setUsername(inputDevice.nextLine());
        if (myLogin.checkUsername() == true)
        {
            System.out.println("Username successfully captured ");
        }
        else if (myLogin.checkUsername() == false)
        {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length. ");
        }
        
        System.out.print("Please enter your password >>");
        myLogin.setPassword(inputDevice.nextLine());
        if (myLogin.checkPassword() == true)
        {
            System.out.println("Password successfully captured");
        }
        else if (myLogin.checkPassword() == false)
        {
            System.out.println("Password invaild, please ensure that the password contains at least 8 characters,a capital letter,a number and a special character");
        }
        
        if (myLogin.checkUsername() && myLogin.checkPassword() == true )
        {
            System.out.println("Welcome"+myLogin.getUsername()+"Please enter your first name >>");
            myLogin.setFirstName(inputDevice.nextLine());
            System.out.println("Please enter your last name >>");
            myLogin.setLastName(inputDevice.nextLine());
        }
        else if  (myLogin.checkUsername() && myLogin.checkPassword() == false)
        {
//            System.out.println(callMyLogin.returnLoginStatus);
        }
        
        System.out.println("Please log in using your username >> ");
        myLogin.setTempName(inputDevice.nextLine());
        System.out.println("Please log in using your password >> ");
        myLogin.setTempPass(inputDevice.nextLine());
      
                
       
            
    }
    
}
