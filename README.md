# AndroidClassUtils

## 介绍
### [BaseActivity](http://t.cn/RmfloMs)
1. 沉浸式
2. Activity跳转  
3. 隐藏软键盘  
4. 弹吐司  
5. 销毁activity
6. 侧滑退出

### [BaseLazyFragment](http://dwz.cn/7Kqc9R)
当使用viewpager加载Fragment，沉浸式的使用，懒加载  
### [SlidingActivity](http://t.cn/RmfjRQf)
侧滑退出,可继承该Activity
### [ToastUtil](http://t.cn/RmfjsXm)
Toast工具类
### [CharAvatarView](https://urlc.cn/RmfY9fY)
[联系人头像效果](https://urlc.cn/RmfYuNB)

### [CustomViewPager](https://urlc.cn/RmfT7j4)
设置viewpager是否可以滑动
### [VerificationCodeView](https://urlc.cn/RmfTyBB)
生成随机验证码

### NetWorkUtil
判断是否有网络连接

### ThreadManager
线程池管理的工具类，封装类  
使用:  
```
 ThreadManager.getThreadPollProxy().execute(new Runnable() {
            @Override
            public void run() {
            //第一种方法
              sampleHandle.sendMessage(sampleHandle.obtainMessage(0));//成功失败通过if else判断
            }
            querySuccess();  //选择第二种方法请不要使用第一种
        });
```
可通过此方法发送消息:
```
 private Handler sampleHandle=new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            int what = msg.what;
            switch (what) {
                case 1:
                break;
                case 0:
                   break;
                default:
                    break;
            }
            return false;
        }
    });
```

第二种方法:
```
//主线程更新UI
private void  querySuccess(){
     ThreadUtil.runOnUiThread(Runnable runnable(){
      public void run() {};
     });
}
```

### ThreadUtil
1. 在子线程中执行
2. 在主线程执行

### SPUtils
SharedPreferences 主要功能：用于存储缓存数据

## How to use

Step 1. Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```
	dependencies {
		 compile 'com.github.cllstudy:AndroidClassUtils:1.0'
	}
  ```
