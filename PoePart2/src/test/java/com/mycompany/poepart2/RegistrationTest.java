/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_Lab
 */
public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Registration.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkUserName(userName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPasswordComplexity method, of class Registration.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String passWord = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(passWord);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class Registration.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellPhone = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(cellPhone);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of signUp method, of class Registration.
     */
    @Test
    public void testSignUp() {
        System.out.println("signUp");
        Registration instance = new Registration();
        instance.signUp();
        
    }

    /**
     * Test of returnLoginStatus method, of class Registration.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        Registration instance = new Registration();
        instance.returnLoginStatus();
        
    }

    /**
     * Test of SignIn method, of class Registration.
     */
    @Test
    public void testSignIn() {
        System.out.println("SignIn");
        Registration instance = new Registration();
        instance.SignIn();
       
    }

    /**
     * Test of sentMessage method, of class Registration.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        Registration instance = new Registration();
        instance.sentMessage();
       
    }

    /**
     * Test of checkMessageId method, of class Registration.
     */
    @Test
    public void testCheckMessageId() {
        System.out.println("checkMessageId");
        Registration instance = new Registration();
        String expResult = "";
        String result = instance.checkMessageId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createMessageHash method, of class Registration.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String messageID = "";
        int messageNumber = 0;
        Registration instance = new Registration();
        String expResult = "";
        String result = instance.createMessageHash(messageID, messageNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnTotalMessages method, of class Registration.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        Registration instance = new Registration();
        int expResult = 0;
        int result = instance.returnTotalMessages();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printMessages method, of class Registration.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        Registration instance = new Registration();
        instance.printMessages();
        
    }
    
}
