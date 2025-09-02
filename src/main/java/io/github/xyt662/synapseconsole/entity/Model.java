package io.github.xyt662.synapseconsole.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 模型实体类
 * 
 * @author xyt
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("model")
public class Model {
    
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    
    @TableField("name")
    private String name;
    
    @TableField("provider")
    private String provider;
    
    @TableField("model_type")
    private String modelType;

    @TableField("api_key")
    private String apiKey;
    
    @TableField("base_url")
    private String baseUrl;
    
    @TableField("config")
    private String config;
    
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