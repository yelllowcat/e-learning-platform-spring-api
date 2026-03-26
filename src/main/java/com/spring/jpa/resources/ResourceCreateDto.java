package com.spring.jpa.resources;

import java.net.URL;

public record ResourceCreateDto(
        String name,
        int size,
        String url
) {
}
