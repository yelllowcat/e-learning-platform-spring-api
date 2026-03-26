package com.spring.jpa.resources;

import java.net.URL;

public record ResourceResponseDto(
        String name,
        int size,
        String url
) {
}
