import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
   
public static void main(String[] args) {

    


    Animal animal = new Animal ("", "");

    Scanner = scanner = new Scanner (System.in);

    

    String raca = scanner.nextLine();
    String origem = scanner.nextLine();

    //animal.setRaca("Pastor");
    //animal.setOrigem ("Alemanha");

    String raca = "";
    String origem = "";

    insereAnimal( raca, origem);

      insereAnimal (Animal.getRaca(), Animal.getOrigem());



 
    
    }

    public String insereAnimal(String raca, String origem){

    List<Animal> lista = new ArrayList<>();
 
    lista.add(new Animal(null,null));
    return lista.toString();

    }

       
 
}

