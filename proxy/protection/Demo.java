
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Dimitrios", 25);
		Person p2 = new Person("John", 26);
		
		System.out.println(p1.getName() + " Age : " + p1.getAge() + " score : " + p1.votes);
		System.out.println(p2.getName() + " Age : " + p2.getAge() + " score : " + p2.votes);
		
		PersonIntf proxy = p1.getOwnerProxy(p1);
		try {
			proxy.setName("dimi");
		} catch (Exception e) {
			System.out.println("Cant change name");
		}
		
		proxy = p1.getOwnerProxy(p1);
		try {
			proxy.vote(true);
		} catch (Exception e) {
			System.out.println("Cant vote");
		}
		
		System.out.println(p1.getName() + " Age : " + p1.getAge() + " score : " + p1.votes);
		System.out.println(p2.getName() + " Age : " + p2.getAge() + " score : " + p2.votes);
		
	}

}
