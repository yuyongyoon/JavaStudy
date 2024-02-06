package ch10.ex07;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ObjectMain {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:/STUDY/temp/Object.dat");
		// outputStream
		FileOutputStream fos = new FileOutputStream(file, true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		// inputStream
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		// writing
		// put map
		Map<String, String> writeMap = new HashMap<String, String>();	
		writeMap.put("name", "홍길동");
		writeMap.put("phone", "010-2344-3232");

		// write map
		oos.writeObject(writeMap);
		oos.writeObject(new int[] {10, 20});
		oos.writeObject(new Sample());
		// write 완료 메세지
		System.out.println("저장 완료");

		
		// reading
		// read map
		Map<String, String> readMap = (Map<String, String>) ois.readObject();
		int[] arr = (int[])ois.readObject();
		String str = ois.readUTF();
		Sample sample = (Sample) ois.readObject();
		
		System.out.println(readMap);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);
		System.out.println(sample.method());
		
		// file 존재 시 열기
		if(file.exists()) {
			Desktop.getDesktop().open(file);
		}

		// 종료
		oos.flush();
		oos.close();
		
		ois.close();
		
		
		
	}

}
