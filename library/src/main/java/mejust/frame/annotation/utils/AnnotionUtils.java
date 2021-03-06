package mejust.frame.annotation.utils;

import android.support.annotation.NonNull;

import java.lang.annotation.Annotation;

/**
 * 创建时间:2017/4/2 18:18
 * 创建人: 李涛
 * 修改人:
 * 修改时间:
 * 描述:获取注解内容工具类
 */

public class AnnotionUtils {
    /**
     * 只在当前类中获取注解类
     * @param cls 使用了注解的class
     * @param aCls 注解的class
     * @param <A>
     * @return
     */
    public static <A extends Annotation> A annotation(@NonNull Class<?> cls, Class<A> aCls){
        if (cls == null) {
            return null;
        }
        if(cls.isAnnotationPresent(aCls)){
            return cls.getAnnotation(aCls);
        }else {
            return null;
        }

    }
    /**
     * 循环获取注解类(当前类中无A注解,就到他的父类中找A注解,递归虚招)
     * @param cls 使用了注解的class
     * @param aCls 注解的class
     * @param <A>
     * @return
     */
    public static <A extends Annotation> A annotationRecycle(@NonNull Class<?> cls, Class<A> aCls){
        if (cls == null) {
            return null;
        }
        A a = null;
        if(cls.isAnnotationPresent(aCls)){
            a = cls.getAnnotation(aCls);
        }
        if (a == null) {
            return annotationRecycle(cls.getSuperclass(),aCls);
        }
        return a;
    }
}
