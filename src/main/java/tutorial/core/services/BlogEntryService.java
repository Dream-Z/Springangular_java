package tutorial.core.services;

import tutorial.core.entities.BlogEntry;

/**
 * Created by viholovko on 21.01.16.
 */
public interface BlogEntryService {
    public BlogEntry find(Long id);
}
