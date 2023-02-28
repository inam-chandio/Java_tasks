interface Sport{
void play();
}
class Cricket implements Sport {
@Override
public void play() {
System.out.println("Cricket Tornamnent");
}
}
class Football implements Sport { 
@Override
public void play() {
System.out.println("football Tornamnent");
	
	}
public static void main(String args[])
	{
Football f = new Football();
Cricket c = new Cricket();
f.play();
c.play();
	}
}
