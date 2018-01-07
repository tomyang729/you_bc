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
public class RoommatesProfileTags implements Serializable {

    private static final long serialVersionUID = 506664424;

    private final String  userId;
    private final Integer tagId;

    public RoommatesProfileTags(RoommatesProfileTags value) {
        this.userId = value.userId;
        this.tagId = value.tagId;
    }

    public RoommatesProfileTags(
        String  userId,
        Integer tagId
    ) {
        this.userId = userId;
        this.tagId = tagId;
    }

    public String getUserId() {
        return this.userId;
    }

    public Integer getTagId() {
        return this.tagId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoommatesProfileTags (");

        sb.append(userId);
        sb.append(", ").append(tagId);

        sb.append(")");
        return sb.toString();
    }
}