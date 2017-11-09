package com.example.demo.presentation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.example.demo.model.Place;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

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
    
    public void onRowEdit(RowEditEvent event) {
   // 	@TODO modified values of place in the row have to be saved/updated 
    //	placeRepository.saveAndFlush(((Place) event.getNewValue()));
    	FacesMessage msg = new FacesMessage("uuups sorry - Place not yet Edited", ((Place) event.getObject()).getName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Place) event.getObject()).getName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
}
