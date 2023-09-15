public class Test {
    public static void main(String[] args){
        Student stu1 = new Student("Alice", 21, 1080202102);
        Person p1 = new Person("Milan", 50);

        System.out.println("Category of people is: " + Person.category);
        System.out.println("Category of students is: " + Student.category);
        System.out.println("Can students speak? " + Student.canSpeak);
        System.out.println("Can stu1 speak? " + stu1.canSpeak);

        System.out.println("Category of stu1 is: " + stu1.category);

        System.out.println("p1 intelligent? " + p1.ifIntelligent);        //test final,可以背继承
        System.out.println("stu1 intelligent? " + stu1.ifIntelligent);
        System.out.println("stu1 intelligent? " + stu1.getIfIntelligent());





    }
}
