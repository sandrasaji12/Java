class CPU
{
	double price;
	class Processor
	{
		double cores;
		String manufacturer;
		double getCache()
		{
			return 4.3;
		}
	}
	protected class RAM
	{
		double memory;
		String manufacturer;
		double getClockSpeed()
		{
			return 5.5;
		}
	}
}
public class CPUdetails
{
	public static void main(String[] args)
	{
	System.out.println("Sandra Saji");
        System.out.println("23MCA044");
        System.out.println("14/02/24");
	System.out.println("Qn:Create an object of CPU and print information of Processor and RAM.");
	CPU cpu=new CPU();
	CPU.Processor processor=cpu.new Processor();
	CPU.RAM ram=cpu.new RAM();
	System.out.println("Processor Cache=" + processor.getCache());
	System.out.println("Ram Clock speed" + ram.getClockSpeed());
	}
}
