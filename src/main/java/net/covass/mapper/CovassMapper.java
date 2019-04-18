package net.covass.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.covass.domain.CovassVO;

@Repository("net.covass.mapper.CovassMapper")
public interface CovassMapper {
	//총 데이터
	public List<CovassVO> CovassListAll()throws Exception;
	
	//
	
}
