package org.donghyun.mapper;

import org.donghyun.domain.MemberVO;

public interface MemberMapper {
	
	MemberVO read(String userid);

}
