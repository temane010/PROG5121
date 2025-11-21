/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_Lab
 */
public class Part3 {
    String registeredUser;
    String registeredPassword;
    String registeredPhone;
    ArrayList<String> disregardMessage = new ArrayList<>();
    ArrayList<String> storeMessage = new ArrayList<>();
    ArrayList<String> recipientPhone = new ArrayList<>();
    ArrayList<String> sentMessage = new ArrayList<>();
    ArrayList<String> hashID = new ArrayList<>();
    ArrayList<String> uniqueMessageID = new ArrayList<>();
    Random random = new Random();
    
    public void displaySenderRecipient() {
    if (sentMessage.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No sent messages");
        return;
    }

    StringBuilder sb = new StringBuilder("*** SENDERS & RECIPIENTS ***\n");

    for (int i = 0; i < sentMessage.size(); i++) {
        sb.append("Message ").append(i + 1).append(":\n")
          .append("Sender: ").append(registeredUser).append("\n")
          .append("Recipient: ").append(recipientPhone.get(i)).append("\n")
          .append("-------------\n");
    }

    JOptionPane.showMessageDialog(null, sb.toString());
}
    public void displayLongestMessage() {
    if (sentMessage.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No messages sent");
        return;
    }

    String longest = sentMessage.get(0);

    for (String msg : sentMessage) {
        if (msg.length() > longest.length()) {
            longest = msg;
        }
    }

    JOptionPane.showMessageDialog(null,
            "Longest sent message:\n" + longest);
}
public void searchMessagesByRecipient() {
     if(uniqueMessageID.isEmpty()){
            JOptionPane.showMessageDialog(null, "No unique ID to search");
        }
        String uniqueId = JOptionPane.showInputDialog(null, "Enter unique you want to search");
        if(uniqueId == null){
            return;
        }
        
        
        int id = uniqueMessageID.indexOf(uniqueId);
        
        if(id == -1){
            JOptionPane.showMessageDialog(null, "The position is not defined");
            return;
        }
        StringBuilder display = new StringBuilder("\n*** MESSAGES DETAILS ***\n");
        
            display.append("Message:").append(id).append(":\n");
            display.append("Message HASHID: ").append(hashID.get(id)).append("\n");
            display.append("Message ID: ").append(uniqueMessageID.get(id)).append("\n");
            display.append("Message content: ").append(sentMessage.get(id)).append("\n");
            display.append("Recipients phone number").append(recipientPhone.get(id)).append("\n");
                    
        
        JOptionPane.showMessageDialog(null, display.toString());
 
}
public void fullReport(){
    if (sentMessage.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No sent messages");
        return;
    }

    StringBuilder sb = new StringBuilder("*** FULL MESSAGE REPORT ***\n");

    for (int i = 0; i < sentMessage.size(); i++) {
        sb.append("Message ").append(i + 1).append(":\n")
          .append("Sender: ").append(registeredUser).append("\n")
          .append("Recipient: ").append(recipientPhone.get(i)).append("\n")
          .append("Message ID: ").append(uniqueMessageID.get(i)).append("\n")
          .append("Hash ID: ").append(hashID.get(i)).append("\n")
          .append("Content: ").append(sentMessage.get(i)).append("\n")
          .append("------------------------\n");
    }

    JOptionPane.showMessageDialog(null, sb.toString());
}
public void deleteByHash(){
        
        if (hashID.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hashId to use to delete message details");
            return;
        }
        String hash = JOptionPane.showInputDialog(null, "Enter hashId to delete a message");
        if (hash == null) {
            return;
        }
        
        int index = hashID.indexOf(hash);
        if (index != -1) {
            disregardMessage.add(sentMessage.get(index));
            sentMessage.remove(index);
            recipientPhone.remove(index);
            uniqueMessageID.remove(index);
            hashID.remove(index);
            JOptionPane.showMessageDialog(null,
                    "Message successfully deleted",
                    null,
                    JOptionPane.DEFAULT_OPTION);
        } else 
            
    JOptionPane.showMessageDialog(null,
            "No message exist with this hash!", null, JOptionPane.ERROR_MESSAGE);

}
}
