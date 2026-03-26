package com.spring.jpa.authors;

public record AuthorResponseDto (
        String firstName,
        String secondName,
        String email,
        Integer age
){
}
