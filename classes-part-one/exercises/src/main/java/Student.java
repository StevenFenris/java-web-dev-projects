public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;
        public String getName(){
                return name;
        }
        public void setName(String aName){
                this.name = aName;
        }
        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public Student(String name, int studentId) {
                this(name, studentId, 0, 0);
        }
        public String studentInfo() {
                return (this.name + " has a GPA of: " + this.gpa);
        }

}
