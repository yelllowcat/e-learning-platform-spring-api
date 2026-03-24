package com.spring.jpa.resources;

import java.net.URL;

public record ResourceCreateDto(
        String name,
        String size,
        URL url
) {
}
