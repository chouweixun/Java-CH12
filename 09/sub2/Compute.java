public class Compute extends MyMath {
    private double ans;
	
	public void add(int a, int b) {
        ans = a + b;
    }
    
    public void sub(int a, int b) { 
        ans = a - b;
    }
    
    public void mul(int a, int b) { 
        ans = a * b;
    }
    
    public void div(int a, int b) { 
		ans = (double)a / b;
    }
	
	public void show(){
        if (ans % 1 == 0) {
        System.out.println("ans:" + (int) ans);
    } 
    else {
        System.out.println("ans:" + ans);
    }
    }
}
