# 2017118132_android
2019年android课程学习内容

项目中出现Invalid escape sequence at line 1 column 29 path $[0].name
将project下的gradle.properties
把里面的org.gradle.jvmargs=-Xmx1536m改成org.gradle.jvmargs=-Dfile.encoding=UTF-8
打开file>settings,找到instant Run把Enable Instant Run to hot swap code..这句话前面的√去掉
