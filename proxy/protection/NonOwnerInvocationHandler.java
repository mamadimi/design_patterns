import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

	PersonIntf person;
	public NonOwnerInvocationHandler(PersonIntf person) {
		// TODO Auto-generated constructor stub
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		try {
			if(method.getName().startsWith("get")) {
				throw new IllegalAccessException();
			}
			else if (method.getName().equals("vote")) {
				return method.invoke(person, args);
			}
			else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
