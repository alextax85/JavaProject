public class classId {
    private long subjectId;
    private String name;

    public classId(long subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
