package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class ConferenceService {

    private static final List<String> CONFERENCES = Arrays.asList(
            "Greach",
            "GR8Conf EU",
            "Micronaut Summit",
            "Devoxx Belgium",
            "Oracle Code One",
            "CommitConf",
            "Codemotion Madrid"
    );

    public String randomConf() {
        return CONFERENCES.get(new Random().nextInt(CONFERENCES.size()));
    }
}
