package composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		AbstractFile.Folder f1 = new AbstractFile.Folder("我的收藏");
		
		f2 = new AbstractFile.ImageFile("老高的大头像.jpg");
		f3 = new AbstractFile.TextFile("Hello.txt");
		f1.add(f2);
		f1.add(f3);
		
		AbstractFile.Folder f11 = new AbstractFile.Folder("电影");
		f4 = new AbstractFile.VideoFile("笑傲江湖.avi");
		f5 = new AbstractFile.VideoFile("神雕侠侣.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		
		
//		f2.killVirus();
		
		f1.killVirus();
		
		
	}
}
