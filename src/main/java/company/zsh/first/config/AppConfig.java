package company.zsh.first.config;

import company.zsh.first.model.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhousuhua
 * @date 25/1/21 下午9:30
 */

@Configuration
public class AppConfig {

    @Value("${zhouzhou.name}")
    private String name;

    public String getName() {
        return name;
    }

    // 通过注解Bean， 就可以作为单例被其他SpringBean通过@Autowired注解引入和使用
    @Bean
    public Item makeSingleItem() {
        Item item = new Item();
        item.setIndex(1);
        item.setName("zhousuhua");
        return item;
    }
}
