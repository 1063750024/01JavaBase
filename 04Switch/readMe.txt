总结一下  选择结构

三元表达式：

01.if

 if(boolean类型的值){
 
 }

  如果只有一条输出语句  可以省略｛｝
  
02. if  else

 if(boolean类型的值){
 
 }else{
 
 }
 
03.多重if

if(boolean类型的值){

}else if(boolean类型的值){

}else{

}

else 可以省略

而且我们if  或者else if中的表达式 可以换位置！但是有可能影响我们的结果！
多数情况下，我们是有顺序！

04. 嵌套if

 if(){
      if(){
      
      }else  if(){
      
      }
      
 }else{
 
 }


选择结构 通常与 逻辑运算符 联合使用！
&&　｜｜　！



如果是等值判断  首选  switch

switch(表达式){
  case 常量1：
     break;
  case 常量2：
     break;
  case 常量3：
     break;
  default:
     break;
}


表达式的取值： byte  short  int  char   Enum(枚举)    jdk1.7+ String



















