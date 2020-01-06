package Server.User;


import Server.Exceptions.UserAlreadyExistException;
import Server.Exceptions.UserDoesntExistException;

import java.util.Optional;

public interface IUserManager {
    void createUser(User user) throws UserAlreadyExistException;

    void deleteUser(User user) throws UserDoesntExistException;

    Optional<User> getByUsername(String username);

    /**
     * @param username username
     * @param password password
     * @return Usuario en caso de que se encuentre un usuario con ese login y password
     */
    Optional<User> login(String username, String password);

}
