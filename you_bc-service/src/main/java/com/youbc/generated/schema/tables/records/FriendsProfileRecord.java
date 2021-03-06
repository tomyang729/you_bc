/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.FriendsProfile;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FriendsProfileRecord extends UpdatableRecordImpl<FriendsProfileRecord> implements Record5<String, String, String, String, Timestamp> {

    private static final long serialVersionUID = -321036791;

    /**
     * Setter for <code>poke_you_bc.friends_profile.user_id</code>.
     */
    public FriendsProfileRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_profile.user_id</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>poke_you_bc.friends_profile.faculty</code>.
     */
    public FriendsProfileRecord setFaculty(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_profile.faculty</code>.
     */
    public String getFaculty() {
        return (String) get(1);
    }

    /**
     * Setter for <code>poke_you_bc.friends_profile.relationship</code>.
     */
    public FriendsProfileRecord setRelationship(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_profile.relationship</code>.
     */
    public String getRelationship() {
        return (String) get(2);
    }

    /**
     * Setter for <code>poke_you_bc.friends_profile.motto</code>.
     */
    public FriendsProfileRecord setMotto(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_profile.motto</code>.
     */
    public String getMotto() {
        return (String) get(3);
    }

    /**
     * Setter for <code>poke_you_bc.friends_profile.time_created</code>.
     */
    public FriendsProfileRecord setTimeCreated(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_profile.time_created</code>.
     */
    public Timestamp getTimeCreated() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FriendsProfile.FRIENDS_PROFILE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FriendsProfile.FRIENDS_PROFILE.FACULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FriendsProfile.FRIENDS_PROFILE.RELATIONSHIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FriendsProfile.FRIENDS_PROFILE.MOTTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return FriendsProfile.FRIENDS_PROFILE.TIME_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFaculty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRelationship();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMotto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getTimeCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileRecord value1(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileRecord value2(String value) {
        setFaculty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileRecord value3(String value) {
        setRelationship(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileRecord value4(String value) {
        setMotto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileRecord value5(Timestamp value) {
        setTimeCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileRecord values(String value1, String value2, String value3, String value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FriendsProfileRecord
     */
    public FriendsProfileRecord() {
        super(FriendsProfile.FRIENDS_PROFILE);
    }

    /**
     * Create a detached, initialised FriendsProfileRecord
     */
    public FriendsProfileRecord(String userId, String faculty, String relationship, String motto, Timestamp timeCreated) {
        super(FriendsProfile.FRIENDS_PROFILE);

        set(0, userId);
        set(1, faculty);
        set(2, relationship);
        set(3, motto);
        set(4, timeCreated);
    }
}
