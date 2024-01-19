package com.chatt.app.chatroamapp.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer{
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic","/specific");
        registry.setApplicationDestinationPrefixes("/app");

        //send message      /app/message    {messag json}
        //to suscribe so that we can recieve messages=> /topic/return-to

        
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //to connect with server
        registry.addEndpoint("server1").withSockJS();
    }
}
