package pluralsight.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by timge on 12/5/2016.
 */
@RestController
public class TaskController {

    @Autowired
    private TaskProcessor t;

    @RequestMapping(path="/tasks", method= RequestMethod.POST)
    public @ResponseBody String launchTask(@RequestBody String s) {

        t.publishRequest(s);
        System.out.println("request mode");

        return "success";
    }

}
