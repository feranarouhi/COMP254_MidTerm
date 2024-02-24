
class StudentLinkedList {
    private StudentNode head;


    public StudentLinkedList() {
        this.head = null;
    }


    public void addStudent(Student student) {
        StudentNode newNode = new StudentNode(student);
        if (head == null) {
            head = newNode;
        } else {
            StudentNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        System.out.println("Student '" + student.getName() + "' added to the system.");
    }


    public void removeStudentById(int id) {
        if (head == null) {
            System.out.println("No students in the system.");
            return;
        }
        if (head.getStudent().getId() == id) {
            head = head.getNext();
            System.out.println("Student with ID '" + id + "' removed from the system.");
            return;
        }
        StudentNode current = head;
        StudentNode prev = null;
        while (current != null && current.getStudent().getId() != id) {
            prev = current;
            current = current.getNext();
        }
        if (current == null) {
            System.out.println("Student with ID '" + id + "' not found.");
        } else {
            prev.setNext(current.getNext());
            System.out.println("Student with ID '" + id + "' removed from the system.");
        }
    }


    public void displayStudents() {
        if (head == null) {
            System.out.println("No students in the system.");
            return;
        }
        System.out.println("Students in the system:");
        StudentNode current = head;
        while (current != null) {
            System.out.println(current.getStudent());
            current = current.getNext();
        }
    }
}