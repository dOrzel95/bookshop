package pl.damian.bookshop.users;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UsersInMemoryRepository implements UsersRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public User getUserById(int id) {
        String selectSql = "SELECT * FROM USER WHERE IDUSER = "+id;
        System.out.println(jdbcTemplate.queryForObject(selectSql, new BeanPropertyRowMapper<>(User.class)));
        return  jdbcTemplate.queryForObject(selectSql, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public List<User> getAll() {
        String selectSql = "SELECT * FROM USER";

        List<User> users = jdbcTemplate.query(selectSql, new BeanPropertyRowMapper<>(User.class));

        users.forEach(user -> System.out.println(user.getLogin()+" "+user.getPassword()));

        return  jdbcTemplate.query(selectSql, new BeanPropertyRowMapper<>(User.class));
    }
}
