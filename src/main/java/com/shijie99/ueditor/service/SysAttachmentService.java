package com.shijie99.ueditor.service;

import com.shijie99.ueditor.pojo.SysAttachment;

public interface SysAttachmentService {
	/**
	 * 获取图片
	 * @return   
	 * @author wangcf
	 * @date 2016-9-21 上午11:29:30
	 */
	public SysAttachment findById(String date,String id,String type);
}
