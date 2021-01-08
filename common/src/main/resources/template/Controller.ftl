package ${groupId}.${module}.${layer}.controller;

import ${groupId}.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ${modelname}controller
 * Created by Charles on ${ctime}.
 */
@Controller
@RequestMapping("/manage")
@Api(value = "${modelname}控制器", description = "${modelname}管理")
public class ${model}Controller extends BaseController {

    private static Logger _log = LoggerFactory.getLogger(${model}Controller.class);



}