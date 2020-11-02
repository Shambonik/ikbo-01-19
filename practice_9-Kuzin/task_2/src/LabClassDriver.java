public class LabClassDriver {

    private static LabClass labClass;
    private static LabClassUI ui;

    public static void main(String[] args) {
        labClass = new LabClass();
        ui = new LabClassUI();
        labClass.add("Кузин Данил", 272);
        labClass.add("Пономарев Денис", 272);
        labClass.add("Воскресин Евгений", 268);
        labClass.add("Понедельнин Эмгыр", 250);
    }

    public static void writeStudentGrade(String name){
        try {
            ui.setTextLabel("Оценка " + name + " -> " + labClass.findByName(name).getGrade());
        }catch (Exception e){
            System.out.println(e.getMessage());
            ui.setTextLabel(e.getMessage());
        }
    }
}
