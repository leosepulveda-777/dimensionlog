package com.example.DimensionLog.controller;

import com.example.DimensionLog.model.Episode;
import com.example.DimensionLog.service.EpisodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/episodes")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class EpisodeController {

    private final EpisodeService episodeService;

    @GetMapping
    public List<Episode> getAll() {
        return episodeService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Episode> getById(@PathVariable Long id) {
        return episodeService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Episode create(@RequestBody Episode episode) {
        return episodeService.save(episode);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        episodeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}