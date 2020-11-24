package com.sasajankovic.clouddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private CounterRepository counterRepository;

    @GetMapping("hello")
    public int hello() {
        Counter counter = counterRepository.findById(1l).get().incrementCounter();
        counterRepository.save(counter);
        return counter.getCounter();
    }
}
