package com.jy.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 自定义栈单元测试
 *
 * @author jinchunzhao
 * @version 1.0
 * @date 2021-04-02 21:43
 */
public class JyStackTest {

    private JyStack<String> jyStack;



    @Before
    public void setUp() throws Exception {
        jyStack = new JyStack<String>();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void push() {
        jyStack.push("中");
        jyStack.push("国");
        jyStack.push("人");
        jyStack.push("民");
        System.out.println(jyStack.toString());
    }

    @Test
    public void pop() {
        jyStack.push("我");
        jyStack.push("是");
        jyStack.push("谁");
        System.out.println(jyStack.toString());
        String pop = jyStack.pop();
        System.out.println(">>出栈>>>>"+pop);
        Assert.assertEquals(pop,"谁");
    }

    @Test
    public void top() {
        jyStack.push("万");
        jyStack.push("里");
        jyStack.push("长");
        jyStack.push("江");
        String top = jyStack.top();
        System.out.println(">>获取栈顶元素>>>>"+top);
        Assert.assertEquals(top,"江");
    }

    @Test
    public void isEmpty() {
        jyStack.push("繁");
        jyStack.push("荣");
        jyStack.push("昌");
        jyStack.push("盛");
        boolean empty = jyStack.isEmpty();
        Assert.assertFalse(empty);
    }

    @Test
    public void search() {
        jyStack.push("华");
        jyStack.push("夏");
        jyStack.push("民");
        jyStack.push("族");
        int i = jyStack.search("夏");
        System.out.println(i);
        Assert.assertEquals(1,i);

    }
}