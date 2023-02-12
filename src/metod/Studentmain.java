package metod;

public class Studentmain {
    public static void main(String[] args) {
        // Student student = new Student(101,"Cemil","Abilov",77,true);
        //Student student2 = new Student(108,"Tunar","Meherremov",79,true);
       /* student.id = 99;
        student.name = "Cemil";
        student.surname = "Abilov";
        student.avg = 77;
        student.isActive = true;*/

        //student.printData();
        //student2.printData();

//        Student student = new Student();
//        student.setId(101);
//        student.setName("Veli");
//        student.setSurname("Memmedov");
//        student.setAvg(79);
//        student.setActive(true);
//        System.out.println(" id si "+student.getId());
//        System.out.println( " adi "+student.getName());
//        System.out.println(student.getSurname());
//        System.out.println(student.getAvg());
//        System.out.println(student.isActive());


        Student student1 = new Student(100, "rasid", "xalilov", 77, true);
        Student student2 = new Student(101, "Farid", 66);
        Student student3 = new Student(105, "renat", "xelilov", 58, true, "almali");
        Student student4 = new Student();

        student4.setId(12);
        student4.setName("Mehmed");


        student1.printData();
        student2.printData();
        student3.printData();
        student4.printData();


    }
}
