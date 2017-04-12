package FileManager.Commands;

import FileManager.FileManager;
import FileManager.Functions.PrintDataWithRWXFunction;
import FileManager.Interfaces.PrintDataWithRWX;

/**
 * Created by User on 08.04.2017.
 */
public class PrintDataWithRWXCommand implements PrintDataWithRWX{
    private final PrintDataWithRWXFunction data;

    public ShowFileInfoCommand(PrintDataWithRWXFunction data){
        this.data = data;
    }

    @Override
    public void execute(String path) {
        this.data.showFiles(path);
    }
}
