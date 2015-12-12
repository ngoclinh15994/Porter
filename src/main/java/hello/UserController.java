package hello;

import Dao.UserDao;
import Model.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ngocl on 11/30/2015.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
public class UserController {
    UserDao userDao = new UserDao();

    @RequestMapping(value = "/userinfo", method = RequestMethod.GET)
    public
    @ResponseBody
    User sayHello() {

        User u = userDao.selectUserById(2);
        return u;
    }

    @RequestMapping(value = "/userinfo", method = RequestMethod.POST)
    public
    @ResponseBody
    User regist(@RequestBody User user) {
        User re = null;
        if (user != null) {
             re = userDao.Regiter(user);
            return re;
        }
        return re;
    }
}
