import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class doc7_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Думите в текстовия файл са разделени с нов ред.
		File wordsFile = new File("words.txt");
		List<String> wordsList = new ArrayList<>();
		try {
			Scanner reader = new Scanner(wordsFile);
			while(reader.hasNextLine()) {
				wordsList.add(reader.nextLine());
			}
			Collections.sort(wordsList);
			System.out.print(String.join("\n", wordsList).trim());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
