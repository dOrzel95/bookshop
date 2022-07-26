package pl.damian.bookshop.users;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsersInMemoryRepository implements UsersRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public User getUser() {
        String selectSql = "SELECT * FROM USER";
        return  jdbcTemplate.queryForObject(selectSql, new BeanPropertyRowMapper<>(User.class));
    }
}
