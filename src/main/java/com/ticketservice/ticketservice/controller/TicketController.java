package com.ticketservice.ticketservice.controller;

import com.ticketservice.ticketservice.repo.TicketRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket-api")
@RequiredArgsConstructor
public class TicketController {

    private final TicketRepo repo;

}
