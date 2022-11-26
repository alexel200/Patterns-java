package org.example.classes;

import org.example.models.User;

public interface UsersIterator {
    User next();
    boolean hasNext();
    void reset();
}
