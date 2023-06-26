package TestNgPgms;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParameterPgm {

	
		@Parameters("a")
		@Test
		public void testing(String a)
		{
			System.out.println("Value of a=" +a);
		}

	}


