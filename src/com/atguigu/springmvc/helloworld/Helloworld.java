package com.atguigu.springmvc.helloworld;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.springmvc.entities.User;

@SessionAttributes(value={"user"}, types={String.class})
@RequestMapping("/springmvc")
@Controller
public class Helloworld {
	
	@RequestMapping("/testViewAndViewResolver")
	public String testViewAndViewResolver(){
		
		return "success";
	}
	
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(User user){
		System.out.println("修改: " + user);
		return "success";
	}
	
	@ModelAttribute
	public void getUser(@RequestParam(value="id",required=false) Integer id, Map<String, Object> map){
		System.out.println("modelAttribute method");
		if(id != null){
			User user = new User(1, null, "123456", "tom@atguigu.com", 18);
			System.out.println("从数据库中获取一个对象: " + user);
			map.put("user", user);
		}
	}
	
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Map<String, Object> map){
		User user = new User("Tom", "123456", "tom@atguigu.com", 15);
		map.put("user", user);
		map.put("school", "atguigu");
		return "success";
	}
	
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView(){
		String viewName = "success";
		
		ModelAndView modelAndView = new ModelAndView(viewName);
		
		modelAndView.addObject("time" ,new Date());
		
		return modelAndView;
	}
	
	@RequestMapping("/testServletAPI")
	public void testServletAPI(HttpServletRequest request,
			HttpServletResponse response, Writer ou) throws IOException {
		System.out.println("testServletAPI"+request+" ，"+response);
		ou.write("hello~");
	}
	
	@RequestMapping("/pojo")
	public String testPojo(User user){
		System.out.println(user);
		return "success";
	}
	
	//JSESSIONID
	@RequestMapping(value="/testRestCookie")
	public String testRestCookie(@CookieValue(value="JSESSIONID") String cookie){
		System.out.println("JSESSIONID = "+cookie);
		return "success";
	}
	
	//zh-CN,zh;q=0.8
	@RequestMapping(value="/testRestHeader")
	public String testRestHeader(@RequestHeader(value="Accept-Language") String al){
		System.out.println("Accept-Language = "+al);
		return "success";
	}
	
	
	
	@RequestMapping(value="/testRestParams")
	public String testRestParams(@RequestParam(value="userName") String userName){
		System.out.println("jieshi = userName"+userName);
		return "success";
	}
	
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.PUT)
	public String testRestDeletePut(@PathVariable Integer id){
		System.out.println("jieshi = PUT"+id);
		return "success";
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id){
		System.out.println("jieshi = post"+id);
		return "success";
	}
	
	
	@RequestMapping(value="/testRest", method=RequestMethod.POST)
	public String testRest(){
		System.out.println("jieshi = post");
		return "success";
	}
	
	
	@RequestMapping("/pathVariable/{id}")
	public String pathVariable(@PathVariable("id") Integer id){
		System.out.println("age="+id);
		return "success";
	}
	
	
	@RequestMapping(value="params",params={"userName","age=10"})
	public String params(){
		
		System.out.println("helloworld");
		
		return "success";
	}
	
	
	@RequestMapping("/helloworld")
	public String hello(){
		
		System.out.println("helloworld");
		
		return "success";
	}
	
}
