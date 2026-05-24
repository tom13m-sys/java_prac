package my.example.prac1.Factory;

import my.example.prac1.Data.BaseItem;
import my.example.prac1.Data.Book;
import my.example.prac1.Data.Client;
import my.example.prac1.Enums.EntityType;

public class EntityFactory {

    public static BaseItem createEntity(EntityType type, int id, String name) {
        switch (type) {
            case BOOK:
                return new Book(id, name);
            case CLIENT:
                return new Client(id, name);
            default:
                return null;
        }
    }
}
