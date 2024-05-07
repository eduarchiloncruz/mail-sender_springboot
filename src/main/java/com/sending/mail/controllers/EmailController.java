package com.sending.mail.controllers;

import com.sending.mail.services.IEmailService;
import com.sending.mail.services.models.EmailDTO;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/send-email")
@CrossOrigin("*")
public class EmailController {

    @Autowired
    IEmailService emailService;

    @PostMapping
    public ResponseEntity<Map<String, String>> sendEmail(@RequestBody EmailDTO emailDTO) throws MessagingException {
        emailService.sendEmail(emailDTO);
        Map<String, String> response = new HashMap<>();
        response.put("response", "Email sent successfully");

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
