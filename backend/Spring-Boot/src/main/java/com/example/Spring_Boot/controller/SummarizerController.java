package com.example.Spring_Boot.controller;

import com.example.Spring_Boot.model.SummaryRequest;
import com.example.Spring_Boot.service.SummarizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SummarizerController {

    @Autowired
    private SummarizerService summarizerService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/summarize")
    public SummaryRequest summarize(@RequestBody SummaryRequest summaryRequest) {
        return summarizerService.summarize(summaryRequest);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/history")
    public List<SummaryRequest> getHistory() {
        return summarizerService.getHistory();
    }
}
