package testing;

import java.util.Iterator;
import java.util.Set;

public class Users {
    private boolean active;
    private String name;
    private Set<String> roles;

    public Users(boolean active, String name, Set<String> roles) {
        this.active = active;
        this.name = name;
        this.roles = roles;
    }



    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
