package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import logic.Board;
import logic.Comment;
import logic.ShopService;
import logic.User;

//@Controller
//@RequestMapping("comment")
public class CommentController {
	@Autowired
	private ShopService service;
//	@PostMapping("comment")
//	public ModelAndView write(@Parame) {
//		System.out.println(comment);
//		if(bresult.hasErrors()) {
//			mav.getModel().putAll(bresult.getModel());
//			return mav;
//		}
//		String userid = (String)request.getSession().getAttribute("userid");
//		service.commentWrite(comment,request);
//	}
}
