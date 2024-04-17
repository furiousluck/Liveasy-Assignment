package com.example.liveasy_assignment.services;


import com.example.liveasy_assignment.dao.LoadDao;
import com.example.liveasy_assignment.entities.LoadData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LoadServiceImpl implements LoadService {


    private final LoadDao loadDao;

    @Autowired
    public LoadServiceImpl(LoadDao loadDao) {
        this.loadDao = loadDao;
    }

    @Override
    public List<LoadData> getAllLoads() {
        return loadDao.findAll();
    }

    @Override
    public List<LoadData> getLoadData(UUID shipperID) {
        return loadDao.findByShipperID(shipperID);
    }


    @Override
    public LoadData getLoad(long loadId) {
        Optional<LoadData> loadData = loadDao.findById(loadId);
        return loadData.orElse(null);
    }

    @Override
    public ResponseEntity<String> updateLoad(long loadId, LoadData loadData) {
        Optional<LoadData> x = loadDao.findById(loadId);
        if(x.isPresent())
        {
            LoadData load = x.get();
            if (loadData.getLoadingPoint() != null) {
                load.setLoadingPoint(loadData.getLoadingPoint());
            }
            if (loadData.getUnloadingPoint() != null) {
                load.setUnloadingPoint(loadData.getUnloadingPoint());
            }
            if (loadData.getProductType() != null) {
                load.setProductType(loadData.getProductType());
            }
            if (loadData.getTruckType() != null) {
                load.setTruckType(loadData.getTruckType());
            }
            if (loadData.getNoOfTrucks() != null) {
                load.setNoOfTrucks(loadData.getNoOfTrucks());
            }
            if (loadData.getWeight() != null) {
                load.setWeight(loadData.getWeight());
            }
            if (loadData.getComment() != null) {
                load.setComment(loadData.getComment());
            }
            if (loadData.getDate() != null) {
                load.setDate(loadData.getDate());
            }
            loadDao.save(load);
            return ResponseEntity.ok("Updated");
        }

        return ResponseEntity.ok("Not Found");
    }

    @Override
    public ResponseEntity<String> deleteLoad(long load) {
        Optional<LoadData> x = loadDao.findById(load);
        if(x.isPresent())
        {
            loadDao.delete(x.get());
            return ResponseEntity.ok("Deleted");
        }
        return ResponseEntity.ok("Not Found");
    }

    @Override
    public LoadData addLoad(LoadData load) {
        loadDao.save(load);
        return load;
    }
}
