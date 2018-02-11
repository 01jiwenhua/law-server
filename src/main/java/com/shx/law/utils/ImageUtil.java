package com.shx.law.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class ImageUtil {
	// 保存文件路径
	public static final String SAVE_FOLDER = File.separator + "appData";
	/**
	 * 获取文件保存相对路径
	 * @param pathMap
	 * @return
	 */
	public static String getSavePath(Map<String, String> pathMap){
		StringBuilder pathBuilder=new StringBuilder();
		return pathBuilder.append(pathMap.get("type")).append(pathMap.get("fileName")).toString();
	}
	public static String getSavePath(HttpServletRequest request) {
		String realPath = request.getSession().getServletContext().getRealPath("");
		// String savePath = realPath.substring(0,
		// realPath.lastIndexOf("wtpwebapps"));
		return realPath + SAVE_FOLDER + File.separator;
	}

	public static String getDataUrl(HttpServletRequest request) {
		String requestUrl = request.getRequestURL().toString();
		String projectName = "apprest";
		String dataUrl = requestUrl.substring(0, requestUrl.lastIndexOf(projectName) + projectName.length());
		return dataUrl + SAVE_FOLDER + File.separator;
	}

	public static String getImageUrl(HttpServletRequest request, String imageName) {
		String requestUrl = request.getRequestURL().toString();
		String projectName = request.getContextPath();
		String dataUrl = requestUrl.substring(0, requestUrl.lastIndexOf(projectName) + projectName.length());
		return File.separator+"appData" + File.separator + imageName;
	}

	public static String GetImageStr(String imgFilePath) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
		byte[] data = null;

		// 读取图片字节数组
		try {
			InputStream in = new FileInputStream(imgFilePath);
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 对字节数组Base64编码
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(data);// 返回Base64编码过的字节数组字符串
	}
 
	public static boolean GenerateImageByBase64(String imgStr, String imgFilePath) {// 对字节数组字符串进行Base64解码并生成图片
		if (imgStr == null) // 图像数据为空
			return false;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// Base64解码
			byte[] bytes = decoder.decodeBuffer(imgStr);
			for (int i = 0; i < bytes.length; ++i) {
				if (bytes[i] < 0) {// 调整异常数据
					bytes[i] += 256;
				}
			}
			// 生成jpeg图片
			OutputStream out = new FileOutputStream(imgFilePath);
			out.write(bytes);
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String encodeByBase64(String data) {
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(data.getBytes());
	}

	/**
	 * 把 inputstream 复制 为 file_name
	 *
	 * @param
	 * @param is
	 * @return
	 */
	public static File GenerateImage(InputStream is, String imgFilePath) {
		File file = new File(imgFilePath);
		File fileFolder = new File(imgFilePath.substring(0, imgFilePath.lastIndexOf("\\")));

		OutputStream os = null;
		try {
			if (!fileFolder.exists() && !fileFolder.isDirectory()) {
				fileFolder.mkdir();
			}
			os = new FileOutputStream(file);
			byte buffer[] = new byte[4 * 1024];
			int len = 0;
			while ((len = is.read(buffer)) != -1) {
				os.write(buffer, 0, len);

			}
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return file;
	}

	public static String GenerateImage( MultipartFile multipartFile, HttpServletRequest request, String userName){
		try {
			String realPath = request.getSession().getServletContext().getRealPath("") + File.separator + "appData"
					+ File.separator;
			String fileName = multipartFile.getOriginalFilename();
			GenerateImage(multipartFile.getInputStream(), realPath + userName+fileName  );
			return getImageUrl(request, userName+fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
