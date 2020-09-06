package designpatterns.structural.bridge;

public class Client {
	
	public static void main(String[] args) {
		
		FileDownloaderAbstraction linuxDownloader = new FileDownloaderAbstractionImpl(new LinuxFileDownloaderImplementor());
		linuxDownloader.download("test");
		
		FileDownloaderAbstraction windowsdownloader = new FileDownloaderAbstractionImpl(new WindowsFileDownloaderImplementor());
		windowsdownloader.upload("test");
		
	}

}
