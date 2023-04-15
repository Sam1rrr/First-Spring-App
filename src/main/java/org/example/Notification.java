package org.example;

public class Notification {
    private Message message;   //property

    public Notification(Message message) {
        this.message = message;
    }

    public Notification() {
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void alert() {
        System.out.println("Notification...");
        message.send();
    }
}
