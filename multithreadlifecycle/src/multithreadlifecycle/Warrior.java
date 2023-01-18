package multithreadlifecycle;

public class Warrior implements Runnable{
String weapon1 = "Hammer";
String weapon2 = "Axe";
String weapon3 = "Stone";

public void run()
{
	try
	{
		if (Thread.currentThread().getName().equals("THOR"))
		{
			thor();
		}
		else
		{
			hulk();
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
void thor()
{
	try
	{
		synchronized(weapon1)
		{
		System.out.println("Thor has accepted"+weapon1);
		Thread.sleep(2000);
		synchronized(weapon2)
		{
		System.out.println("Thor has accepted"+weapon2);
		Thread.sleep(2000);
		synchronized(weapon3)
		{
		System.out.println("Thor has accepted"+weapon3);
		Thread.sleep(2000);
	}
	}
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
void hulk()
{
	try
	{
		synchronized(weapon1)
		{
		System.out.println("hulk has accepted"+weapon1);
		Thread.sleep(2000);
		synchronized(weapon2)
		{
		System.out.println("hulk has accepted"+weapon2);
		Thread.sleep(2000);
		synchronized(weapon3)
		{
		System.out.println("hulk has accepted"+weapon3);
		Thread.sleep(2000);
	}
	}
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

