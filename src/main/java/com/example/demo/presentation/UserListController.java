package com.example.demo.presentation;

import com.example.demo.model.Place;
import com.example.demo.model.User;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Scope (value = "session")
@Component (value = "userList")
public class UserListController {
    @Autowired
    private UserRepository userRepository;

    private List<User> users;


    public void loadData() {
        users = userRepository.findAll();
    }

    public List<User> getUsers() {
    	users = userRepository.findAll();
        return users;
    }
    
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("uuups sorry - User not Edited...yet", ((User) event.getObject()).getNick());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((User) event.getObject()).getNick());
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