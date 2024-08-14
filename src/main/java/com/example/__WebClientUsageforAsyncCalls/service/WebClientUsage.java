package com.example.__WebClientUsageforAsyncCalls.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientUsage {
    private static final String DUMMY_API_URL="https://jsonplaceholder.typicode.com/posts";
    public void syncCall(){
        System.out.println("start of  call");
        WebClient webClient = WebClient.create();
        String response = webClient.get().uri(DUMMY_API_URL).retrieve().bodyToMono(String.class).block();
        System.out.println(response);
        System.out.println("end of  call");
    }
    public void aSyncCall(){
        System.out.println("start of  call");
        WebClient webClient = WebClient.create();
        webClient.get().uri(DUMMY_API_URL).retrieve().bodyToMono(String.class).subscribe(response-> System.out.println(response));
        //jab bhi response aayega wo subscribe mai pass ho jayega as Lambda expression parameter (non blocking hoga
        // async way mai)
        System.out.println("end of  call");
    }
}
