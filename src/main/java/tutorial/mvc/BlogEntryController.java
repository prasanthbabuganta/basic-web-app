package tutorial.mvc;

import org.omg.CORBA.Object;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tutorial.entities.BlogEntry;

/**
 * Created by prasanthbabuganta on 1/1/16.
 */
@Controller
public class BlogEntryController {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry){
        /*
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setTitle("Test Blog Entry");
        */
        return entry;
    }

}
