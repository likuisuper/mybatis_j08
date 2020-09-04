package tech.aistar.params;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/3 21:02
 */
public class PageInfoParameter {
    private int currPage;
    private int pageSize;
    private int startOffset;
    private int totalSize;
    private int totalPage;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(int startOffset) {
        this.startOffset = startOffset;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PageInfoParameter{");
        sb.append("currPage=").append(currPage);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", startOffset=").append(startOffset);
        sb.append(", totalSize=").append(totalSize);
        sb.append(", totalPage=").append(totalPage);
        sb.append('}');
        return sb.toString();
    }
}
