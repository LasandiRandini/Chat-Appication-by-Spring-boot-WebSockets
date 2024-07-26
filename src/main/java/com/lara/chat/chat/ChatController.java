package com.lara.chat.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    //msg to users
    //msg to sender
    //this mapping invokes what is the URL to sent msg
    //sent to-to which topic  to send
    @MessageMapping("chat.sendMessage")
    @SendTo("topic/public")
    public ChatMassage sentMessage(
           @Payload ChatMassage chatMassage

    ){
return chatMassage;
    }
    public ChatMessage addUser(
            @Payload
    )
}
