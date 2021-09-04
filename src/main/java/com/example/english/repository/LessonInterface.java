package com.example.english.repository;

import com.example.english.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonInterface extends JpaRepository <Lesson, Long> {
}
