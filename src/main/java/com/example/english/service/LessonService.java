package com.example.english.service;

import com.example.english.entity.Lesson;

import java.util.List;

public interface LessonService {
    Lesson getById(Long id);
    void saveLesson(Lesson lesson);
    void deleteLessonById(Long id);
    List<Lesson> getAll();
    List<Lesson> findByTitleEquals(String title);
    List<Lesson> findByTitleStartingWith(String prefix);
    List<Lesson> findByDurationInMinGreaterThan(Integer durationInMin);//а почему не int?
}
