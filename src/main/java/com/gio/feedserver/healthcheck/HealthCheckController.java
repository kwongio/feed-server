package com.gio.feedserver.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {

    @GetMapping("/ready")
    public String readinessProbe() {
        return "OK";
    }

    @GetMapping("/live")
    public String livenessProbe() {
        return "OK";
    }
}
