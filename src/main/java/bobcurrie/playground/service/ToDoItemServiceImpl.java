package bobcurrie.playground.service;

import bobcurrie.playground.model.ToDoData;
import bobcurrie.playground.model.ToDoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;



@Service
public class ToDoItemServiceImpl implements ToDoItemService{

    // == fields ==
    @Getter
    public final ToDoData data = new ToDoData();


    // == public methods ==
    @Override
    public void addItem(ToDoItem addedItem) {
        data.addItem(addedItem);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(ToDoItem toUpdate) {
        data.updateItem(toUpdate);
    }

}
