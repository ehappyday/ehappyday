package sample.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import sample.dto.EmpDto;

/**
 * @FileName 	: EmpMapper.java
 * @Project 		: swingProject
 * @Date 		: 2015. 1. 15.
 * @프로그램설명 : EmpDto 매핑 클래스 
 */
public class EmpMapper implements RowMapper<EmpDto> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public EmpDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmpDto empDto = new EmpDto();
		empDto.setId(rs.getString("id"));
		empDto.setName(rs.getString("name"));
		empDto.setAge(rs.getString("age"));
		empDto.setAddr(rs.getString("addr"));
		
		return empDto;
	}

}
