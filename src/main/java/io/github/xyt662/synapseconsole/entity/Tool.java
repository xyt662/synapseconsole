package io.github.xyt662.synapseconsole.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 工具实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tool")
public class Tool {
    
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    
    @TableField("name")
    private String name;
    
    @TableField("description")
    private String description;
    
    @TableField("category")
    private String category;
    
    @TableField("mcp_server")
    private String mcpServer; // MCP服务器标识
    
    @TableField("schema_config")
    private String schemaConfig; // 工具Schema配置
    
    @TableField("version")
    private String version;
    
    @TableField("status")
    private Integer status; // 0-禁用 1-启用
    
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