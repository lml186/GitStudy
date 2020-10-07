package main;

import java.util.ArrayList;

public class MainTask {//成绩统计

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(60);
		arr.add(20);
		arr.add(90);
		arr.add(30);
		//1.对成绩进行排序
		//2.求平均分，最大值，最小值，中值，及格率，优秀率
		//3.统计区间
		SortClass sc=new SortClass();
		sc.sort(arr);

	}

}
