package com.example.Spring.Webflux.Test.service;

import reactor.core.publisher.Flux;

public class UppercaseConverter {

    public final Flux<String> source;

    public UppercaseConverter(Flux<String> source) {
        this.source = source;
    }
    public Flux<String> getUpperCase() {
        return source
                .map(String::toUpperCase);
    }

}