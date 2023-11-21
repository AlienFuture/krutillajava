package csapat3.krutillazs.beadando.Abstracts;

abstract public class AbstractModel {
    public static final String ID = "id";
    public static final String CREATED_AT = "created_at";
    public static final String UPDATED_AT = "updated_at";
    public static final String IS_DELETED = "is_deleted";

    private int id;
    private String createdAt;
    private String updatedAt;
    private boolean isDeleted;

    public AbstractModel() {
        this.id = 0;
        this.createdAt = "";
        this.updatedAt = "";
        this.isDeleted = false;
    }

    public int getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
