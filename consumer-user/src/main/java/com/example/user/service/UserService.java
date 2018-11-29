package com.example.user.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void getTicket(){
        String ticket = ticketService.getTicket();
        System.out.println(ticket);
    }

}
