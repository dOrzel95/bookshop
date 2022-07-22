package pl.damian.bookshop.users;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersInMemoryRepository usersInMemoryRepository;
    List<User> getAllUsers(){
        return usersInMemoryRepository.getAllUsers();
    }
}
