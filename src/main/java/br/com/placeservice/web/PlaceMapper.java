package br.com.placeservice.web;

import br.com.placeservice.api.PlaceResponse;
import br.com.placeservice.domain.Place;

public class PlaceMapper {

    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(), place.state(),
                place.createdAt(), place.updatedAt());
    }
}
