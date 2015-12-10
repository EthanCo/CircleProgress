## CircleProgress ##
圆形的进度条，具有多种形态，CircleProgress的子类TickCircleProgress还具备刻度线

![CircleProgress](http://i5.tietuku.com/129231ec9683cca4.gif)

### 可设置的属性 ###

        <!-- 进度条的背景色-->
        bgColor
        进度条的前景色 起始颜色
        foreStartColor
        <!-- 进度条的前景色 结束颜色-->
       	foreEndColor 
        <!-- 进度条的大小-->
        progressWidth 
        <!-- 最大进度-->
        maxProgress
        <!-- 现在的进度-->
        currProgress
        <!-- 进度条的起始位置-->
        progressInitialPosition
        <!-- 是否使用动画-->
        useAnimation
        <!-- 使用渐变-->
        useGradient
        <!-- 边角是否是圆的-->
        isCircleCorner
        <!-- 是否是实心的-->
        isSolid format=boolean

### TickCircleProgress中增加的属性 ###

        <!-- 刻度条的粗细-->
        tickWidth 
        <!-- 刻度的颜色-->
        tickColor
        <!-- 刻度条的高度-->
        tickMarkHeight

### 最简单的使用 ###
在布局文件中

	<com.ethanco.circleprogresslibrary.CircleProgress
        android:id="@+id/myCircleProgress"
        android:layout_width="150dp"
        android:layout_height="150dp"
        custom:bgColor="@color/color_bg"
        custom:currProgress="160"
        custom:foreEndColor="@color/color2"
        custom:foreStartColor="@color/color1"
        custom:maxProgress="270"
        custom:progressInitialPosition="135"
        custom:progressWidth="12dp"
        custom:useAnimation="true" /> 

#### Java代码设置进度 ####
	mCircleProgress.setProgress(value);