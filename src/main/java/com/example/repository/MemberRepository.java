package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.domain.Member;

@Repository
public class MemberRepository {
	
	private static final RowMapper<Member>MEMBER_ROW_MAPPER
		=new BeanPropertyRowMapper<>(Member.class);
	
	@Autowired
	NamedParameterJdbcTemplate template;
	
	public List<Member> findAll(){
		String sql="select id,name,age from member order by id";
		
		List<Member> memberList
			=template.query(sql, MEMBER_ROW_MAPPER);
		
		return memberList;
		
	}
	
	

}
