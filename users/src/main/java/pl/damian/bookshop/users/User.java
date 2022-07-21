package pl.damian.bookshop.users;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;

    private String email;

    private String password;
}
