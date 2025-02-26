package com.example.SpringAi_gen.Controllers;

import com.example.SpringAi_gen.Services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/chatbot")
@RestController
public class GenAiController {
    @Autowired
    ChatService chatService;

    @GetMapping("/get-response/{prompt}")
    public String getResponse(@PathVariable String prompt){
        try {
            return chatService.getResponse(prompt);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
