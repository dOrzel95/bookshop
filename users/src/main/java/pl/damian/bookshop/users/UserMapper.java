package pl.damian.bookshop.users;

import org.springframework.jdbc.core.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        return User.builder().id(rs.getInt("iduser"))
                .login(rs.getString("login"))
                .password(rs.getString("password")).build();
    }
}
