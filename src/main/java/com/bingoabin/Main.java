package com.bingoabin;

/**
 * @author xubin34
 * @date 2021/7/29 1:59 上午
 */
public class Main {
	public static void main(String[] args){
		//传统方式，但是不太好在里面画图
		// Frame frame = new Frame();
		// frame.setLocation(200, 400);
		// frame.setSize(800, 500);
		// frame.setTitle("Tank War");
		// frame.setVisible(true);

		//重写Frame 在构造函数中设置父类中的属性
		MyFrame myFrame = new MyFrame();
		myFrame.setVisible(true);
	}
}
