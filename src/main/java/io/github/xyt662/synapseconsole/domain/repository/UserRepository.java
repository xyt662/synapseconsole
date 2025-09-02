package io.github.xyt662.synapseconsole.domain.repository;

import io.github.xyt662.synapseconsole.domain.model.User;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);
    User save(User user);
}