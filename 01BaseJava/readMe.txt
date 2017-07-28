       


MyEclipse   Eclipse    Idea 等  都是 开发java的IDE工具！

http://www.oracle.com

oracle!

JDK： java开发工具包！(Java  Development TooKit)！
      是整个java的核心！  包含了JRE，一堆java类库！


JRE:  java运行环境！（Java  Runtime Environment）!
       包含了JVM，但是不包含编译器和调试器！
 

JVM： java虚拟机（Java  Virtial  Mechinal）!
      解析字节码文件，并且给CPU发送指令！执行我们的程序！
     
      java  是跨平台的！
      window  linux  mac

      我们在windows中利用java开发了一个软件！
      那么我向在linux系统中使用，不用再次开发！
      只需要在linux系统中按照 JVM!


为什么 学习Java！

汇编语言！
面向过程语言！
面向对象语言！

机器语言！  R语言！


java 编程语言！

           javaSE:基础

  javaEE:企业级开发    javaME:嵌入式开发 





下砸需要的JKD
之后配置环境变量！

01.找到JDK对应的配置
  复制到Bin目录  E:\U1\jdk1.7.0_45\bin
02.右键点击打开我的电脑---》属性---》高级系统设置----》设置环境变量
--》找到系统变量 中的 path  增加刚才的BIN路径 分号结尾; 英文！
03.验证环境变量配置成功！
 win+R   输入 cmd命令！

 输入java -version
 如果出现对应的版本号！ 安装成功！



Myeclipse   专业 破解！！！  前提 JDK配置成功！

01.打开myeclipse 查询是否需要破解
  
  上面工具栏中找到myeclipse
  下面的subscription节点！点击后查询

02.打开破解文件中的crack文件夹
   第一种方式：

     右键点击 cracker.jar选择打开方式！
     找到JDK按照位置中的BIN目录下面的java.exe打开！

   第二种方式：
     win+R    输入 cmd

     复制cracker.jar的位置！

     在dos窗口中 输出 
     pushd  cracker.jar的位置
     之后输入  java -jar cracker.jar

     会弹出一个窗口！


     001.在usercode的地方 随便输入用户名
     002.点击systemid
     003.点击active
     004.右上角点击tools中的2
     005.点击tools中的1
         这里需要替换文件
         找到myeclipse的安装目录中的common文件夹中的plugins文件夹

        复制这个目录替换即可！

      替换之后不要立即关闭破解文件！ 需耐心等待10-30s!  


 
 第一个java小程序 HelloWorld


所有以.java结尾的文件，我们称之为 源文件！
所有以.class结尾的文件，我们称之为 字节码文件！

javac  编译器    把 .java文件编译成.class文件

xjad  反编译器    把 .class文件编译成.java文件



01. public  访问权限  
02. class   类的关键字，声明类必须使用
03. HelloWorld   类名，首字母大写！

public  class  HelloWorld｛

｝

01. static  : 修饰方法的关键字
02. void   ： 方法的返回值，默认没有返回值时必须使用！
03. main()  ： 方法的名称！（行为的名称）
04.String [] args ：方法的参数！
05.｛ ｝  ：方法体！代码书写的地方！
 java程序的入口！
 public  static    void  main(String [] args){

 }

public static  都是方法的修饰符！ 所以可以互换位置！



常用的命名法：
  01.驼峰命名法： 首字母小写，之后每个有意义的单词首字母大写！
             firstName    适合于我们的变量命名

  02.帕斯卡命名法：每个有意义的单词首字母大写！          
             FirstName    适合于我们的类名  HelloWorld





在myeclipse中 如果不小心  把 jre 删除了 ！
 怎么还原！

 右键项目名 点击  build  path  ！




            
                                                                    
                                           