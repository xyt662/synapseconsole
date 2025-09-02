package io.github.xyt662.synapseconsole.infrastructure.persistence.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("model")
public class ModelDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private String provider;
    private String modelType;
    private String apiKey;
    private String baseUrl;
    private String config;
    private Integer status;
    private Long creatorId;
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    @TableLogic
    private Integer deleted;
}