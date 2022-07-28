package pl.damian.bookshop.users;

import java.util.List;

public interface UsersRepository{

    User getUserById(int id);

    List<User> getAll();
}
