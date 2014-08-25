package net.remisan.security.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class BaseSecurityUser implements SecurityUser {
    
    private static final long serialVersionUID = 3141536660390622255L;
    
    private Long id;
    private String login;
    private String email;
    private String password;
    private String plainPassword;
    private String plainPasswordConfirmation;
    private boolean enabled;
    private String activationToken;
    private Date creationDate;
    private Date accountExpirationDate;
    private Date credentialsExpirationDate;
    private Date lockingDate;
    private Set<SecurityRole> roles;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlainPassword() {
        return this.plainPassword;
    }

    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
    }
    
    public String getPlainPasswordConfirmation() {
        return this.plainPasswordConfirmation;
    }

    public void setPlainPasswordConfirmation(String plainPasswordConfirmation) {
        this.plainPasswordConfirmation = plainPasswordConfirmation;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getActivationToken() {
        return this.activationToken;
    }

    public void setActivationToken(String activationToken) {
        this.activationToken = activationToken;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getAccountExpirationDate() {
        return this.accountExpirationDate;
    }

    public void setAccountExpirationDate(Date accountExpirationDate) {
        this.accountExpirationDate = accountExpirationDate;
    }

    public Date getCredentialsExpirationDate() {
        return this.credentialsExpirationDate;
    }

    public void setCredentialsExpirationDate(Date credentialsExpirationDate) {
        this.credentialsExpirationDate = credentialsExpirationDate;
    }

    public Date getLockingDate() {
        return this.lockingDate;
    }

    public void setLockingDate(Date lockingDate) {
        this.lockingDate = lockingDate;
    }

    public void addRole(SecurityRole r) {
        if (this.roles == null) {
            this.roles = new HashSet<SecurityRole>();
        }
        this.roles.add(r);
    }

    public Set<SecurityRole> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<SecurityRole> roles) {
        this.roles = roles;
    }

    public boolean isNew() {
        return this.id == null;
    }

}
