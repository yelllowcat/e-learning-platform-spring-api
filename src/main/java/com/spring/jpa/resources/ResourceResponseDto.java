package com.spring.jpa.resources;

import java.net.URL;

public record ResourceResponseDto(
        String name,
        String size,
        URL url
) {
}
