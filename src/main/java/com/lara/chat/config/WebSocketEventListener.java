package com.lara.chat.config;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@RequiredArgsConstructor
@Component
@Slf4j
public class WebSocketEventListener {

    //we want to inform if a user in the chat application has left the chat
@EventListener
    public void handleWebSocketDisconnectListener(
            SessionDisconnectEvent event
    ){
//TODO
}

}
