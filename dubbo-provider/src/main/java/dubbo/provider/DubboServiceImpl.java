package dubbo.provider;

import dubbo.api.DubboService;

/**
 * 服务提供商.
 *
 * @author: huang
 * Date: 18-2-7
 */
public class DubboServiceImpl implements DubboService {
    @Override
    public String sayHello(String name) {
        return "你好 " + name;
    }
}
