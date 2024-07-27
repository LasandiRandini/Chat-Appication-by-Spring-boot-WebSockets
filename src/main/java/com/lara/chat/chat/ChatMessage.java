package com.lara.chat.chat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMassage {
    private String content;
    private  String sender;
    private MassageType type;
}
