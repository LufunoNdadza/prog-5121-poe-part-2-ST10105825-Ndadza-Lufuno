/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author ST10105825
 */
public class LoginTest 
{
    Login response = new Login ();
    
    public LoginTest() 
    {
        
    }

    @org.junit.Test
    public void testReturnLoginStatus() 
    {
     int expected = 50;
     
     int actual = response.CheckPasswordComplexity(PW);
     assertEqual (expected,actual);
    }
    
}
