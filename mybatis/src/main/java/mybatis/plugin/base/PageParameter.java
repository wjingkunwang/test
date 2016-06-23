package mybatis.plugin.base;

import lombok.Data;

/**
 * 分页参数类
 * 
 */
@Data
public class PageParameter {

    public static final int DEFAULT_PAGE_SIZE = 5;

    private int pageSize;
    private int currentPage;
    private int prePage;
    private int nextPage;
    private int totalPage;
    private int totalCount;

    public PageParameter() {
        this.currentPage = 1;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    /**
     * 
     * @param currentPage
     * @param pageSize
     */
    public PageParameter(int currentPage, int pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

}
