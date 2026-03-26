package com.spring.jpa.authors;

public record AuthorCreateDto(
        String firstName,
        String secondName,
        String email,
        Integer age
) {
}
