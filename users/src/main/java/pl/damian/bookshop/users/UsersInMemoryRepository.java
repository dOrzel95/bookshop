package pl.damian.bookshop.users;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersInMemoryRepository implements UsersRepository {

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Damian","email","dsdssa"));
        users.add(new User("Adam","email","dsadsadsa"));
        return users;
    }
}
