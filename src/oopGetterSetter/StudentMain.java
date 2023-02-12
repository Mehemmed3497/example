package oopGetterSetter;

public class StudentMain {
    public static void main(String[] args) {
        Student student=new Student();
        student.setId(99);
        student.setName("Mahammad");
        student.setSurname("Mehdizade");
        student.setAvg(77);
        student.setIsactive(true);
       // System.out.println(student);

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAvg());
        System.out.println(student.isIsactive());
    }
}
