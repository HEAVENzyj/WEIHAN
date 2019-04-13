package com.ruoyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.ruoyi.*.mapper")
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  伟航启动成功!   ლ(´ڡ`ლ)ﾞ  \n" +
                " ___      ____      ___    ___        ___    \n" +
                " \\  \\     |  |     /  /   |  |       |  |    \n" +
                "  \\  \\    |  |    ,  /    |  |       |  |    \n" +
                "   \\  \\   |  |   /  ,     |  |_______|  |    \n" +
                "    \\  \\  |  |  ,  /      |   _______   |    \n" +
                "     \\  \\/ |  \\/  /       |  |       |  |   \n" +
                "      \\ `  /|    /        |  |       |  |     \n" +
                "       \\  / \\   /         |  |       |  |    \n" +
                "        '-'  `-'          |__|       |__|      \n" +
                "ヾ(❀●◡●)ﾉ滴~哒哒哒哒哒...~(´▽` )~**  ");
    }
}