package net.remisan.security.model;

import java.util.Date;
import java.util.Set;

import net.remisan.base.model.User;

public interface SecurityUser extends User, SecuredPersistable {

    String getPassword();

    void setPassword(String password);

    boolean isEnabled();

    void setEnabled(boolean enabled);

    String getActivationToken();

    void setActivationToken(String activationToken);

    Date getCreationDate();

    void setCreationDate(Date creationDate);

    Date getAccountExpirationDate();

    void setAccountExpirationDate(Date accountExpirationDate);

    Date getCredentialsExpirationDate();

    void setCredentialsExpirationDate(Date credentialsExpirationDate);

    Date getLockingDate();

    void setLockingDate(Date lockingDate);

    void addRole(SecurityRole r);

    Set<SecurityRole> getRoles();

    void setRoles(Set<SecurityRole> roles);

}
