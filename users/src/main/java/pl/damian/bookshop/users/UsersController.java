package pl.damian.bookshop.users;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/get-user-by-id")
    public ResponseEntity getUser(@RequestParam int id){
        return new ResponseEntity(usersService.getUserById(id),HttpStatus.OK);
    }
    @GetMapping("/get-all")
    public ResponseEntity getAll(){
        return new ResponseEntity(usersService.getAll(),HttpStatus.OK);
    }


}
