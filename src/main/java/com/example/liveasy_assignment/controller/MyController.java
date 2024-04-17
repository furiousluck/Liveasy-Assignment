package com.example.liveasy_assignment.controller;

import com.example.liveasy_assignment.entities.LoadData;
import com.example.liveasy_assignment.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class MyController {

    @Autowired
    private LoadService loadService;

    @GetMapping("/home")
    public List<LoadData> home(){
        return this.loadService.getAllLoads();
    }

    @GetMapping("/loads/{shipperID}")
    public List<LoadData> getLoadData(@PathVariable UUID shipperID){
        return this.loadService.getLoadData(shipperID);
    }

    @GetMapping("/load/{loadId}")
    public LoadData getLoad(@PathVariable String loadId){
        return this.loadService.getLoad(Long.parseLong(loadId));
    }

    @PutMapping("/load/{loadId}")
    public ResponseEntity<String> updateLoad(@PathVariable String loadId, @RequestBody LoadData loadData)
    {
        return this.loadService.updateLoad(Long.parseLong(loadId), loadData);
    }

    @DeleteMapping("/load/{loadId}")
    public ResponseEntity<String> deleteLoad(@PathVariable String loadId)
    {
        return this.loadService.deleteLoad(Long.parseLong(loadId));
    }

    @PostMapping(value = "/load",consumes = "application/json")
    public LoadData addLoad(@RequestBody LoadData load){
        return this.loadService.addLoad(load);
    }
}
