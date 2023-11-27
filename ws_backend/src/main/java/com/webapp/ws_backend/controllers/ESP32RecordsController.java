package com.webapp.ws_backend.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.ws_backend.repositories.ESP32RecordsRepository;

import jakarta.validation.Valid;

import com.webapp.ws_backend.entities.ESP32Records;

@RestController
@RequestMapping("/api/v1")
public class ESP32RecordsController {

    // @Autowired
    private final ESP32RecordsRepository esp32RecordsRepository;

    ESP32RecordsController(ESP32RecordsRepository esp32RecordsRepository)
    {
        this.esp32RecordsRepository = esp32RecordsRepository;
    }

    @GetMapping("/records")
    public List <ESP32Records> getAllRecords()
    {
        return esp32RecordsRepository.findAll();
    }

    @PostMapping("/records")
    public ESP32Records createRecord(@RequestBody ESP32Records record) {
        return esp32RecordsRepository.save(record);
    }

}
