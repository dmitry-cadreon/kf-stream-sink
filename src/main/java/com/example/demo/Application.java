package com.example.demo;

import com.example.demo.model.Campaign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;

@Slf4j
@SpringBootApplication
@EnableBinding(Sink.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @StreamListener(Sink.INPUT)
    public void processCampaign(Campaign campaign) {
        log.info("[x]Processing campaign: " + campaign);
    }
}
