package com.example.demofordocker.web;

import com.example.demofordocker.service.TestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping(value="/test/data")
    public ResponseEntity<String> getData(@RequestParam(required = false) String name) {
        log.debug("Request arrived with name = {}", name!=null ? name : "Name is not present");
        if (name==null) name = "Name is not present";
        return ResponseEntity.ok(testService.getData(name));
    }
}
