package sample.dao;

import java.util.List;

import sample.dto.EmpDto;

/**
 * @FileName 	: EmpDao.java
 * @Project 		: swingProject
 * @Date 		: 2015. 1. 14.
 * @프로그램설명 : 사원정보 Service 
 */
public interface EmpDao {
	
	/**
	 * @Method Name : insert
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 사원정보 입력
	 * @param EmpDto emp
	 * @return 없음 
	 */
	public void insert(EmpDto emp);
	
	/**
	 * @Method Name : findByEmpId
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 사원정보 ID 검색
	 * @param String id
	 * @return EmpDto 사원정보 DTO
	 */
	public EmpDto findByEmpId(String id);
	
	/**
	 * @Method Name : findByEmpName
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 사원정보 이름 검색  
	 * @param String name
	 * @return List<EmpDto>
	 */
	public List<EmpDto> findByEmpName(String name);
	
	/**
	 * @Method Name : findByEmpAddr
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 사원정보 주소 검색
	 * @param String addr
	 * @return List<EmpDto> 검색정보 ArrayList<EmpDto> 리턴
	 */
	public List<EmpDto> findByEmpAddr(String addr);
	
	/**
	 * @Method Name : findByEmpAll
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 모든 사원정보 
	 * @return ArrayList<EmpDto>
	 */
	public List<EmpDto> findByEmpAll();
	
	/**
	 * @Method Name : update
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 사원정보 수정
	 * @param EmpDto emp
	 * @return 없음
	 */
	public void update(EmpDto emp);
	
	/**
	 * @Method Name : delete
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : ID로 해당 사원 삭제
	 * @param String id
	 * @return 없음
	 */
	public void delete(String id); 
}
