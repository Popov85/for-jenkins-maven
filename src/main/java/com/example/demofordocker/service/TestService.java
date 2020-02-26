package com.example.demofordocker.service;

import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class TestService {

    public String getData(@NonNull final String name) {
        return "Response: "+OffsetDateTime.now().toString()+" for: "+name;
    }
}
