package com.lt.pattern.prototype;

import java.io.*;

/**
 * @author lt
 * @date 2022/9/19 14:13
 * @describe 对象深度拷贝（序列法方式），需要深度拷贝的继承此类
 */
public class DeepCloneSerializable implements Serializable {

    @SuppressWarnings("unchecked")
    public <T extends DeepCloneSerializable> T deepClone() {
        T deepClone = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);
            try(ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                ObjectInputStream obs = new ObjectInputStream(bis)
            ) {
                deepClone = (T) obs.readObject();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return deepClone;
    }
}