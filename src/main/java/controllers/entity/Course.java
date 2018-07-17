package controllers.entity;

public class Course {
    private int id;
    private String name;
    private Lecturer lecturer;

    public Course() {

    }

    public Course(int id, String name, Lecturer lecturer) {
        this.id = id;
        this.name = name;
        this.lecturer = lecturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (getId() != course.getId()) return false;
        if (getName() != null ? !getName().equals(course.getName()) : course.getName() != null) return false;
        return !(getLecturer() != null ? !getLecturer().equals(course.getLecturer()) : course.getLecturer() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getLecturer() != null ? getLecturer().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return " " +
                name + " Лектор: " +
                (lecturer != null ? lecturer : "");
    }
}
