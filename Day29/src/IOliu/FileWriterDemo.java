
package IOliu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		//默认初始化
		//基本版本，谁有问题，就处理谁
//		FileWriter f = null;
//		try {
//			f = new FileWriter("f.txt");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	
//		try {
//			f.write("Hello");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			f.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//统一处理
		//由于这个f对象，需要在finally里面使用，所以要定义在try的外面
		FileWriter f = null;
		
		try{
		f = new FileWriter("f.txt");
		f.write("Hello");
		//f.close();//放这里不合理，可能在执行到这里前，一句出问题了，所以，这个必须放到finally代码里
		}catch(IOException e){
			//e.printStackTrace();
			System.out.println("IOliu.FileWriterDemo main写数据出问题了");
		}finally{
			//为了避免空指针异常，加入if判断
			if(f!=null){
				try {
					f.close();
				} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("IOliu.FileWriterDemo main释放资源失败");
				}
			}
		}
	}
}
