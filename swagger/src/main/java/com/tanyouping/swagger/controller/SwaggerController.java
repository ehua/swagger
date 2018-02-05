package com.tanyouping.swagger.controller;

import com.tanyouping.swagger.entity.Swagger;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tan Youping on 2017/12/14.
 */
@Controller
//类上使用@Api
@Api(value = "SwaggerController", tags = {"Swagger操作接口"})
public class SwaggerController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    //方法上使用@ApiOperation
    @ApiOperation(value = "首页", notes = "跳转到首页")
    //参数使用@ApiParam
    @ResponseBody
    public Object index() {
        return "index";
    }

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody Swagger swagger) {
        return "save";
    }

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    @ResponseBody
    public Object update(@ApiParam(name = "swagger实体", value = "json格式", required = true) @RequestBody Swagger swagger) {
        return "update";
    }

    @ApiOperation(value = "删除", notes = "删除")
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Object delete(@ApiParam(name = "id", value = "用户id", required = true) @RequestBody String id) {
        return "delete";
    }

}
