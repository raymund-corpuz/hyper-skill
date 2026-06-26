package org.hyperskill.message.admin;

import org.hyperskill.message.Message;
import org.hyperskill.message.Person;

public class Admin extends Person {
    private String department;

    protected Admin(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    String displayProfile(){
        return this.name + " - " + this.department;
    }

   Message[] deleteMessage(Message[] messages, int index){
       for(int i = 0; i < messages.length; i++){
           if(messages[i] !== index){
               return messages;
           }
       }
    }
}
