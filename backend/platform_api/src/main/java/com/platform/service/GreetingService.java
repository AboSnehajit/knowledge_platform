package com.platform.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Scope("prototype")
public class GreetingService {


    private final UUID id = UUID.randomUUID();

    public UUID  getid()
    {  return id;}

    public String greeting()
    {
        return "Greetings uwu";
    }
}
