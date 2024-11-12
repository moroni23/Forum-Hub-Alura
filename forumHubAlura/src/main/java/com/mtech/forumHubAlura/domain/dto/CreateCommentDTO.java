package com.mtech.forumHubAlura.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateCommentDTO(@NotBlank String text) {
}
