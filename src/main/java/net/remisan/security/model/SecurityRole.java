package net.remisan.security.model;

import net.remisan.base.model.PersistableEntity;

public interface SecurityRole extends PersistableEntity {

    String getName();

    void setName(String name);
}
