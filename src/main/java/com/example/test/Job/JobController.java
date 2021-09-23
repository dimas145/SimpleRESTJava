package com.example.test.Job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JobController {

    @GetMapping("/job")
    public Job getJobDetail(@RequestParam(value = "id") String id) {
        String uri = "http://dev3.dansmultipro.co.id/api/recruitment/positions/" + id;

        // call API
        RestTemplate test = new RestTemplate();
        Job job = test.getForObject(uri, Job.class);

        return job;
    }
}
