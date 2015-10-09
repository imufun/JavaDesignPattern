
public interface Flay {
	String fly();
}

class ItsFlys implements Flay {

	public String fly() {
		// TODO Auto-generated method stub
		return "Flying High";
	}

}

class CantFly implements Flay {

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I can not Fly";
	}
}