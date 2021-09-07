package com.example.english.repository;

import com.example.english.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonInterface extends JpaRepository <Lesson, Long> {
    List<Lesson> findByTitleEquals(String title);

    List<Lesson> findByTitleStartingWith(String prefix);

    List<Lesson> findByDurationInMinGreaterThan(Integer durationInMin);
}
