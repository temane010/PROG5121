/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart2;

/**
 *
 * @author RC_Student_Lab
 */
public class PoePart2 {

    public static void main(String[] args) {
        Registration obj = new Registration();
        
     
        obj.signUp();
        obj.returnLoginStatus();
        obj.SignIn();
        obj.returnLoginStatus();
        obj.sentMessage();
        obj.checkMessageId();
        obj.returnTotalMessages();
        obj.printMessages();   
        
    }
}
