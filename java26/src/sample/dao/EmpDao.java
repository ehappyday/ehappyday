package sample.dao;

import java.util.List;

import sample.dto.EmpDto;

/**
 * @FileName 	: EmpDao.java
 * @Project 		: swingProject
 * @Date 		: 2015. 1. 14.
 * @���α׷����� : ������� Service 
 */
public interface EmpDao {
	
	/**
	 * @Method Name : insert
	 * @�ۼ��� : 2015. 1. 14.
	 * @�ۼ��� : ehappy
	 * @�����̷� : 
	 * @Method ���� : ������� �Է�
	 * @param EmpDto emp
	 * @return ���� 
	 */
	public void insert(EmpDto emp);
	
	/**
	 * @Method Name : findByEmpId
	 * @�ۼ��� : 2015. 1. 14.
	 * @�ۼ��� : ehappy
	 * @�����̷� : 
	 * @Method ���� : ������� ID �˻�
	 * @param String id
	 * @return EmpDto ������� DTO
	 */
	public EmpDto findByEmpId(String id);
	
	/**
	 * @Method Name : findByEmpName
	 * @�ۼ��� : 2015. 1. 14.
	 * @�ۼ��� : ehappy
	 * @�����̷� : 
	 * @Method ���� : ������� �̸� �˻�  
	 * @param String name
	 * @return List<EmpDto>
	 */
	public List<EmpDto> findByEmpName(String name);
	
	/**
	 * @Method Name : findByEmpAddr
	 * @�ۼ��� : 2015. 1. 14.
	 * @�ۼ��� : ehappy
	 * @�����̷� : 
	 * @Method ���� : ������� �ּ� �˻�
	 * @param String addr
	 * @return List<EmpDto> �˻����� ArrayList<EmpDto> ����
	 */
	public List<EmpDto> findByEmpAddr(String addr);
	
	/**
	 * @Method Name : findByEmpAll
	 * @�ۼ��� : 2015. 1. 14.
	 * @�ۼ��� : ehappy
	 * @�����̷� : 
	 * @Method ���� : ��� ������� 
	 * @return ArrayList<EmpDto>
	 */
	public List<EmpDto> findByEmpAll();
	
	/**
	 * @Method Name : update
	 * @�ۼ��� : 2015. 1. 14.
	 * @�ۼ��� : ehappy
	 * @�����̷� : 
	 * @Method ���� : ������� ����
	 * @param EmpDto emp
	 * @return ����
	 */
	public void update(EmpDto emp);
	
	/**
	 * @Method Name : delete
	 * @�ۼ��� : 2015. 1. 14.
	 * @�ۼ��� : ehappy
	 * @�����̷� : 
	 * @Method ���� : ID�� �ش� ��� ����
	 * @param String id
	 * @return ����
	 */
	public void delete(String id); 
}
