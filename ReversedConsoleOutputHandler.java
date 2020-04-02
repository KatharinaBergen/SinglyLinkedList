package Sorted_SLL;
public class ReversedConsoleOutputHandler implements OutputHandler {

	@Override
	public void handleLine(String line) {				
		
		String lineOutput = "";
		
		for (int index = line.length() - 1; index >= 0; index--) {
			lineOutput += line.charAt(index);
		}
		System.out.println(lineOutput);
	}

}
