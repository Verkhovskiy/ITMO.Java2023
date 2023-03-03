package Task03;

class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study javaStudy = new Study("Изучение Java - это просто!");
        String course = javaStudy.printCourse();
        System.out.println(course);
    }
}
