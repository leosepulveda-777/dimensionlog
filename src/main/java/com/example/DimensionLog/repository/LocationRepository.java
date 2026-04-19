package com.example.DimensionLog.repository;


import com.example.DimensionLog.model.Episode;
import com.example.DimensionLog.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository   extends JpaRepository<Location,Long> {
}
