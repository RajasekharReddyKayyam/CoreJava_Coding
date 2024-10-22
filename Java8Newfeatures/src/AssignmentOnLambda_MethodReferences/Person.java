package AssignmentOnLambda_MethodReferences;

public class Person {
private String name;
private int age;
private double height;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Person(String name, int age, double height) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getHeight() {
	return height;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
}
public void setHeight(float height) {
	this.height = height;
}
}
