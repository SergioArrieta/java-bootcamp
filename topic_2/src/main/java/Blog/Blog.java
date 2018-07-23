package Blog;
/**
 *  A blog implementation.
 * @author Sergio Arrieta.
 */

import java.util.List;
import java.util.Stack;

public class Blog {

	private Stack<Entry> historyEntries;

	public Blog() {
		historyEntries = new Stack<Entry>();
	}

	public Entry postNewEntry(String title, String body, String author) {
		/**
		 * Post a new entry in the blog with a title, a body and an author.
		 */
		Entry newEntry = new Entry(title, body, author);
		// post behavior
		historyEntries.push(newEntry);
		return newEntry;
	}

	public boolean deleteEntry(Entry entry) {
		/**
		 * Delete an existing entry and return true. If no exist that entry return
		 * false.
		 */
		if (historyEntries.contains(entry)) {
			historyEntries.remove(entry);
			return true;
		}
		return false;
	}

	public List<Entry> mostRecentEntries(int quantity) {
		/**
		 * Show the most recent entries. If quantity is less that the size of the stack,
		 * only show an amount equals the size of the stack.
		 * 
		 * @param quantity:
		 *            quantity of entries to show.
		 * 
		 */
		if (this.historyEntries.size() < quantity) {
			return historyEntries.subList(0, quantity - 1);
		} else {
			return historyEntries.subList(0, this.historyEntries.size());
		}
	}

	public int getSize() {
		return historyEntries.size();
	}

}
