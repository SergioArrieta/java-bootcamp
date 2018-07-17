package topic_2;

import RecentFilePackage.File;
import RecentFilePackage.RecentFile;

public class Main {

	public static void main(String[] args) {

		RecentFile rFile = new RecentFile();

		// Post new entry
		File doc = new File("This is a document");
		rFile.openFile(doc);

		// Delete existing entry
		rFile.deleteEntry(doc);

		// Show 10 most recent entries

		for (int i = 1; i <= 10; i++) {
			doc = new File("This is a document " + i);
			rFile.openFile(doc);
		}
		System.out.println(rFile.getRecentsFiles(10));

	}

}
