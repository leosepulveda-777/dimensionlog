package com.example.DimensionLog.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "episodes")

public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String airDate;
    private String episode;
    private String url;
    private String created;
}
