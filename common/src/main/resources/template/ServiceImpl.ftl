package ${package_name}.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import ${package_name}.dao.mapper.${model}Mapper;
import ${package_name}.dao.model.${model};
import ${package_name}.dao.model.${model}Example;
import ${package_name}.api.base.${model}Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* ${model}Service实现
* Created by LMHD.TEC on ${ctime}.
*/
@BaseService
@Service(interfaceClass = ${model}Service.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class ${model}ServiceImpl extends BaseServiceImpl<${model}Mapper, ${model}, ${model}Example> implements ${model}Service {

    private static Logger _log = LoggerFactory.getLogger(${model}ServiceImpl.class);

    @Autowired
    ${model}Mapper ${mapper}Mapper;

}