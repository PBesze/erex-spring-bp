package com.example.demo.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.example.demo.model.Place;

@Scope(value = "session")
@Component(value = "placeController")
public class PlaceController {
    @Autowired
    private PlaceRepository placeRepository;

    private Place place = new Place();

    public String save() {
        placeRepository.save(place);
        place = new Place();
        return "/place-list.xhtml?faces-redirect=true";
    }
    
    public String update(Place place) {
        placeRepository.save(place);
        return "/place-list.xhtml?faces-redirect=true";
    }

    public Place getPlace() {
        return place;
    }
}
