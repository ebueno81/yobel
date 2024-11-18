package com.example.yobel.dto;

import com.example.yobel.model.Characters;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {

    private List<Characters> results;

    public List<Characters> getResults() {
        return results;
    }

    public void setResults(List<Characters> results) {
        this.results = results;
    }
}
