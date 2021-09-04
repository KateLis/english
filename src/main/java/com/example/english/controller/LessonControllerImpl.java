package com.example.english.controller;

import com.example.english.entity.Lesson;
import com.example.english.service.LessonService;
import com.example.english.service.LessonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class LessonControllerImpl implements LessonController{
    private LessonServiceImpl lessonService;

    @Override
    @GetMapping("/lesson/id/{id}")
    public Lesson getById(@PathVariable(name ="id") Long id) {
        return lessonService.getById(id);
    }

    @Override
    @PostMapping("/lesson")
    public void saveLesson(@RequestBody Lesson lesson) {
        lessonService.saveLesson(lesson);
    }
}
