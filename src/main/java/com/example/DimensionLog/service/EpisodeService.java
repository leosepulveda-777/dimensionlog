package com.example.DimensionLog.service;


import com.example.DimensionLog.model.Episode;
import com.example.DimensionLog.repository.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class EpisodeService {

    private final EpisodeRepository episodeRepository;

    public List<Episode> getAll() {
        return episodeRepository.findAll();

    }

    public Optional<Episode> getById(Long id) {
        return episodeRepository.findById(id);
    }
    public Episode save(Episode episode) {
        return episodeRepository.save(episode);
    }
    public void delete(Long id) {
        episodeRepository.deleteById(id);
    }
}
