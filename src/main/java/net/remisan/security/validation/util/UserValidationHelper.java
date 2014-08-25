package net.remisan.security.validation.util;

import net.remisan.security.model.SecurityUser;
import net.remisan.security.repository.SecurityUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class UserValidationHelper {

    @Autowired
    private SecurityUserRepository userRepository;
    
    public void validateEmail(Errors errors, Long id, String email) {
        SecurityUser emailUser = this.userRepository.getByEmail(email);
        
        if (emailUser != null && !emailUser.getId().equals(id)) {
            errors.rejectValue("email", "emailUnique", "email already registered");
        }
    }
    
    public void validateLogin(Errors errors, Long id, String login) {
        SecurityUser loginUser = this.userRepository.getByLogin(login);
        
        if (loginUser != null && !loginUser.getId().equals(id)) {
            errors.rejectValue("login", "loginUnique", "username already registered");
        }
    }
    
    public void validatePassword(Errors errors, String plainPassword, String plainPasswordConfirmation) {
        if (plainPassword != null && !plainPassword.equals(plainPasswordConfirmation)) {
            String code = "passwordMismatch";
            String message = "password and confirmation are not equals";
            errors.rejectValue("plainPassword", code, message);
            errors.rejectValue("plainPasswordConfirmation", code, message);
        }
    }
}
