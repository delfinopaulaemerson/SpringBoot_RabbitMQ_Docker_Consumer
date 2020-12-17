package com.example.spring.consumer.implementation;

import com.example.spring.consumer.dto.Message;
import com.example.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {


    @Override
    public void action(Message message) {

        System.out.println(" Mensagem Consumida => " +message.getText());

    }
}
