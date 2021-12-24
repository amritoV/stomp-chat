package it.amrito.stompchat.dto;

public class OutputMessageDto {


    private String messageContent;


    public OutputMessageDto(){
    }
    public OutputMessageDto(String messageContent){
        this.messageContent=messageContent;
    }


    public String getContent() {
        return messageContent;
    }

    public void setContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
