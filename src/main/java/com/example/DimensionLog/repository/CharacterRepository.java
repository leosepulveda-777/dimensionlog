package com.example.DimensionLog.repository;


import com.example.DimensionLog.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CharacterRepository  extends JpaRepository<Character,Long> {
}
