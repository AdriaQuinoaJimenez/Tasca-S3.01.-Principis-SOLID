package services;

import models.User;

public class UserRegistrationService {
    private UserValidator userValidator;
    private NotificationService notificationService;

    public UserRegistrationService(UserValidator userValidator, NotificationService notificationService) {
        this.userValidator = new UserValidator();
        this.notificationService = new NotificationService();
    }

    public User registerUser(String name, String email, String password){
        userValidator.validateEmail(email);
        userValidator.validatePassword(password);

        User user = new User(name, email, password);

        notificationService.sendConfirmation(email);

        return user;
    }
}
