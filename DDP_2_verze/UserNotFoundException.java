package cz.robodreams.javadeveloper.homeworks.hw21junits;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
