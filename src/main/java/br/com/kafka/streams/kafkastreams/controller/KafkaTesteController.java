package br.com.kafka.streams.kafkastreams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaTesteController {

    @GetMapping
    public String get() {
        System.out.println("VAMOOOOOOOOOOOOOOOO");
        return "CHUPA QUE É DE UVA!!!!!!!";
    }
}
