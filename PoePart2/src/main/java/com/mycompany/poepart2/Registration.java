/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_Lab
 */
public class Registration {
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
    
    public boolean checkUserName(String userName){
        if (userName.contains("_") && userName.length() <= 5) {
            JOptionPane.showMessageDialog(null, "Username succefully captured","Username", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else{
             JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore and no more than 5 characters in length.", "Error", JOptionPane.ERROR_MESSAGE
);
             return false;
        }
        
    }
    public boolean checkPasswordComplexity(String passWord){
       if(passWord.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*_+=-])(?=\\S+$).{5,}$")){
            JOptionPane.showMessageDialog(null, "Password succefully captured", "Password",JOptionPane.INFORMATION_MESSAGE);
            return true;
       } else {
            JOptionPane.showMessageDialog(null,"Password is not correctly formatted. Please ensure that your password contains at least eight characters, a capital letter, a number, and a special character.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
       }
    }
    public boolean checkCellPhoneNumber(String cellPhone){
        if(cellPhone.matches("^(\\+27|0)[6-8][0-9]{8}$")){//+27711234567
            JOptionPane.showMessageDialog(null,"Cell Phone number succefully added","Cell Number",JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Cell phone number incorrectly formatted or does not contain international code", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    public void signUp(){
        
        String userFirstName = JOptionPane.showInputDialog("Enter your first name",JOptionPane.INFORMATION_MESSAGE);
        String userLastName = JOptionPane.showInputDialog("Enter your last name", JOptionPane.INFORMATION_MESSAGE);
        String userName = JOptionPane.showInputDialog("Enter your username", JOptionPane.INFORMATION_MESSAGE);
        String userpassword = JOptionPane.showInputDialog("Enter your password", JOptionPane.INFORMATION_MESSAGE);
        String usercellnumber = JOptionPane.showInputDialog("Enter your cellphone number", JOptionPane.INFORMATION_MESSAGE);
        
        //loop for username
        do {
            
            if(userName == null){
                return;
            }
            if(!checkUserName(userName)){
                JOptionPane.showMessageDialog(null, "Invalid username", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }while(!checkUserName(userName));
        registeredUser = userName;
        
        //loop for password
        do{
            
            if(userpassword == null){
                return;
            }
            
            if(!checkPasswordComplexity(userpassword)){
                JOptionPane.showMessageDialog(null,"Weak password","Error",JOptionPane.ERROR_MESSAGE);
            }
        } while (!checkPasswordComplexity(userpassword));
        registeredPassword = userpassword;
        
        //loop for cellnumber
        
        if (usercellnumber == null) {
            return;
        }
        while (!checkCellPhoneNumber(usercellnumber)) {
            JOptionPane.showMessageDialog(null, "Invalid cellphone number", "Error", JOptionPane.ERROR_MESSAGE);
            usercellnumber = JOptionPane.showInputDialog("Re-enter cellphone", JOptionPane.INFORMATION_MESSAGE);
        }
        registeredPhone = usercellnumber;
////////////////////////////////////////
        if(checkUserName(userName) && checkPasswordComplexity(userpassword)){
          registeredUser = userName;
          registeredPassword = userpassword;
          JOptionPane.showMessageDialog(null, "Welcome " + userName +"," + userLastName + " it is great to see you again"); 
        }else{
          JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again", "Error", JOptionPane.ERROR_MESSAGE);
    }

               
        
    }
    public void returnLoginStatus(){
       String username = JOptionPane.showInputDialog(null, "Enter your username to login","Username",JOptionPane.INFORMATION_MESSAGE);
       String userpassword = JOptionPane.showInputDialog(null,"Enter your password to login", "Password", JOptionPane.INFORMATION_MESSAGE);
        
        if(username.equals(registeredUser) && userpassword.equals(registeredPassword)){
            JOptionPane.showMessageDialog(null,"You have succefully logged in","Note", JOptionPane.INFORMATION_MESSAGE);   
        }else{
            JOptionPane.showMessageDialog(null, "You have not logged in succefully!", "Error", JOptionPane.ERROR_MESSAGE);
        }
  
    }
    public void SignIn(){
        
        if (registeredUser == null && registeredPassword == null){
            JOptionPane.showMessageDialog(null,"You need to sign up before you can register", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String username = JOptionPane.showInputDialog("Enter yor username to login");
        String userpassword = JOptionPane.showInputDialog("Enter your password to login");
        
        if (username.equals(registeredUser) && userpassword.equals(registeredPassword)) {
             String[] options = {"Send message","Show recently sent message(coming soon)", "Exit"};
        int choices = JOptionPane.showOptionDialog(null, "Welcome to chatbot", "Options", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
        
        switch (choices){
            case 0 -> sentMessage();
            case 1 -> JOptionPane.showMessageDialog(null,"Coming soon");
            case 2 -> System.exit(0);
        }
        } else {
            JOptionPane.showMessageDialog(null," Your credentials are incorrectly entered", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void sentMessage(){
        
        String recipientNumber;
        do {
        recipientNumber = JOptionPane.showInputDialog(null, "Enter recipients number", "Number", JOptionPane.INFORMATION_MESSAGE);
        if(recipientNumber == null){
            return;
        }
        
        if(!checkCellPhoneNumber(recipientNumber)){
            JOptionPane.showMessageDialog(null,"Invalid recipient number", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
        
    } while (!checkCellPhoneNumber(recipientNumber));

     recipientPhone.add(recipientNumber); 
        
    String messageNumber = JOptionPane.showInputDialog("How many message do you want to send?", JOptionPane.QUESTION_MESSAGE);
    if(messageNumber == null){
        return;
    }
    
    try{
        int messageCount = Integer.parseInt(messageNumber);
        for(int i = 0; i < messageCount; i++){
            String message = JOptionPane.showInputDialog(null, String.format("Enter your message (%d of %d): ", i + 1, messageCount));
           
            if (message.length() >= 250) {
            JOptionPane.showMessageDialog(null, "Please enter a message of less that 250 words","Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else{
             JOptionPane.showMessageDialog(null,"Message sent", "Message", JOptionPane.INFORMATION_MESSAGE);
             
        }
           
            String[] options = {"Send", "Store", "Disregard"};
            int actions = JOptionPane.showOptionDialog(null, "Which option do you want to chose?", "Message action", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
            
            String id = checkMessageId();
            
            switch(actions){
                case 0 -> {
                  sentMessage.add(message);
                  uniqueMessageID.add(id);
                  
                  int number = sentMessage.size();
                  String hash = createMessageHash(id, number);
                  hashID.add(hash);
                  
                  JOptionPane.showMessageDialog(null,"Message sent successfully! \n Message ID: " + id + "\n Hash ID: " + hash + message.toUpperCase());
                }
                case 1 -> {
                  storeMessage.add(message);
                  JOptionPane.showMessageDialog(null,"Message was stored successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                case 2 -> {
                  disregardMessage.add(message);
                  JOptionPane.showMessageDialog(null,"Message was disregarded", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                
                default -> {
                    return;
                }
            
        }
        }
     }catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null,"Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    printMessages();
    JOptionPane.showMessageDialog(null, returnTotalMessages());
        
    
  }
    public String checkMessageId() {
        String id;
        
        do{
           int firstNumber = 1 + random.nextInt(9);
           int remainingNumber = random.nextInt(1_000_000_000);
           id = firstNumber + String.format("%09d", remainingNumber);
            
        }while(uniqueMessageID.contains(id));
        return id;
    }
    
    public String createMessageHash( String messageID, int messageNumber) {
      return messageID.substring(0, 2) + ":" + messageNumber;
    }
    
    public int returnTotalMessages(){
        return sentMessage.size();
    }
       
    public void printMessages(){
        
        if(sentMessage.isEmpty()){
            JOptionPane.showMessageDialog(null,"You did not send a message.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        StringBuilder display = new StringBuilder("\n*** SENT MESSAGES ***\n");
        for(int i = 0; i < sentMessage.size(); i++){
            display.append("Message:").append(i + i).append(":\n")
                    .append("Message HASHID: ").append(hashID.get(i)).append("\n")
                    .append("Message ID: ").append(uniqueMessageID.get(i)).append("\n")
                    .append("Message content: ").append(sentMessage.get(i)).append("\n")
                    .append("Recipients phone number").append(recipientPhone.get(i)).append("\n");
                    
        }
        JOptionPane.showMessageDialog(null, display.toString());
 
    }
}

