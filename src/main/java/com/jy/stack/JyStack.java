package com.jy.stack;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * 实现栈功能
 *
 * @author jinchunzhao
 * @version 1.0
 * @date 2021-04-02 19:24
 */
public class JyStack<T> implements Serializable {

    /**
     * 创建一个初始容量为10的容器
     */
    private final LinkedList<T> STACK_LIST = new LinkedList<T>();

    /**
     * 构造函数
     */
    public JyStack() {
    }

    /**
     * 入栈 先进后出
     *
     * @param t 元素
     */
    public void push(T t) {
        STACK_LIST.addLast(t);
    }

    /**
     * 出栈,移除并获取最后一个元素，也就是最后入栈的元素
     *
     * @return 元素
     */
    public synchronized T pop() {
        return STACK_LIST.removeLast();
    }

    /**
     * 栈顶元素，获取最后一个元素，也就是最后入栈的元素
     *
     * @return 元素
     */
    public T top() {
        return STACK_LIST.getLast();
    }

    /**
     * 栈是否为空
     *
     * @return true/false
     */
    public boolean isEmpty() {
        return STACK_LIST.isEmpty();
    }

    /**
     * 搜索元素
     *
     * @param t 元素
     * @return 下标
     */
    public synchronized int search(T t) {
        return STACK_LIST.indexOf(t);
    }
}
