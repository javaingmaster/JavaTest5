# JavaTest5

1. 运行build.sh
2. 再运行curl.sh
3. 最后运行stop.sh
注意：抓取日志在stop.sh中
下面第四个接口(更新接口有问题)

登陆接口@RequestMapping(value = "/customers",method = RequestMethod.POST)返回登陆人的id

查询film接口@RequestMapping(value = "/films",method = RequestMethod.GET)使用pagehelper
返回分页查询

插入接口@RequestMapping(value = "/customers",method = RequestMethod.PUT)成功返回1

更新接口@RequestMapping(value = "/customers/{uid}",method = RequestMethod.POST)返回更新对象信息

删除接口 @RequestMapping(value = "/customers",method = RequestMethod.DELETE)删除插入的对象
