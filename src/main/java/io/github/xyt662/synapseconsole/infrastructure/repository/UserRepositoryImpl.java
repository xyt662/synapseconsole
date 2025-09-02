package io.github.xyt662.synapseconsole.infrastructure.repository;

import io.github.xyt662.synapseconsole.domain.model.User;
import io.github.xyt662.synapseconsole.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * 用户仓库实现
 * 
 * @author xyt
 * @since 1.0.0
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override public Optional<User> findByUsername(String username) { return Optional.empty(); }
    @Override public User save(User user) { return user; }
}