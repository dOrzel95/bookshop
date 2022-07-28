package pl.damian.bookshop.users;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;

    private String login;

    private String password;

    private String email;

}
