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

	public List<File> getRecentsFiles(int cant) {
		if (this.recent.size() < cant) {
			return recent.subList(0, cant - 1);
		} else {
			return recent.subList(0, this.recent.size());
		}
	}

}
