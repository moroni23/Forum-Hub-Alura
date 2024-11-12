package com.mtech.forumHubAlura.domain.dto;

import com.mtech.forumHubAlura.domain.topic.Status;

public record UpdateTopicDTO(
        String title,
        String text,
        Status status
) {
}
