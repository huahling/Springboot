//package demo.feng;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@ControllerAdvice
//public class TestException {
//
//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody
//    public Map<String, Object> exceptionHandler() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("errorCode", "101");
//        map.put("errorMsg", "系統错误!");
//        return map;
//    }
//
//}
