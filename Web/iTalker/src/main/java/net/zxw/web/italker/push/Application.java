package net.zxw.web.italker.push;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import net.zxw.web.italker.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * @author zxw
 */
public class Application extends ResourceConfig{
    public Application(){
        //注册逻辑处理的包名
        //packages("net.zxw.web.italker.push.service");
        packages(AccountService.class.getPackage().getName());

        //注册json解析器
        register(JacksonJsonProvider.class);

        //注册日志打印输出
        register(Logger.class);
    }
}
