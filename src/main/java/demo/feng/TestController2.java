package demo.feng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

//@RestController   json
//@ControllerAdvice  异常标签需要
@Controller
public class TestController2 {

    @Autowired
    private TestService testService;

    @RequestMapping("/cc2")
//    @ResponseBody
    public User ff() {
//        int a=1/0;
        User user = new User();
        user.setId(2);
        user.setName("name2");
        System.out.println(222222);
        return user;
    }


    @RequestMapping("/user")
    public String ss(Map<String, Object> map) {

        User user = new User();
        user.setId(2);
        user.setName("name2");

        map.put("xingming", "ling");
        map.put("user", user);

        testService.aa();
        return "test";
    }


    @RequestMapping(value = "/query", produces = "text/html;charset=utf-8", method = RequestMethod.GET)
    public String query(Map<String, Object> map) throws IOException {

        map.put("querys", testService.queryUser());

        return "qu";
    }


    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String add(Map<String, Object> map) {
//        User user =new User();
        map.put("user", new User());

//        System.out.println("-----------------"+user.toString());
        return "add";
    }


    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public String addsave(@Validated User user, Map<String, Object> map) throws Exception {

        testService.insert(user);

        return "redirect:/query";
    }


    @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") int id) {
        testService.userdelete(id);
        return "redirect:/query";

    }

    @RequestMapping(value = "/emp/{id}", produces = "text/html;charset=utf-8", method = RequestMethod.GET)
    public String quid(@PathVariable("id") Integer id, Map<String, Object> map) {
        User user = testService.queryid(id);
        map.put("user", user);
        return "add";
    }

    //    @RequestMapping(value = "/emp",method = RequestMethod.PUT)
    @RequestMapping(value = "/emp", method = RequestMethod.PUT)
    public String updatesave(@Validated User user, Map<String, Object> map) throws Exception {
        testService.update(user);
        return "redirect:/query";
    }

}
