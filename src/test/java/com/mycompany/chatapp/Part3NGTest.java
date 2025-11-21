/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.chatapp;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author RC_Student_Lab
 */
public class Part3NGTest {
    
    public Part3NGTest() {
    }

    @Test
    public void testDisplaySenderRecipient() {
        System.out.println("displaySenderRecipient");
        Part3 instance = new Part3();
        instance.displaySenderRecipient();
       
    }

    @Test
    public void testDisplayLongestMessage() {
        System.out.println("displayLongestMessage");
        Part3 instance = new Part3();
        instance.displayLongestMessage();
        
    }

    @Test
    public void testSearchMessagesByRecipient() {
        System.out.println("searchMessagesByRecipient");
        Part3 instance = new Part3();
        instance.searchMessagesByRecipient();
        
    }

    @Test
    public void testFullReport() {
        System.out.println("fullReport");
        Part3 instance = new Part3();
        instance.fullReport();
      
    }

    @Test
    public void testDeleteByHash() {
        System.out.println("deleteByHash");
        Part3 instance = new Part3();
        instance.deleteByHash();
        
    }
    
}
