package my.example.prac1;

import my.example.prac1.Data.BaseItem;
import my.example.prac1.Enums.EntityType;
import my.example.prac1.Factory.EntityFactory;

public class Main {
    
    public static void main(String[] args) {

        BaseItem book = EntityFactory.createEntity(EntityType.BOOK, 40, "1984");
        BaseItem client = EntityFactory.createEntity(EntityType.CLIENT, 10, "Alice");
        
        System.out.println();
        System.out.println(book + "\n");
        System.out.println(client + "\n");
    }
}
