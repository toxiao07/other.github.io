package com.rtpksps.kss.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

	public static String getMd5Pwd(String pwd){
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 获取密码
			// 加盐
			md.update(pwd.getBytes());
			// 加密
			String newpwd = new BigInteger(1, md.digest()).toString(16);
			
			return newpwd;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		String md5Pwd = MD5Utils.getMd5Pwd("123");
		System.out.println(md5Pwd);
	}
}
