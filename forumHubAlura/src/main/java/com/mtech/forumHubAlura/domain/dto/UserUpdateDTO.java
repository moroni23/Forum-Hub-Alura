package com.mtech.forumHubAlura.domain.dto;

import jakarta.validation.constraints.Email;

public record UserUpdateDTO(
        String name,
        @Email
        String email,
        String password) {
}

