package com.bingoabin;

import java.awt.*;

/**
 * @author xubin34
 * @date 2021/7/29 1:59 上午
 */
public class MyFrame extends Frame {

	public MyFrame(){
		//设置方框左上角的坐标
		this.setLocation(200, 400);
		//设置方框的长宽
		this.setSize(800, 500);
		//设置标题
		this.setTitle("Tank War");

		//响应键盘事件，监听者模式
		// this.addKeyListener();
	}

	public void paint(Graphics g) {

	}
}
