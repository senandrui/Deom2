class Test {
	public static void main(String[] args) {
	DirtyGirl hh = new DirtyGirl("TS",27);
	hh.sleep();
	hh.eat();
	hh.sex();
	}
}

abstract class People {
	private String name ;
	private int age;
	
	public People() {}

	public People(String name,int age) {
		this.name = name;
		this.age = age;
	} 
	
	public void setName(String name) {
		 this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		 this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public abstract void sleep(); 

	public abstract void eat() ;
}

interface Sex {
	int num = 10;

	public abstract void sex();
}

class Man extends People {
	public Man () {}
	
	public Man (String name, int age) {
		super(name,age);
	}

	public void sleep() {
		System.out.println("sleep with woman");
	}

	public void eat() {
		System.out.println("eat with woman");
	}


}

class Woman extends People {
	public Woman () {}

	public Woman (String name, int age) {
		super(name,age);
	}

	public void sleep() {
		System.out.println("sleep with man");
	}

	public void eat() {
		System.out.println("eat with man");
	}
}

class DirtyGirl extends Woman implements Sex {
	public DirtyGirl() {}

	public DirtyGirl(String name,int age) {
		super(name,age);
	}

	public void sex() {
	System.out.println("dirtygirl sleep with " + num + " man");
	}
}
