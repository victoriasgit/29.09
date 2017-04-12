package FileManager;

import FileManager.Interfaces.*;

/**
 * Created by User on 03.04.2017.
 */
public class AllCommand {

    public static Command command = new Command() {
        @Override
        public void execute(String path) {
            System.out.println(" ");
        }
    };

    public static Command getCommand(String task) {
        switch (task) {
            case "ls":
                command = new PrintData();
            case "l":
                command = new PrintDataWithRWX();
            case "cd":
                command = new ChangeDirectory();
            case "rm":
                command = new Remove();
            case "mv":
                command = new Move();
            case "cp":
                command = new Copy();
        }
        return command;
    }
}