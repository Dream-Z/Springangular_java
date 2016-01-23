package tutorial.rest.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tutorial.core.entities.BlogEntry;
import tutorial.core.services.BlogEntryService;

/**
 * Created by lexx on 1/18/16.
 */
@Controller
public class BlogEntryController {
    private BlogEntryService service;

    public BlogEntryController(BlogEntryService service){
        this.service = service;
    }
}
