/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class ClassmatesProfile implements Serializable {

    private static final long serialVersionUID = 1928556016;

    private final String    userId;
    private final Integer   marjorId;
    private final String    motto;
    private final Timestamp timeCreated;

    public ClassmatesProfile(ClassmatesProfile value) {
        this.userId = value.userId;
        this.marjorId = value.marjorId;
        this.motto = value.motto;
        this.timeCreated = value.timeCreated;
    }

    public ClassmatesProfile(
        String    userId,
        Integer   marjorId,
        String    motto,
        Timestamp timeCreated
    ) {
        this.userId = userId;
        this.marjorId = marjorId;
        this.motto = motto;
        this.timeCreated = timeCreated;
    }

    public String getUserId() {
        return this.userId;
    }

    public Integer getMarjorId() {
        return this.marjorId;
    }

    public String getMotto() {
        return this.motto;
    }

    public Timestamp getTimeCreated() {
        return this.timeCreated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassmatesProfile (");

        sb.append(userId);
        sb.append(", ").append(marjorId);
        sb.append(", ").append(motto);
        sb.append(", ").append(timeCreated);

        sb.append(")");
        return sb.toString();
    }
}
