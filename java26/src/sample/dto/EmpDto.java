package sample.dto;

/**
 * @FileName 	: EmpDto.java
 * @Project 		: swingProject
 * @Date 		: 2015. 1. 14.
 * @프로그램설명 : 사원정보를 처리하는 DTO
 */

public class EmpDto {
	private String id 	  	= null;
	private String name 	= null;
	private String age 		= null;
	private String addr		= null;
	
	/**
	 * @Method Name : getId
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 
	 * @return String
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @Method Name : setId
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 
	 * @param String id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @Method Name : getName
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 
	 * @return String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @Method Name : setName
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @Method Name : getAge
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 
	 * @return String
	 */
	public String getAge() {
		return age;
	}
	
	/**
	 * @Method Name : setAge
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 
	 * @param String age
	 */
	public void setAge(String age) {
		this.age = age;
	}
	
	/**
	 * @Method Name : getAddr
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 
	 * @return String 
	 */
	public String getAddr() {
		return addr;
	}
	
	/**
	 * @Method Name : setAddr
	 * @작성일 : 2015. 1. 14.
	 * @작성자 : ehappy
	 * @변경이력 : 
	 * @Method 설명 : 
	 * @param String addr
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
