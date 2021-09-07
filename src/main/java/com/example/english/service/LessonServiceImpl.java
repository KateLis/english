package com.example.english.service;

import com.example.english.entity.Lesson;
import com.example.english.repository.LessonInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    @Override
    @Transactional
    public void deleteLessonById(Long id) {
        lessonInterface.deleteById(id);
    }

    @Override
    @Transactional
    public List<Lesson> getAll() {
        return lessonInterface.findAll();
    }

    @Override
    public List<Lesson> findByTitleEquals(String title) {
        return lessonInterface.findByTitleEquals(title);
    }

    @Override
    public List<Lesson> findByTitleStartingWith(String prefix) {
        return lessonInterface.findByTitleStartingWith(prefix); //а надо их одинаково называть методы в сервисе и интерфейсе
    }

    @Override
    public List<Lesson> findByDurationInMinGreaterThan(Integer durationInMin) {
        return lessonInterface.findByDurationInMinGreaterThan(durationInMin);
    }

}
