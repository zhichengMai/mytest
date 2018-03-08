package cn.itcast.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@GetMapping("/list")
	@ResponseBody
	public List<Notice> list() {

		return noticeService.findAll();
	}

	/**
	 * 跳转分页查询
	 */
	@GetMapping("/show")
	public String show() {
		return "/html/notice.html";
	}

	/**
	 * 分页查询所有公告
	 * 
	 */
	@PostMapping("/findByPage")
	@ResponseBody
	public  Map<String,Object> findByPage(Integer page,Integer rows){
		return noticeService.findByPage((page-1)*rows,rows);
	}

}
