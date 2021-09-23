package com.example.test.Job;

import org.springframework.http.ResponseEntity;
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
        RestTemplate restTemplate = new RestTemplate();
        Job job = restTemplate.getForObject(uri, Job.class);

        return job;
    }

    @GetMapping("/jobs")
    public Job[] getJobs() {
        String uri = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";

        // call API
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Job[]> response = restTemplate.getForEntity(uri, Job[].class);
        Job[] job = response.getBody();

        return job;
    }
}
