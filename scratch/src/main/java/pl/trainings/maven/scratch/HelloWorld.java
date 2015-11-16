package pl.trainings.maven.scratch;

public class HelloWorld {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings greetings = new Greetings();
		System.out.println(greetings.sayHello(args.length>0 ? args[0]: null));
	}

}
