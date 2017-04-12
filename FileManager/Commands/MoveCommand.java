package FileManager.Commands;

import FileManager.FileManager;
import FileManager.Functions.MoveFunction;
import FileManager.Interfaces.Command;
import FileManager.Interfaces.Move;

/**
 * Created by User on 08.04.2017.
 */
public class MoveCommand implements Command {
    private final MoveFunction move;

    public MoveCommand(MoveFunction move){
        this.move = move;
    }

    @Override
    public void execute(String path1, String path2){
        this.move.moveTo(path1, path2);
    }
}

