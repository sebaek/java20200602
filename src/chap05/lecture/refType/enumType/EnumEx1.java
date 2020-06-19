package chap05.lecture.refType.enumType;

public class EnumEx1 {
	public static void main(String[] args) {
		int i = 3;
		Object o = new Object();
		
		MyEnum e1 = MyEnum.COFFEE;
		MyEnum e2 = MyEnum.WATER;
		MyEnum e3 = MyEnum.JUICE;
		MyEnum e4 = MyEnum.COFFEE;
		
		System.out.println(e1 == e4);
		System.out.println(e1.name());
		System.out.println(e1.toString());
		
		System.out.println();
		System.out.println(e1.ordinal());
		System.out.println(e2.ordinal());
		System.out.println(e3.ordinal());
	
		System.out.println();
		System.out.println(e1.compareTo(e2));
		System.out.println(e3.compareTo(e3));
		
		System.out.println();
		MyEnum e5 = MyEnum.valueOf("COFFEE");
		System.out.println(e5);
		System.out.println(e5 == MyEnum.COFFEE);
		
		System.out.println();
		MyEnum[] vals = MyEnum.values();
		System.out.println(vals.length);
		System.out.println(vals[0]);
		System.out.println(vals[1]);
		System.out.println(vals[2]);
	}
}





































