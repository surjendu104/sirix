package org.sirix.access;

import dagger.BindsInstance;
import org.sirix.api.Database;
import org.sirix.api.ResourceManager;

/**
 * An interface that aggregates all the common logic between {@link Database} subcomponents.
 *
 * @author Joao Sousa
 */
public interface GenericLocalDatabaseComponent<R extends ResourceManager<?, ?>> {

    Database<R> database();

    interface Builder<B extends Builder<B>> {

        @BindsInstance
        B databaseConfiguration(DatabaseConfiguration configuration);

        @BindsInstance
        B user(User user);

        GenericLocalDatabaseComponent build();
    }
}
