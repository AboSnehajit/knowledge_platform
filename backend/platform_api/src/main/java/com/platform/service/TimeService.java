package com.platform.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimeService {

    public  String getTime()
    {
        return LocalDateTime.now().toString();
    }

}

