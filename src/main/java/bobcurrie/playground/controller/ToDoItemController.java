package bobcurrie.playground.controller;

import bobcurrie.playground.model.ToDoData;
import bobcurrie.playground.model.ToDoItem;
import bobcurrie.playground.service.ToDoItemService;
import bobcurrie.playground.util.AttributeNames;
import bobcurrie.playground.util.Mappings;
import bobcurrie.playground.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Slf4j
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

    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(Model model) {
        ToDoItem toDoItem = new ToDoItem("", "", LocalDate.now());
        model.addAttribute(AttributeNames.TODO_ITEM, toDoItem);
        return ViewNames.ADD_ITEM;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) ToDoItem toDoItem) {
        log.info("toDoItem from  = {}", toDoItem);
        toDoItemService.addItem(toDoItem);
        return "redirect:/" + Mappings.ITEMS;
    }
}
