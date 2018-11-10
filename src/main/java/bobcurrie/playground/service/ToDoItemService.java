package bobcurrie.playground.service;

import bobcurrie.playground.model.ToDoData;
import bobcurrie.playground.model.ToDoItem;

public interface ToDoItemService {
    void addItem(ToDoItem addedItem);

    void removeItem(int id);

    ToDoItem getItem(int id);

    void updateItem(ToDoItem toUpdate);

    ToDoData getData();
}
