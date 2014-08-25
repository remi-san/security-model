package net.remisan.security.repository;

import net.remisan.base.repository.Repository;
import net.remisan.security.model.SecurityUser;

public interface SecurityUserRepository extends Repository<SecurityUser> {
    
    SecurityUser getByLogin(String login);

    SecurityUser getByActivationToken(String token);

    SecurityUser getByEmail(String email);
}
