package com.mtech.forumHubAlura.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateTopicDTO(
        Long id,
        @NotBlank
        String title,
        @NotBlank
        String text,

        @NotNull
        Long course
) {

    public CreateTopicDTO(String title, String text, Long course) {
        this(null, title, text, course);
    }
}
