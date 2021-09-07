package com.example.english.controller;

import com.example.english.entity.Lesson;
import com.example.english.service.LessonService;
import com.example.english.service.LessonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LessonControllerImpl implements LessonController{
    private final LessonServiceImpl lessonService;

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

    @Override
    @DeleteMapping("/lesson/id/{id}")
    public void deleteLessonById(Long id) {
        lessonService.deleteLessonById(id);
    }

    @Override
    @GetMapping("/lesson")
    public List<Lesson> getAll() {
        return lessonService.getAll();
    }

    @Override
    @GetMapping("/lesson/title/{title}")
    public List<Lesson> findByTitleEquals(@PathVariable(name ="title") String title) {
        return lessonService.findByTitleEquals(title);
    }

    @Override
    @GetMapping("/lesson/title/{prefix}")
    public List<Lesson> findByTitleStartingWith(@PathVariable(name="title") String prefix) {
        return lessonService.findByTitleStartingWith(prefix);
    }

    @Override
    @GetMapping("/lesson/duration/{durationInMin}")
    public List<Lesson> findByDurationInMinGreaterThan(@PathVariable(name="durationInMin")Integer durationInMin) {
        return lessonService.findByDurationInMinGreaterThan(durationInMin);
    }
    //если я хочу сначала найти все уроки длиннее 10мин, а потом заменить их в табл, то какой алгоритм?

}
