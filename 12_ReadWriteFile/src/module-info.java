module module_name {
    requires java.sql;
    exports org.food.app;
    exports org.food.file;
    exports org.food.record;
    exports org.food.people;
    exports org.food.restaurant;

    //---- com.food
    exports com.food.app;
    exports com.food.file;
    exports com.food.record;
    exports com.food.model;
    exports com.food.interfaces;
    
}