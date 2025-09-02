package io.github.xyt662.synapseconsole.infrastructure.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.xyt662.synapseconsole.infrastructure.persistence.dataobject.ModelDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 模型对象映射器
 * 
 * @author xyt
 * @since 1.0.0
 */
@Mapper
public interface ModelMapper extends BaseMapper<ModelDO> { }