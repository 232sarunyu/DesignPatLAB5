public class MainTest {
    public static void main(String[] args) {
        
        Student student = new Student.Builder("sarunyu boonkamjun", "KMitl").setAge(22).build();
        
        System.out.println("Name: " + student.getName());
        System.out.println("University: " + student.getUniversity());
        System.out.println("Age: " + student.getAge());
    }  
}