package Server.User;

import Server.Exceptions.UserAlreadyExistException;
import Server.Exceptions.UserDoesntExistException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAO implements IUserManager {
    private List<User> userList;

    public UserDAO() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void createUser(User user) throws UserAlreadyExistException {
        if (getByUsername(user.get_user()).isPresent())
            throw new UserAlreadyExistException("Server.User.Server.User Already Exist");
        else
            userList.add(user);
    }

    @Override
    public void deleteUser(User user) throws UserDoesntExistException {
        Optional<User> person = getByUsername(user.get_user());
        if (person.isPresent()) {
            userList.remove(person.get());
        } else
            throw new UserDoesntExistException("Server.User.Server.User doesn't exist");
    }


    public Optional<User> getByUsername(String username) {
        return userList.stream()
                .filter(person -> person.get_user().equals(username))
                .findFirst();
    }

    @Override
    public Optional<User> login(String username, String password) {
        return userList.stream()
                .filter(person -> person.get_user().equals(username))
                .filter(person -> person.get_password().equals(password))
                .findFirst();
    }
}
