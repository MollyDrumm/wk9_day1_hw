import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {

private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
        this.populateStudents();

    }

    public List<Student> getStudents() {
        return students;
    }

    public void populateStudents() {
        Student student1 = new Student("Molly");
        Student student2 = new Student("Melinda");
        Student student3 = new Student("Robbie");
        Student student4 = new Student("Ricardo");
        Student student5 = new Student("Pat");
        Student student6 = new Student("Kirstin");
        Student student7 = new Student("Mark");
        Student student8 = new Student("Mike");
        Student student9 = new Student("Vicky");
        Student student10 = new Student("Raphael");
        Student student11 = new Student("Joanna");
        Student student12 = new Student("Garry");
        Student student13 = new Student("Emil");
        Student student14 = new Student("Tahnee");
        Student student15 = new Student("Marcin");
        Student student16 = new Student("Stuart");
        Student student17 = new Student("Euan");
        Student student18 = new Student("Digory");
        Student student19 = new Student("Gemma");
        Student student20 = new Student("Beata");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);

        }


        public Student getRandomStudent(){
            Collections.shuffle(students);
            return students.get(0);
        }

        public List<Student> getRandomPair(){
            ArrayList<Student> pair = new ArrayList<>();
            Collections.shuffle(students);
            Student student1 = students.get(0);
            Student student2 = students.get(1);
            pair.add(student1);
            pair.add(student2);
            return pair;
        }
    }