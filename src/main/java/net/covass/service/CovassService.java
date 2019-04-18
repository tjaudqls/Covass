package net.covass.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.covass.domain.CovassVO;
import net.covass.mapper.CovassMapper;

@Service("net.covass.service.CovassService")
public class CovassService {
	
	 @Resource(name="net.covass.mapper.CovassMapper")
	 CovassMapper covassmapper;
	 
	 public List<CovassVO> covassListService() throws Exception {
		 System.out.println("Service에서 실행된 "+covassmapper.CovassListAll());
		 return covassmapper.CovassListAll();
	 }
	 
}
