package graphql.schema;


public class GraphQLFieldArgument {

    private final String name;
    private final String description;
    private final GraphQLInputType type;
    private final Object defaultValue;

    public GraphQLFieldArgument(String name, String description, GraphQLInputType graphQLInputType, Object defaultValue) {
        this.name = name;
        this.description = description;
        this.type = graphQLInputType;
        this.defaultValue = defaultValue;
    }

    public GraphQLFieldArgument(String name, GraphQLInputType type) {
        this(name, null, type, null);
    }

    public String getName() {
        return name;
    }

    public GraphQLInputType getType() {
        return type;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }


    public String getDescription() {
        return description;
    }

    public static Builder newFieldArgument() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private GraphQLInputType type;
        private Object defaultValue;
        private String description;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }


        public Builder type(GraphQLInputType type) {
            this.type = type;
            return this;
        }

        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public GraphQLFieldArgument build() {
            return new GraphQLFieldArgument(name, description, type, defaultValue);
        }
    }


}