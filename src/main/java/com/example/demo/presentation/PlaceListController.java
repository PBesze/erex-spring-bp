package com.example.demo.presentation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.example.demo.model.Place;
import java.util.List;

@Scope (value = "session")
@Component (value = "placeList")
public class PlaceListController {
    @Autowired
    private PlaceRepository placeRepository;

    private List<Place> places;


    public void loadData() {
        places = placeRepository.findAll();
    }

    public List<Place> getPlaces() {
    	places = placeRepository.findAll();
        return places;
    }
}
