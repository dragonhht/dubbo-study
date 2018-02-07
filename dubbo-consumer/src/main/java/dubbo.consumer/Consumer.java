package dubbo.consumer;

import dubbo.api.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务使用者.
 *
 * @author: huang
 * Date: 18-2-7
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-consumer.xml"});
        context.start();
        DubboService service = (DubboService) context.getBean("dubboService");
        String s = service.sayHello("张三");
        System.out.println(s);
    }
}
