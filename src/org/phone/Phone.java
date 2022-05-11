package org.phone;

public class Phone {
private void phoneInfo() {
	System.out.println("phone information");
}
private void phoneInfo(String brand,long imeiNo) {
	System.out.println(brand + "\n" + imeiNo);
}
private void phoneInfo(long serialNo ,String sim) {
	System.out.println(serialNo+ "\n" + sim);
}

private void phoneInfo(int memoerySize,double screenSize) {
	System.out.println(memoerySize + "CM" +"\n" + screenSize + "CM");
}
private void phoneInfo(double phoneSize,int ramSize) {
	System.out.println(phoneSize +"MB"+ "\n" + ramSize + "CM");
	
	
	
}

public static void main(String[] args) {
	
	Phone obj=new Phone();
	obj.phoneInfo();
	obj.phoneInfo("apple", 548643456644l);
	obj.phoneInfo(45621512222l, "Duelsim");
	obj.phoneInfo(60,15.64);
	obj.phoneInfo(56.56,56);
	
}

private void phoneNO() {
	System.out.println("a");
	System.out.println("b");
	System.out.println("d");
	System.out.println("e");
}

}

