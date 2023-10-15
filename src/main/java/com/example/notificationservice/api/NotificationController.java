package com.example.notificationservice.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class NotificationController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getSampleNotification() {
        log.info("Get sample notification");
        return "Sample notification";
    }
}
