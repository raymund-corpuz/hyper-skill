module module_name {
    requires java.sql;
    exports org.fooddelivery.service;
    exports org.fooddelivery.util;
    exports org.fooddelivery.interfaces;
    exports org.fooddelivery.model;
    exports org.fooddelivery.record;
    exports org.fooddelivery.exception;
    exports org.fooddelivery.enums;
    exports org.fooddelivery.app;

    exports org.hotel.enums;
    exports org.hotel.app;
    exports org.hotel.model;
    exports org.hotel.interfaces;
//    exports org.hotel.exception;
//    exports org.hotel.service;
//    exports org.hotel.records;
}