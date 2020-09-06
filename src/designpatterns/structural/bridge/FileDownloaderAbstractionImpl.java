package designpatterns.structural.bridge;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {

	FileDownloaderImplementorAbstract provider = null;
	
	public FileDownloaderAbstractionImpl(FileDownloaderImplementorAbstract provider) {
		super();
		this.provider = provider;
	}
	
	@Override
	public Object download(String path) {
		return provider.download(path);
	}

	@Override
	public boolean upload(Object object) {
		return provider.store(object);
	}
	
	

}
