package com.epoint.test;

import cn.com.epoint.PingBiaoInterface;
import cn.com.epoint.PingBiaoInterfaceSoap;

public class test {
	public static void main(String[] args) {
//		HaiHangWebServiceService service = new HaiHangWebServiceService();
//		System.out.println(service.getHaiHangWebServicePort().isSynPW("111", "ss"));
//		System.out.println(service.getHaiHangWebServicePort().synchronousAllInfo("11"));
		//OnlineHall service=new OnlineHall();
		//System.out.println(service.getOnlineHallHttpPost().getNJHWDanwei("1447E48-C203-4F6D-A3DF-188DEE71C1B6", "Epoint**##"));
		PingBiaoInterface pb=new PingBiaoInterface();
		System.out.println(pb.getPort(PingBiaoInterfaceSoap.class).getNJHWBiaoDuan(""));
	}
}
