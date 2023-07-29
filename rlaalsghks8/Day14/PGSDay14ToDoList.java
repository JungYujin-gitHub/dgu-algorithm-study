import java.util.ArrayList;
import java.util.List;

public class PGSDay14ToDoList {
    public List solution(String[] todo_list, boolean[] finished) {
        
        List<String> toDoList = new ArrayList<>();
            
        for(int i=0; i<finished.length; i++){
            if(finished[i]==false){
                toDoList.add(todo_list[i]);
            }
        }    
            
            
        return toDoList;
    }
}
