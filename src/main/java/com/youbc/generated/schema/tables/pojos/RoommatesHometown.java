/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoommatesHometown implements Serializable {

    private static final long serialVersionUID = 1616752023;

    private final String hometown;

    public RoommatesHometown(RoommatesHometown value) {
        this.hometown = value.hometown;
    }

    public RoommatesHometown(
        String hometown
    ) {
        this.hometown = hometown;
    }

    public String getHometown() {
        return this.hometown;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoommatesHometown (");

        sb.append(hometown);

        sb.append(")");
        return sb.toString();
    }
}
