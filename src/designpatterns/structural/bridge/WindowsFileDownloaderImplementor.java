package designpatterns.structural.bridge;

public class WindowsFileDownloaderImplementor implements FileDownloaderImplementorAbstract {

	@Override
	public Object download(String path) {
		System.err.println("file downloaded for windows");
		return new Object();
	}

	@Override
	public boolean store(Object object) {
		System.err.println("object store for windows");
		return true;
	}


}
