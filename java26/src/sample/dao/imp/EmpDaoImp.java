package sample.dao.imp;

import java.util.List;
import java.util.Vector;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sample.dao.EmpDao;
import sample.dto.EmpDto;
import sample.mapper.EmpMapper;

/**
 * @FileName 	: EmpDaoImp.java
 * @Project 		: swingProject
 * @Date 		: 2015. 1. 15.
 * @프로그램설명 : EmpDao implement
 */
@Repository
public class EmpDaoImp implements EmpDao {
	private DataSource dataSource = null;
	private JdbcTemplate jdbcTemplate = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/* (non-Javadoc)
	 * @see sample.dao.EmpDao#insert(sample.dto.EmpDto)
	 */
	@Override
	public void insert(EmpDto emp) {
		String sql = "insert into member values(?, ?, ?, ?)";
		this.jdbcTemplate.update(sql, emp.getId(),emp.getName(),emp.getAge(),emp.getAddr());
	}

	/* (non-Javadoc)
	 * @see sample.dao.EmpDao#findByEmpId(java.lang.String)
	 */
	@Override
	public EmpDto findByEmpId(String id) {
		String sql = "select * from member where id = ?";
		return this.jdbcTemplate.queryForObject(sql,new EmpMapper(), id);
	}

	/* (non-Javadoc)
	 * @see sample.dao.EmpDao#findByEmpName(java.lang.String)
	 */
	@Override
	public List<EmpDto> findByEmpName(String name) {
		String sql = "select * from member where name like ?";
		return this.jdbcTemplate.query(sql,	new EmpMapper(), name);
	}

	/* (non-Javadoc)
	 * @see sample.dao.EmpDao#findByEmpAddr(java.lang.String)
	 */
	@Override
	public List<EmpDto> findByEmpAddr(String addr) {
		String sql = "select * from member where addr like ?";
		return this.jdbcTemplate.query(sql,	new EmpMapper(), addr);
	}

	/* (non-Javadoc)
	 * @see sample.dao.EmpDao#findByEmpAll()
	 */
	@Override
	public List<EmpDto> findByEmpAll() {
		String sql = "select * from member";
		return this.jdbcTemplate.query(sql, new EmpMapper());
	}

	/* (non-Javadoc)
	 * @see sample.dao.EmpDao#update(sample.dto.EmpDto)
	 */
	@Override
	public void update(EmpDto emp) {
		String sql = "update member set name = ? ,age = ?, addr = ? where id = ?";
		this.jdbcTemplate.update(sql, emp.getName(),emp.getAge(),emp.getAddr());
	}

	/* (non-Javadoc)
	 * @see sample.dao.EmpDao#delete(java.lang.String)
	 */
	@Override
	public void delete(String id) {
		String sql = "delete from Member where id = ?";
		jdbcTemplate.update(sql,id);
		System.out.println("Deleteed Record with ID = " + id);
	}

}
