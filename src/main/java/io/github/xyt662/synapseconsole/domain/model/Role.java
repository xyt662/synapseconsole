package io.github.xyt662.synapseconsole.domain.model;

import java.util.Set;

/** 角色值对象（可选聚合根） */
public class Role {
    private Long id;
    private String code;
    private String name;
    private Set<Permission> permissions;
}