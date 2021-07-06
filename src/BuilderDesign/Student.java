package BuilderDesign;

public class Student {

    private String name;
    private String age;
    private String fatherName;
    private String MotherName;
    private String address;
    private String dob;
    private String height;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", MotherName='" + MotherName + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    private String weight;

    private Student(StudentBuilder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.fatherName=builder.fatherName;
        this.MotherName=builder.motherName;
        this.dob=builder.dob;
        this.height=builder.height;
        this.weight=builder.weight;
    }
    public static class StudentBuilder{
        private String name;
        private String age;
        private String fatherName;
        private String motherName;
        private String address;
        private String dob;
        private String height;
        private String weight;

        StudentBuilder(String name,String age, String fatherName,String motherName){
            this.name=name;
            this.age=age;
            this.fatherName=fatherName;
            this.motherName=motherName;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setDob(String dob) {
            this.dob = dob;
            return this;
        }

        public StudentBuilder setHeight(String height) {
            this.height = height;
            return this;
        }

        public StudentBuilder setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public Student build(){
            Student s1=new Student(this);
            return s1;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
