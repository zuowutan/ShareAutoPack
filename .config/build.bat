#快速编译打包apk脚本

echo  "$$package_begin$$"
sleep 1
#执行打包命令前,需要先定位到项目根目录

cd ..
gradlew build
#执行打包命令
gradle assembleRelease

echo -e "$$package success$$"

#桌面右上角弹出通知
notify-send build.sh "package down!"