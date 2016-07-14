import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wjk on 16/7/13.
 */
public class LastModifiedController extends AbstractController implements LastModified {
    private long lastModified;
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message", "Hello World!");
        return modelAndView;
    }

    public long getLastModified(HttpServletRequest httpServletRequest) {
        if(lastModified == 0L) {
            //TODO 此处更新的条件：如果内容有更新，应该重新返回内容最新修改的时间戳
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
    }
}
