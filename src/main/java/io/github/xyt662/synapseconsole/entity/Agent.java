package io.github.xyt662.synapseconsole.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 智能体实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("agent")
public class Agent {
    
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    
    @TableField("name")
    private String name;
    
    @TableField("description")
    private String description;
    
    /**
     * SEQUENTIAL, CONCURRENT, HANDOFF
     */
    @TableField("type")
    private String type;

    /**
     * JSON配置
     */
    @TableField("config")
    private String config;
    
    @TableField("model_id")
    private Long modelId;

    /**
     * 0-禁用 1-启用
     */
    @TableField("status")
    private Integer status;
    
    @TableField("creator_id")
    private Long creatorId;
    
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    
    @TableLogic
    @TableField("deleted")
    private Integer deleted;
}