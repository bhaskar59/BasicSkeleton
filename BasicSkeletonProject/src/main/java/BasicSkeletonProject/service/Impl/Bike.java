package BasicSkeletonProject.service.Impl;

import org.springframework.stereotype.Service;

import BasicSkeletonProject.Dao.Tyre;
import BasicSkeletonProject.service.Vehicle;

@Service("bike")
public class Bike implements Vehicle {
	
	public Tyre tyre;

	public void drive() {
		System.out.println("i am riding bike"+tyre.returnString());
		
	}

}
