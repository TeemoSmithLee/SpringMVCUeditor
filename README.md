# SpringMVCUeditor
v1.0.1
-------
**[feature]**
* git功能测试

v1.0.0
------
**[feature]**
* 百度Ueditor 与SpringMVC 整合图片上传功能

**[config]**
* 由于本人使用的是jboss7开发，所以配置文件confing.properties 放在了standalone文件夹下，可以自己在applicationContext.xml中修改。本项目将图片的保存与项目分离，保证了即使项目替换也不回丢失已经保存的图片信息
* 需要配置图片保存地址
```
#上传图片保存地址
ueditor.imageSavePath=D:/ueditor
```
**[other]**
* 本项目为百度的ueditor与SpringMVC结合实现图片上传的功能，其他的未实现（目前本人只需要这个功能...）。
* 图片保存地址可以自己配置，配置文件可以自己在applicationContext.xml中修改。
* config.json文件中的imagePathFormat 不建议在前边增加路径，需要的请在图片保存地址中增加。
* config.json文件中imageUrlPrefix配置不建议配置，理由同上。
* 本项目使用的ueditor源码版本为1_4_3_3-src.zip中源码。并对其中保存图片类BinaryUploader 的save方法做了修改以适用SpringMVC,参考了网上的代码.
* 对图片的读取,采用了请求action的方式，有项目去磁盘读取图片并返回图片流的方式加载。
* 参考了博客内容:[http://blog.csdn.net/huangwenyi1010/article/details/51638123](http://blog.csdn.net/huangwenyi1010/article/details/51638123)