package randomer;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomThread implements Runnable {
	private main gui = null;

	Random rnd = new Random();

	Thread thread = null;

	String[] list = main.textField.getText().split(", ");

	boolean isRunning = false;

	public RandomThread(main gui) {
		this.gui = gui;
		this.thread = new Thread(this);
		thread.start();
	}

	public void run() {
		Random rand = new Random();
		for (int i = 0; i < 500; i++) {
			for (int o = 0; o < list.length; o++) {
				String n = list[rand.nextInt(list.length)];
				main.a.setText(n);
				System.out.println(n);
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int o = 0; o < list.length; o++) {
				String n = list[rand.nextInt(list.length)];
				main.a.setText(n);
				System.out.println(n);
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 50; i++) {
			for (int o = 0; o < list.length; o++) {
				String n = list[rand.nextInt(list.length)];
				main.a.setText(n);
				System.out.println(n);
			}
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 50; i++) {
			for (int o = 0; o < list.length; o++) {
				String n = list[rand.nextInt(list.length)];
				main.a.setText(n);
				System.out.println(n);
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 50; i++) {
			for (int o = 0; o < list.length; o++) {
				String n = list[rand.nextInt(list.length)];
				main.a.setText(n);
				System.out.println(n);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 20; i++) {
			for (int o = 0; o < list.length; o++) {
				String n = list[rand.nextInt(list.length)];
				main.a.setText(n);
				System.out.println(n);
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int o = 0; o < list.length; o++) {
				String n = list[rand.nextInt(list.length)];
				if (i > 5 && i < 9)
				main.a.setText(n + " รับของรางวัลสำรองที่ห้องโสต");//s
				else
					main.a.setText(n);
				System.out.println(n);
			}
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 5; i++) {
			main.a.setForeground(Color.WHITE);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			main.a.setForeground(Color.BLACK);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		main.a.setText("'"+main.a.getText()+ "'" + " is The Winner!");
		
		isRunning = false;

	}

}