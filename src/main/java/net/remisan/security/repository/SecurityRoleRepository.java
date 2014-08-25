package net.remisan.security.repository;

import net.remisan.base.repository.Repository;
import net.remisan.security.model.SecurityRole;

public interface SecurityRoleRepository extends Repository<SecurityRole> {

    SecurityRole getByName(String name);

}
