package com.chatt.app.chatroamapp.Models;

public class MessPrivate {
    private String text;
    private String to;


    public String getText(){
        return text;
    }
    public String getTo(){
        return to;
    }

    public void setTo(String to){
        this.to=to;
    }
}
