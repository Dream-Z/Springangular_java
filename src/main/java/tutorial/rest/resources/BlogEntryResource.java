package tutorial.rest.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by viholovko on 21.01.16.
 */
public class BlogEntryResource extends ResourceSupport {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
}
