package it.amrito.stompchat.controller;


import it.amrito.stompchat.dto.InputMessageDto;
import it.amrito.stompchat.dto.OutputMessageDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public OutputMessageDto sendMessage(InputMessageDto inputMessageDto){
        return new OutputMessageDto(inputMessageDto.getInputContent());

    }
}
