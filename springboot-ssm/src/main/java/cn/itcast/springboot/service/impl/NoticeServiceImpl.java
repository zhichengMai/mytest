package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(int curPage, Integer rows) {

		Map<String, Object> map = new HashMap<>();

		Long total = noticeMapper.getTotal();
		map.put("total", total);
		
		List<Notice> list=noticeMapper.findByPage(curPage,rows);
		map.put("rows", list);
		return map;
	}

}
