package Login;

import org.testng.annotations.Test;

public class Login {
      
		@Test (groups = "smoke")
		public void Mtest() {
		   System.out.println("Login Smoke Testing..");
		   System.out.println("smoke time 7:14");
		   System.out.println("smoke2:32PM");
		}
	
	   
		@Test (groups = "regression")
		public void Rtest() {
			System.out.println("Login Regression Testing..");
		}
} 
