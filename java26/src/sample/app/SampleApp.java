package sample.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.dao.imp.EmpDaoImp;
import sample.dto.EmpDto;

public class SampleApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		EmpDto emp = new EmpDto();
		
		EmpDaoImp empDaoImp =
				(EmpDaoImp)context.getBean("empDaoImp");
		
		
//		System.out.println("=============INSERT===============");
		
//		emp.setId("BBB");
//		emp.setName("2222");
//		emp.setAge("33");
//		emp.setAddr("구로동");
//		
//		empDaoImp.insert(emp);
//		
//		emp.setId("CCC");
//		emp.setName("bbbb");
//		emp.setAge("33");
//		emp.setAddr("구로동");
//		
//		empDaoImp.insert(emp);
//		System.out.println("=============INSERT END===========");
		
		List<EmpDto> empList = empDaoImp.findByEmpAll();
		System.out.println("=============SELECT ALL===========");
		for(EmpDto empDto : empList){
			System.out.println("ID      : " + empDto.getId());
			System.out.println("NAME : " + empDto.getName());
			System.out.println("AGE    : " + empDto.getAge());
			System.out.println("ADDR  :" + empDto.getAddr());
		}
		
		System.out.println("=============SELECT ID===========");
		emp = empDaoImp.findByEmpId("BBB");
		System.out.println("ID      : " + emp.getId());
		System.out.println("NAME : " + emp.getName());
		System.out.println("AGE    : " + emp.getAge());
		System.out.println("ADDR  :" + emp.getAddr());
		
		System.out.println("=============SELECT NAME===========");
		empList = empDaoImp.findByEmpName("bbbb");
		
		for(EmpDto empDto : empList){
			System.out.println("ID      : " + empDto.getId());
			System.out.println("NAME : " + empDto.getName());
			System.out.println("AGE    : " + empDto.getAge());
			System.out.println("ADDR  :" + empDto.getAddr());
		}
		
		
	}

}
