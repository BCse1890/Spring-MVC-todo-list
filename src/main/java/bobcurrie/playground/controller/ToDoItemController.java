package bobcurrie.playground.controller;

import bobcurrie.playground.model.ToDoData;
import bobcurrie.playground.service.ToDoItemService;
import bobcurrie.playground.util.Mappings;
import bobcurrie.playground.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {

    private final ToDoItemService toDoItemService;

    // == constructor ==
    @Autowired
    public ToDoItemController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    // == model attributes ==
    @ModelAttribute
    public ToDoData toDoData() {
        return toDoItemService.getData();
    }

    // == handler methods
    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
