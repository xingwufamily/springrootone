package cn.com.controller;


import cn.com.Entity.Class;
import cn.com.Entity.People;
import cn.com.Entity.Student;
import cn.com.Entity.User;
import cn.com.service.MeService;
import cn.com.utils.DateUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
/*
总结restfulf风格 get和delete风格一样字段在urld地址中  post和put风格相似报文可放在报文体中以以application/json方式
 */
//@EnableConfigurationProperties(People.class)
@RestController
public class ControllerOne {
    @Autowired
    private Student s;
    @Autowired
    private People p;
    @Autowired
    private Class c;
    @Qualifier("userServiceImp")
    @Autowired
    private MeService meService;

    @ApiOperation("测试")
    @ApiImplicitParam(name="map",value = "Map测试",dataType = "Map",paramType="body")
    @RequestMapping("/test/hello")
    public String test1(HttpServletRequest request,User user){
       /* WebApplicationContext web = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        List<User> list = new ArrayList<>();
        User u = new User();
        u.setUserName("亚瑟");
        u.setUserAge("6");
        u.setAddr("安徽");
        u.setIdnum("3");
        list.add(u);
        User u1 = new User();
        u1.setUserName("赵云");
        u1.setUserAge("8");
        u1.setAddr("安徽");
        u1.setIdnum("4");
        list.add(u1);
        //User u = (User)meService.query("1");
        int i = meService.addButchUser(list);*/
       int a=5;
        String str = DateUtil.toFormatStr(new Date(),"yyyy-MM-dd");
        System.err.println(str+"----"+user.getAddr()+"---"+user.getId());
        return "success";
    }

    @RequestMapping("/hello/{id}/{name}")
    public String test2(@PathVariable String id,@PathVariable String name){
        ObjectMapper om = new ObjectMapper();
        om.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        Student s = new Student();
        s.setName("test...");
        Map m = om.convertValue(s,Map.class);
        System.err.println(m.toString());
        return "success";
    }

    @ApiOperation(value="根据ID获取用户信息",notes="备注")
    @ApiImplicitParam(name = "list",value = "用户列表",dataType = "List",paramType = "body")
    @RequestMapping(value = "/test",method = {RequestMethod.PUT})
    //默认可以直接把User POLO对象转化为json,支持把list<POLO>格式，或POLO对象里嵌套list
    public User executeGet(@RequestBody ArrayList<User> list ,HttpServletRequest request, HttpServletResponse response){
        //response.setHeader("Access-Control-Allow-Origin","*");
        for(User s:list){
            System.err.println(s.toString());
        }

        return null;
    }
    @ApiOperation(value = "创建用户",notes = "根据user对象创建")
    @ApiImplicitParam(name="user",value="用户详细实体",required=true,dataType="User")
    @RequestMapping(value = "/test",method = {RequestMethod.POST})
    public String executePost(@RequestBody User user, HttpServletRequest request, HttpServletResponse response, Student s){
        //response.setHeader("Access-Control-Allow-Origin","*");
        //String callback = request.getParameter("callback");
        System.err.print("进入user对象:  "+s.getId());
        return "success";
    }

    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long",paramType = "path"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value = "/test/{id}",method = {RequestMethod.PUT})
    public String executePut(@PathVariable String id,@RequestBody  User user,HttpServletRequest request,HttpServletResponse response){
        //response.setHeader("Access-Control-Allow-Origin","*");
        System.err.print("这里是put");
        //System.err.print("这里是post "+user.getName()+"--"+user.getAge()+"--");
        return "PUT-success";
    }

    @ApiOperation(value="删除用户",notes="根据用户ID删除用户") //paraType表示怎么获得字段值例如；getRequestHead() getRequestParam(),@PathVariable
    @ApiImplicitParam(name="id",value="带删除用户id",required = true,dataType = "Integer",paramType = "path")
    @RequestMapping(value="/test/{id}",method = {RequestMethod.DELETE})
    public String executeDelete(@PathVariable String id,HttpServletRequest request,HttpServletResponse response){
        //response.setHeader("Access-Control-Allow-Origin","*");方式
        System.err.print("这里是delete  "+id);
        return "DELETE-success";
    }
}
