package Blog;

import java.util.Stack;

public class Blog {

	private Stack<Entry> historyEntries;
	
	public Blog() {
		historyEntries = new Stack<Entry>();
	}

	public Entry postNewEntry(String title, String body, String author) {
		Entry newEntry = new Entry(title, body, author);
		historyEntries.push(newEntry);
		return newEntry;
	}

	public boolean deleteEntry(Entry entry) {
		if (historyEntries.contains(entry)) {
			historyEntries.remove(entry);
			return true;
		}
		return false;
	}

}
