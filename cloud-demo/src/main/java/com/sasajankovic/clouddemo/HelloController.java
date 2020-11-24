package com.sasajankovic.clouddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private CounterRepository counterRepository;

    @Value("${CUSTOM_ENV}")
    private String customEnv;

    @GetMapping("hello")
    public String hello() {
        Counter counter = counterRepository.findById(1l).get().incrementCounter();
        counterRepository.save(counter);
        return String.format("%s %d", customEnv, counter.getCounter());
    }
}
