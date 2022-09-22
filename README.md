毕业设计——旅游网站的设计与实现

0、spinrgboot实现版本：https://github.com/neutrino25/bd_travel_springboot

1、本系统是一个地方性旅游网站，后台基于SSM框架，前台使用BootStrap、js、jsp实现，数据库使用mysql；

2、功能点分析

1）注册成功会发送邮件，封装了邮件的工具类；

2）注册时候会对密码进行MD5加密；同样每次对密码操作都要先加密；

3）分页使用的是jsp自定义标签；

4）上传图片到项目也是封装好了工具类；

5）在线支付调用易宝的支付接口；

6）自定义拦截器对为登陆用户进行拦截；

7）复杂的业务在于一个景点对应多个门票，想要门票显示在对应的景点下方，要先查询出来景点，再对它遍历，根据id去
   寻找门票，当时没有对应所有的景点都设置门票，报了空指针异常；
   
8）通过代码上传图片到项目需要手动刷新，否则访问就是404错误；


