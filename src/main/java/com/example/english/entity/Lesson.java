package com.example.english.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    private Long id;
    private String title;
    private int durationInMin;
}
