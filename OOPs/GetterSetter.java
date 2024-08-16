package OOPs;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }
    public void setId(int i){
        id = 1;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        MyEmployee pooja = new MyEmployee();
        pooja.setName("Pooja Deurker");
        System.out.println(pooja.getName());
        pooja.setId(1);
        System.out.println(pooja.getId());

    }
}
