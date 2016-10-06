package org.xjtusicd3.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xjtusicd3.portal.service.UserService;
@RequestMapping(value="user")
@Controller
public class UserController {
	
	 
	 @RequestMapping(value="toUserSearch",method=RequestMethod.GET)
     public ModelAndView  toUserSearch(){
  	   ModelAndView mv=new ModelAndView("resourcemanagement/userManagement");
  	  
  	   return mv;
     }
	 
	 @RequestMapping(value="toUserDetail",method=RequestMethod.GET)
     public ModelAndView  toUserDetail(String userId){
  	   ModelAndView mv=new ModelAndView("resourcemanagement/userDetail");
	   UserService us=new UserService();
	   mv.addObject("us",us.userSearchById(userId));
  	   return mv;
     }
	
	/*
	 * 查找所有用户
	 * */
	   @RequestMapping(value="userSearch",method=RequestMethod.GET)
       public ModelAndView  userSearch(){
    	   ModelAndView mv=new ModelAndView();
    	   UserService us=new UserService();
    	   mv.addObject("us",us.userSearch());
    	   return mv;
       }
	   /*
		 * 按用戶名查找所有用户
		 * */
	   @RequestMapping(value="userSearch1",method=RequestMethod.GET)
       public ModelAndView  userSearch1(String name){
    	   ModelAndView mv=new ModelAndView("resourcemanagement/userManagement");
    	   UserService us=new UserService();
    	   mv.addObject("us",us.userSearch1(name));
    	   return mv;
       }
	   
	   /*
	    * 查找黑名單用戶
	    * */
	   @RequestMapping(value="userBlack",method=RequestMethod.GET)
       public ModelAndView  userBlack(){
    	   ModelAndView mv=new ModelAndView("resourcemanagement/blackList");
    	   UserService us=new UserService();
    	   mv.addObject("us",us.blackSearch());
    	   return mv;
       }
	   
	   /*
	    * 用戶拉黑
	    * */
	   @RequestMapping(value="defriend",method=RequestMethod.GET)
       public  ModelAndView  defriend(String userId){
		   ModelAndView mv=new ModelAndView("resourcemanagement/userManagement");
    	   UserService us=new UserService();
    	   us.defriend(userId);
    	   mv.addObject("us",us.userSearch1(""));
    	   return mv;
       }
	   
	   /*
	    * 黑名單用戶移出黑名單
	    * */
	   @RequestMapping(value="userRecover",method=RequestMethod.GET)
       public ModelAndView  userRecover(String userId){
		   ModelAndView mv=new ModelAndView("resourcemanagement/blackList");
    	   UserService us=new UserService();
    	   us.userRecover(userId);
    	   mv.addObject("us",us.blackSearch());
    	   return mv;
       }
	   
	   /*
	    * 修改密碼跳轉
	    * */
	   @RequestMapping(value="userPswAlter",method=RequestMethod.GET)
       public ModelAndView  userPswAlter(String userId){
    	   ModelAndView mv=new ModelAndView();
           UserService us=new UserService();
           mv.addObject("usbi",us.userSearchById(userId));
    	   return mv;
       }
	   
	   /*
	    * 修改密碼
	    */
	   @RequestMapping(value="pswAlter",method=RequestMethod.GET)
       public ModelAndView  pswAlter(String userId,String password){
		   ModelAndView mv=new ModelAndView("resourcemanagement/userDetail");
           UserService us=new UserService();
           us.pswAlter(userId,password);
    	   mv.addObject("us",us.userSearchById(userId));
         
    	   return mv;
       }
}
