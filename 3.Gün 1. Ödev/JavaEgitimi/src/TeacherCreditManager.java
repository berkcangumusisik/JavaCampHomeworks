public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı");
    }

    @Override
    public void save() {
        super.save();
    }
}