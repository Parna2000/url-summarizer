package com.example.Spring_Boot.service;

import com.example.Spring_Boot.model.SummaryRequest;
import com.example.Spring_Boot.repository.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SummarizerService {

    @Autowired
    private SummaryRepository summaryRepository;

    public SummaryRequest summarize(SummaryRequest summaryRequest) {
        // Make a call to Python FastAPI service to summarize the URL content
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "http://localhost:8000/summarize"; // URL of the Python FastAPI service
        SummaryRequest response = restTemplate.postForObject(apiUrl, summaryRequest, SummaryRequest.class);

        // Save the summary request and response to the database
        assert response != null;
        summaryRequest.setSummary(response.getSummary());
        return summaryRepository.save(summaryRequest);
    }

    public List<SummaryRequest> getHistory() {
        return summaryRepository.findAll();
    }
}
