package pl.damian.bookshop.users;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsersRepository{
    User getUser();
}
