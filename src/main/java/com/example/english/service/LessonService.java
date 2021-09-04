package com.example.english.service;

import com.example.english.entity.Lesson;

public interface LessonService {
    Lesson getById(Long id);
    void saveLesson(Lesson lesson);
}
