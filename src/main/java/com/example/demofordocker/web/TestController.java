package com.example.demofordocker.web;

import com.example.demofordocker.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping(value="/test/data", params = "name")
    public ResponseEntity<String> getData(@RequestParam String name) {
        return ResponseEntity.ok(testService.getData(name));
    }
}
