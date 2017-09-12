package spring.boot.hello.word; /**
 * Created by dazh on 9/10/17.
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringBootHelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "My first Spring Boot Apps!";
    }
}
