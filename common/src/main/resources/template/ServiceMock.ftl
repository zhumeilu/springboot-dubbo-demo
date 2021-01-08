package ${package_name}.api.base;

import com.lmhd.common.base.BaseServiceMock;
import ${package_name}.dao.mapper.${model}Mapper;
import ${package_name}.dao.model.${model};
import ${package_name}.dao.model.${model}Example;

/**
* 降级实现${model}Service接口
* Created by Charles on ${ctime}.
*/
public class ${model}ServiceMock extends BaseServiceMock<${model}Mapper, ${model}, ${model}Example> implements ${model}Service {

}
