package July_9_2025.Third;

import java.util.Optional;

@SuppressWarnings("ALL")
public class Main {
	public static void main(String[] args) {
		String s = "Test";
		Optional<String> opt = Optional.ofNullable(s);
		
		//Using is Present
		if (opt.isPresent()) {
			System.out.println(opt.get());
		} else{
			System.out.println("No Value");
		}
		
		//Using isEmpty
		if (!opt.isEmpty()){
			System.out.println(opt.get());
		}
		
		//Using ifPresentk
		opt.ifPresent(str ->System.out.println(str));
		
		Optional<String> opt2 = Optional.ofNullable(getName());
		//using presentOrElse
		opt2.ifPresentOrElse(str-> System.out.println(str),
				()-> System.out.println("No Value"));
	}
	
	private static String getName(){
		String name = null;
		return name;
	}
}
