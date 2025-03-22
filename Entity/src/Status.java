public enum Status {
    Running("run"), sleeping("sl"), studying("studying");

    private final String name;
    Status(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
