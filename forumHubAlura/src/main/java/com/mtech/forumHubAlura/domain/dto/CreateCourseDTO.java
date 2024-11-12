package com.mtech.forumHubAlura.domain.dto;

import com.mtech.forumHubAlura.domain.course.Categories;
import jakarta.validation.constraints.NotBlank;

public record CreateCourseDTO(@NotBlank String name, Categories category) {

}
