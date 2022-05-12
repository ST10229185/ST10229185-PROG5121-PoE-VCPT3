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

public class Login 
{
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String username2;
    private String password2;
    
    public Login()
    {
        username = null;
        password = null;
        firstName = null;
        lastName = null;
        username2 = null;
        password2 = null;
    }
    
    public boolean checkUsername()
    {
        return (username.length() <= 5) && (username.contains("_"));
    }
    
    
    public boolean checkPassword()
    {
        if (password.length() < 8)
        {
            return false;
        }
        else
        {
            boolean upper = false;
            boolean special = false;
            boolean digit = false;
            char b = 0;
            for (int i = 0; i < password.length(); i++)
            {
                b = password.charAt(b);
                if(Character.isDigit(b))
                {
                    digit = true;
                }
                else if ((!Character.isDigit(b))&& (!Character.isLetter(b)))
                {
                    special = true;
                }
                else if (Character.isUpperCase(b))
                {
                    upper = true;
                }
            }
            return (upper && special && digit);
        }   
    }
    
    public String registerUsername()
    {
        if (checkUsername() == false)
        {
            return "Username is invaild. please make sure that your username contains an underscore and is no more than 5 character in length";
        }
        else if (checkPassword() == false)
        {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters,a capital letter, a number and a special character.";
        }
        else
        {
            return "You information has been successfully captured";
        }
    }
    
    public boolean loginUsername()
    {
        boolean var = (username2.equals(username)) && (password2.equals(password));
        return var;
    }
    
    public String returnLoginStatus()
    {
        if (loginUsername() == false)
        {
            return "Username or password is incorrect, please try again";
        }
        else
        {
            return "Welcome"+firstName+""+lastName+" It is great to see you again";
        }
    }
    
    public void setUsername(String username)
    {
        username = username;
    }
    
    public void setPassword(String password)
    {
        password = password;
    }
    
    public void setFirstName(String firstName)
    {
        firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        lastName = lastName;
    }
    
    public void setTempName(String username2)
    {
        username2 = username2;
    }
    
    public void setTempPass(String password2)
    {
        password2 = password2;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getUsername2()
    {
        return username2;
    }
    
    public String getPassword2()
    {
        return password2;
    }
    
        
            
            
            
    
       
}
