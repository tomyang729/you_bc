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
public class FriendsTags implements Serializable {

    private static final long serialVersionUID = -1271546668;

    private final String tag;

    public FriendsTags(FriendsTags value) {
        this.tag = value.tag;
    }

    public FriendsTags(
        String tag
    ) {
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FriendsTags (");

        sb.append(tag);

        sb.append(")");
        return sb.toString();
    }
}