package BasicSkeletonProject.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BasicSkeletonProject.Dao.Tyre;
import BasicSkeletonProject.service.Vehicle;

@Service("car")
public class Car implements Vehicle{

	@Autowired
	public Tyre tyre;
	
	public void drive() {
		System.out.println("i am driving car"+tyre.returnString());
		
	}

}
