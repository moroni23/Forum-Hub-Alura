package com.mtech.forumHubAlura.domain.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.mtech.forumHubAlura.domain.user.User;
import com.mtech.forumHubAlura.domain.user.UserRoles;

public record UserResponseDTO(
        Long id,
        String name,

        @JsonProperty("is_active")
        boolean isActive,

        UserRoles role) {

    public UserResponseDTO(User user) {
        this(user.getId(), user.getName(), user.isActive(), user.getRole());
    }
}
