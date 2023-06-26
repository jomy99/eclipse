package TestNgPgms;

import org.testng.annotations.Test;

public class Grouppgm {
@Test(groups= {"smoke","sanity"})
public void test1()
{
	System.out.println("Test1");
}
@Test(groups= {"smoke"})
public void test2()
{
	System.out.println("test2");
}
@Test(groups= {"regression"})
public void test3()
{
	System.out.println("test3");
}
@Test(groups= {"sanity"})
public void test4()
{
	System.out.println("test4");
}
}
