
package IOliu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		//Ĭ�ϳ�ʼ��
		//�����汾��˭�����⣬�ʹ���˭
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
		
		//ͳһ����
		//�������f������Ҫ��finally����ʹ�ã�����Ҫ������try������
		FileWriter f = null;
		
		try{
		f = new FileWriter("f.txt");
		f.write("Hello");
		//f.close();//�����ﲻ����������ִ�е�����ǰ��һ��������ˣ����ԣ��������ŵ�finally������
		}catch(IOException e){
			//e.printStackTrace();
			System.out.println("IOliu.FileWriterDemo mainд���ݳ�������");
		}finally{
			//Ϊ�˱����ָ���쳣������if�ж�
			if(f!=null){
				try {
					f.close();
				} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("IOliu.FileWriterDemo main�ͷ���Դʧ��");
				}
			}
		}
	}
}
