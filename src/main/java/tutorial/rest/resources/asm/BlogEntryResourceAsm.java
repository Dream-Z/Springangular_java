package tutorial.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import tutorial.core.entities.BlogEntry;
import tutorial.core.services.BlogEntryService;
import tutorial.rest.mvc.BlogEntryController;
import tutorial.rest.resources.BlogEntryResource;

/**
 * Created by lexx on 1/22/16.
 */
public class BlogEntryResourceAsm extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource> {
    public BlogEntryResourceAsm(){
        super(BlogEntryController.class, BlogEntryResource.class);
    }


    @Override
    public BlogEntryResource toResource(BlogEntry blogEntry) {
        BlogEntryResource res = new BlogEntryResource();
        res.setTitle(blogEntry.getTitle());
        return res;
    }
}
