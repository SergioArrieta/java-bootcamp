package RecentFilePackage;

import java.util.List;
import java.util.Stack;

public class RecentFile {

	private final static int MAX_RECENT_FILE = 15;

	private Stack<File> recent;

	public RecentFile() {
		this.recent = new Stack<File>();
	}

	public int getSize() {
		return this.recent.size();
	}

	public void openFile(File f) {
		/**
		 * Open a new file. If this was open recently so is deleted it from the history
		 * and added it in the top on the stack.
		 */
		this.recent.remove(f);
		if (this.recent.size() >= MAX_RECENT_FILE)
			this.recent.remove(MAX_RECENT_FILE - 1);
		this.recent.push(f);
	}

	public File getTopFile() {
		return this.recent.peek();
	}

	public void deleteEntry(File f) {
		this.recent.remove(f);
	}

	public List<File> getRecentsFiles(int quantity) {
		/**
		 * Show the most recent entries. If quantity is less that the size of the stack,
		 * only show an amount equals the size of the stack.
		 */
		if (this.recent.size() < quantity) {
			return recent.subList(0, quantity - 1);
		} else {
			return recent.subList(0, this.recent.size());
		}
	}

}
