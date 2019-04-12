package netflix.feign.models;

public class page {
    private Integer size;
    private Integer totalElements;
    private Integer totalPages;
    private Integer number;

    public page(Integer size, Integer totalElements, Integer totalPages, Integer number) {
        this.size = size;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.number = number;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
