import java.util.ArrayList;

public class ClientArray extends ArrayList<Client>{
    public ClientArray() {
        super();
    }


    public boolean add(String name, long INN) {
        return super.add(new Client(name, INN));
    }


    public Client getClientWithName(String name) throws CliendNotFoundException{
        for(int i = 0; i<super.size(); i++){
            Client client = super.get(i);
            if(client.getName() == name){
                return client;
            }
        }
        throw new CliendNotFoundException();
    }

    public void order(String name, long INN) throws CliendNotFoundException, INNException{
        if(getClientWithName(name).getINN()!=INN)
            throw new INNException();
        System.out.println("Заказ оформлен");
    }
}
