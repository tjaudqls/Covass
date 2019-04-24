package net.covass.controller;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.covass.service.CovassService;
import net.covass.service.VideoTimeCut;

@Controller
public class DefaultController {
	
	@Resource(name = "net.covass.service.CovassService")
	CovassService covassservice;
	VideoTimeCut video;

    @GetMapping("/")
    public String home1() {
    	System.out.println("---------------------------------------------------------------------------controller in home");
        return "/home";
    }

    @GetMapping("/home")
    public String home() {
    	System.out.println("---------------------------------------------------------------------------controller in home");
        return "/home";
    }

    @GetMapping("/admin")
    public String admin() {
    	System.out.println("---------------------------------------------------------------------------controller in admin");
        return "/admin";
    }
    @PostMapping("/admin")
    public String covassadminPost() throws IOException {
    	VideoTimeCut.save();
    	return "redirect:/admin";
    }

    @GetMapping("/user")
    public String user() {
    	System.out.println("---------------------------------------------------------------------------controller in user");
        
    	return "/DLC_Emulation";
    }

    @GetMapping("/about")
    public String about() {
    	System.out.println("---------------------------------------------------------------------------controller in about");
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
    	System.out.println("---------------------------------------------------------------------------controller in logout");
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
    	System.out.println("---------------------------------------------------------------------------controller in 403");
        return "/error/403";
    }
    @GetMapping("/500")
    public String error500() {
    	System.out.println("---------------------------------------------------------------------------controller in 403");
        return "/error/403";
    }
    @GetMapping("/main")
    public String covassmain(Model model) throws Exception {
        model.addAttribute("list", covassservice.covassListService());
        System.out.println("---------------------------------------------------------------------------controller in main");
        return "/main";
        
    }
    @GetMapping("/map")
    public String covassmap(Model model) throws Exception {
        System.out.println("---------------------------------------------------------------------------controller in map");
        return "/map";
        
    }
    @PostMapping("/main")
    public String covassmainPost() throws IOException {
    	VideoTimeCut.save();
    	return "redirect:/main";
    }
    /*
    @RequestMapping(value = "/main", method = RequestMethod.GET) // 이렇게 작성시 value 값의 "/main"이 jsp의 경로가 됨
	public void covassmain(Model model) throws Exception{
		System.out.println("Controller in main method 컨트롤러 진입");
		System.out.println("컨트롤러에서 service호출"+covassservice.covassListService());
		model.addAttribute("list", covassservice.covassListService());
	}*/

}
