package com.example.liveasy_assignment.dao;

import com.example.liveasy_assignment.entities.LoadData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LoadDao extends JpaRepository<LoadData,Long> {
    List<LoadData> findByShipperID(UUID shipperID);
}
