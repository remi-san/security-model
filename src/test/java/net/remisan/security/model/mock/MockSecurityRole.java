package net.remisan.security.model.mock;

import net.remisan.security.model.SecurityRole;

public class MockSecurityRole implements SecurityRole {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isNew() {
        return this.id == null;
    }

}
