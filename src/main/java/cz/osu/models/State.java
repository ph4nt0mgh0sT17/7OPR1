package cz.osu.models;

public class State {
    private String name;
    private String code;

    public State(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public State(State state) {
        name = state.getName();
        code = state.getCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("State {\n\t\t\t");
        sb.append("name='").append(name).append('\'').append(",\n\t\t\t");
        sb.append("code='").append(code).append('\'').append("\n\t\t");
        sb.append('}');
        return sb.toString();
    }
}
