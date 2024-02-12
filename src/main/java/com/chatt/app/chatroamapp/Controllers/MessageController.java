package com.chatt.app.chatroamapp.Controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chatt.app.chatroamapp.Models.MessPrivate;
import com.chatt.app.chatroamapp.Models.Message;

@RestController
public class MessageController {


    SimpMessagingTemplate simpMessagingTemplate;

    //mapped as app/application
    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        // try{
        //     //processing dataBse
        //     Thread.sleep(1000);
        // }catch(InterruptedException e){
        //     e.printStackTrace();
        // }
        return message;
    }

    //Mapped as /app/private
    // @MessageMapping ("/private-message")
    // public MessPrivate sendToSpecfic(@Payload MessPrivate message){

    //    simpMessagingTemplate.convertAndSendToUser(
    //     message.getTo(), "/private", message);  // /user/Demo/private
    //     return message;
    // }
}
