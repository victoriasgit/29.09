import java.util.Scanner;

public class ConsoleUserInteractor implements UserInteractor {
	
	private Scanner scanner;
	
  public ConsoleUserInteractor(){
    scanner = new Scanner(System.in);
  }
  
    @Override
    public String readCommand() throws UserInteractorReadException {
        System.out.print("Enter the command: ");
        return scanner.nextLine();
    }

  @Override
  public void print(String output) throws UserInteractorWriteException {
    System.out.println(">> " + output);
  }
}
