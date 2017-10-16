package br.puc.pss.INF2125T2;

import java.util.UUID;

public class Utils {

	
	public static int generateUniqueId() {
		UUID idOne = UUID.randomUUID();
		String str = "" + idOne;
		int uid = str.hashCode();
		String filterStr = "" + uid;
		str = filterStr.replaceAll("-", "");
		return Integer.parseInt(str);
	}
	
}
