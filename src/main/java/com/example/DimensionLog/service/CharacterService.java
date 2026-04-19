package com.example.DimensionLog.service;

import com.example.DimensionLog.model.Character;
import com.example.DimensionLog.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    public List<Character> getAll () {
        return characterRepository.findAll();
    }

    public Optional<Character> getById (Long id){
        return characterRepository.findById(id);
    }
    public Character save(Character character){
        return characterRepository.save(character);
    }
    public void delete(Long id){
        characterRepository.deleteById(id);
    }
}
