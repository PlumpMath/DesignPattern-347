package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ԭ��ģʽ��Ȼ�Ǵ����͵�ģʽ�������빤��ģʽû�й�ϵ��
 * �����ּ��ɿ�������ģʽ��˼����ǽ�һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
 * ��С���ͨ������ĸ��ƣ����н��⡣��Java�У����ƶ�����ͨ��clone()ʵ�ֵ�
 * @author Administrator
 *
 */

/**
 * һ��ԭ���ֻ࣬��Ҫʵ��Cloneable�ӿڣ���дclone�������˴�clone�������Ըĳ���������ƣ�
 * ��ΪCloneable�ӿ��Ǹ��սӿڣ���������ⶨ��ʵ����ķ���������cloneA����cloneB����Ϊ�˴����ص���super.clone()��仰��
 * super.clone()���õ���Object��clone()����������Object���У�clone()��native�ģ�������ôʵ�֣��һ�����һƪ�����У����ڽ��Java�б��ط����ĵ��ã��˴��������
 * @author Administrator
 *
 */

/**
 * ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
 * ��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
 * @author Administrator
 *
 */
public class ProtoType implements Cloneable{
	/* ǳ���� */  
	public ProtoType clone() throws CloneNotSupportedException{
		ProtoType pt = (ProtoType)super.clone();
		return pt;
	}
	
	 /* ��� */  
    public Object deepClone() throws IOException, ClassNotFoundException {  
  
        /* д�뵱ǰ����Ķ������� */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* �������������������¶��� */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
    }  
}
