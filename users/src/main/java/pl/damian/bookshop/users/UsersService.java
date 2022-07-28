package pl.damian.bookshop.users;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public User getUserById(int id) {
        return usersRepository.getUserById(id);
    }
    public List<User> getAll(){

        return  usersRepository.getAll();
    }
}
