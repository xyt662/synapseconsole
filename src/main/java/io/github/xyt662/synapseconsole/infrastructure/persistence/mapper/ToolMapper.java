package io.github.xyt662.synapseconsole.infrastructure.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.xyt662.synapseconsole.infrastructure.persistence.dataobject.ToolDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 工具对象映射器
 * 
 * @author xyt
 * @since 1.0.0
 */
@Mapper
public interface ToolMapper extends BaseMapper<ToolDO> {
    
}