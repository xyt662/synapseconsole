package io.github.xyt662.synapseconsole.infrastructure.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.xyt662.synapseconsole.infrastructure.persistence.dataobject.AgentDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 代理对象映射器
 * 
 * @author xyt
 * @since 1.0.0
 */
@Mapper
public interface AgentMapper extends BaseMapper<AgentDO> {
    
}