interface callback {
	void callback(int p);
}

class client implements callback {
	public void callback(int p) {
		System.out.println("the value of callback is " + p); 
	}
	void Nonifacemethod() {
		System.out.println("This cannot be called by interface reference var");
	}
}
public class CallbackDemo {
	public static void main (String args[]) {
		client c1 = new client();
		callback r;
		r = c1;
		r.callback(50);
		//r.Nonifacemthod();
		c1.Nonifacemethod();
	}
}
