package RecentFilePackage;

public class File {
	
	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof File) {
			File tmpFile = (File)obj;
			if(this.name.equals(tmpFile.getName()))
					return true;
		}
		return false;
	}
}
