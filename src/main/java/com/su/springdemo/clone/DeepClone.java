package com.su.springdemo.clone;

import java.io.*;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.clone
 * @ClassName: DeepClone
 * @Author:night
 * @Description:利用序列化和反序列化进行对象的深拷贝
 * @Date:2019/6/29 21:26
 */
public class DeepClone implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Object deepClone() throws IOException, ClassNotFoundException {
        //序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        //反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }
}
