package se.kth.id2212.lecture11;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "user")
@SessionScoped
public class User implements Serializable {
    private static final long serialVersionUID = -7724965387678437072L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
