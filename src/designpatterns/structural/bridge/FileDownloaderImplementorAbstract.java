package designpatterns.structural.bridge;

public interface FileDownloaderImplementorAbstract {
	
	public Object download(String path);
	public boolean store(Object object);

}
