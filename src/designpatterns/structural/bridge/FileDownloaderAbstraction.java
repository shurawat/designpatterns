package designpatterns.structural.bridge;

public interface FileDownloaderAbstraction {
	
	public Object download(String path);
	public boolean upload(Object object);

}
