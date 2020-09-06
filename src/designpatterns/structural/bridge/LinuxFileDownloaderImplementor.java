package designpatterns.structural.bridge;

public class LinuxFileDownloaderImplementor implements FileDownloaderImplementorAbstract {

	@Override
	public Object download(String path) {
		System.err.println("file downloaded for linux");
		return new Object();
	}

	@Override
	public boolean store(Object object) {
		System.err.println("object store for linux");
		return true;
	}

}
