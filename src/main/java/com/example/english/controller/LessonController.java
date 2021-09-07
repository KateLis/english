package com.example.english.controller;

import com.example.english.entity.Lesson;

import java.util.List;

public interface LessonController {
    Lesson getById(Long id);
    void saveLesson(Lesson lesson);
    void deleteLessonById(Long id);
    List<Lesson> getAll();
    List<Lesson> findByTitleEquals(String title);
    List<Lesson> findByTitleStartingWith(String prefix);
    List<Lesson> findByDurationInMinGreaterThan(Integer durationInMin);
}
