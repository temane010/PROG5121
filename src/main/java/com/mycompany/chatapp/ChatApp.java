/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

/**
 *
 * @author RC_Student_Lab
 */
public class ChatApp {

    public static void main(String[] args) {
  
        Part2 reg = new Part2();
        Part3 part3 = new Part3();

        
        reg.signUp();
        reg.returnLoginStatus();

        reg.SignIn();
        reg.returnLoginStatus();

        reg.sentMessage();
        reg.checkMessageId();
        reg.returnTotalMessages();
        reg.printMessages();

        
        part3.displaySenderRecipient();
        part3.displayLongestMessage();
        part3.searchMessagesByRecipient();
        part3.fullReport();
    }
}
