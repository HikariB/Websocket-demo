package com.hb.websocket2;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

public class WebSocketHandler extends AbstractWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
//        super.handleTextMessage(session, message);
        System.out.println("New Text Message Received");
        session.sendMessage(message);
    }


    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
//        super.handleBinaryMessage(session, message);
        System.out.println("New Binary Message Received");
        session.sendMessage(message);
    }

}
