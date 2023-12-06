package br.com.placeservice.api;

import java.time.LocalDateTime;

public record PlaceRequest(
        String name, String state
) {
}
