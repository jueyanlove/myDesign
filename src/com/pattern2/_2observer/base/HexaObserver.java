package com.pattern2._2observer.base;

import com.pattern2._2observer.master.Subject;

/**
 * @description Hexa观察者
 * @author xudj
 * @date 2016年9月25日 上午7:10:31
 * @version 1.0
 */
public class HexaObserver extends Observer{

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hexa String:"
				+ Integer.toHexString(subject.getState()));
	}

}
