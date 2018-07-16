package RecentFilePackage;

import java.util.Stack;

public class RecentFile {
	
	private Stack<File> recent;
	
	public RecentFile() {
		recent = new Stack<File>();
	}
	
	public int size() {
		return recent.size();
	}
	
	public void openFile(File f) {
		recent.remove(f);
		if(recent.size()>=15)
			recent.remove(14);
		recent.push(f);
	}
	
	public File topFile() {
		return recent.peek();
	}
	
}
