package com.example.DimensionLog.controller;


import com.example.DimensionLog.model.Location;
import com.example.DimensionLog.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/locations")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class LocationController {
    private final LocationService locationService;

    @GetMapping
    public List<Location> getLocations(){
        return locationService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Location> getById(@PathVariable Long id){
        return locationService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Location create (@RequestBody Location location){
        return locationService.save(location);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        locationService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
