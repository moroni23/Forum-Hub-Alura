package com.mtech.forumHubAlura.domain.repository;

import com.mtech.forumHubAlura.domain.topic.Status;
import com.mtech.forumHubAlura.domain.topic.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    Page<Topic> findAllByOrderByCreatedAtDesc(Pageable pagination);

    Page<Topic> findAllByTitleContainingIgnoreCaseOrderByCreatedAtDesc(String title, Pageable pagination);

    Page<Topic> findAllByCourseNameAndStatusIsOrderByCreatedAtDesc(String course, Status status, Pageable pagination);
    Page<Topic> findAllByCourseNameOrderByCreatedAtDesc(String course, Pageable pagination);
    Page<Topic> findAllByStatusOrderByCreatedAtDesc(Status status, Pageable pagination);
}