package com.mtech.forumHubAlura.domain.repository;

import com.mtech.forumHubAlura.domain.comment.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findAllByTopicId(Pageable pagination, Long id);
}
