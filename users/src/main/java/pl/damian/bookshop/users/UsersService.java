package pl.damian.bookshop.users;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;
    List<User> getAllUsers(){
        return usersRepository.getAllUsers();
    }
}
