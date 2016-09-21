package com.shijie99.ueditor.service.impl;

import java.io.File;

import org.springframework.stereotype.Service;

import com.shijie99.ueditor.Config.ConfigTool;
import com.shijie99.ueditor.pojo.SysAttachment;
import com.shijie99.ueditor.service.SysAttachmentService;

@Service
public class SysAttachmentServiceImpl implements SysAttachmentService {

	@Override
	public SysAttachment findById(String date,String id,String type) {
		SysAttachment sysAttachment = new SysAttachment();
		sysAttachment.setType(type);
		sysAttachment.setPath(ConfigTool.getImageSavePath()+File.separator+date+File.separator+id+"."+type);
		return sysAttachment;
	}

}
