package com.example.english.service;

import com.example.english.entity.Lesson;
import com.example.english.repository.LessonInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class LessonServiceImpl implements LessonService{

    private final LessonInterface lessonInterface;

    @Override
    @Transactional
    public Lesson getById(Long id) {
        return lessonInterface.getById(id);
    }

    @Override
    @Transactional
    public void saveLesson(Lesson lesson) {
        lessonInterface.save(lesson);
    }
}
