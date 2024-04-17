package com.example.liveasy_assignment.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Setter
@Getter
@Entity
@Repository
public class LoadData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private String weight;
    private String comment;
    private UUID shipperID;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private String date;

    public LoadData() {
        super();
    }
}
