package com.example.english.controller;

import com.example.english.entity.Lesson;

public interface LessonController {
    Lesson getById(Long id);
    void saveLesson(Lesson lesson);
}
