package com.example.liveasy_assignment.services;

import com.example.liveasy_assignment.entities.LoadData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface LoadService{

    public List<LoadData> getAllLoads();

    List<LoadData> getLoadData(UUID shipperID);

    LoadData getLoad(long loadId);

    ResponseEntity<String> updateLoad(long loadId, LoadData loadData);

    ResponseEntity<String> deleteLoad(long load);

    LoadData addLoad(LoadData load);
}
