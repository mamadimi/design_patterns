import java.lang.reflect.Proxy;

public class Person implements PersonIntf {
	
	String name;
	int age;
	int votes;

	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.age = age;
		votes = 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public int getVotes() {
		// TODO Auto-generated method stub
		return votes;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;

	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
	}

	@Override
	public void vote(boolean vote) {
		// TODO Auto-generated method stub
		if(vote) votes++;
		if(!vote) votes--;

	}
	
	PersonIntf getOwnerProxy(PersonIntf person) {
		if (this.equals(person)) {
			return (PersonIntf) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
		}
		else {
			return (PersonIntf) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));

		}
	}
}
