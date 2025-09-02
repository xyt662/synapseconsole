package io.github.xyt662.synapseconsole.domain.model;

import java.time.LocalDateTime;
import java.util.Set;

/** 用户（聚合根），包含角色和权限快照。 */
public class User {
    private Long id;
    private String username;
    private String passwordHash;
    private String email;
    private String nickname;
    private String avatar;
    private UserStatus status; // ENABLED / DISABLED
    private Set<Role> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public boolean hasPermission(String permCode) { return false; /* 遍历角色权限 */ }
}