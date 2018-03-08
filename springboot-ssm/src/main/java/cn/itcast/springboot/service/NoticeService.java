package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.pojo.Notice;

public interface NoticeService {
	List<Notice> findAll();

	Map<String, Object> findByPage(int curPage, Integer rows);


}
