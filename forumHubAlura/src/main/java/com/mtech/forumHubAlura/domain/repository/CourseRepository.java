package com.mtech.forumHubAlura.domain.repository;

import com.mtech.forumHubAlura.domain.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
