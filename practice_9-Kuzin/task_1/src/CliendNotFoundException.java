public class CliendNotFoundException extends Exception{
    public CliendNotFoundException(){
        super("Данного клиента нет в базе");
    }
}
