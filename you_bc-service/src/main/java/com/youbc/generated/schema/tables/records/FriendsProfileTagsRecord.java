/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.records;


import com.youbc.generated.schema.tables.FriendsProfileTags;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class FriendsProfileTagsRecord extends UpdatableRecordImpl<FriendsProfileTagsRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -2127180534;

    /**
     * Setter for <code>poke_you_bc.friends_profile_tags.user_id</code>.
     */
    public FriendsProfileTagsRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_profile_tags.user_id</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>poke_you_bc.friends_profile_tags.tag</code>.
     */
    public FriendsProfileTagsRecord setTag(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>poke_you_bc.friends_profile_tags.tag</code>.
     */
    public String getTag() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FriendsProfileTags.FRIENDS_PROFILE_TAGS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FriendsProfileTags.FRIENDS_PROFILE_TAGS.TAG;
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
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileTagsRecord value1(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileTagsRecord value2(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsProfileTagsRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FriendsProfileTagsRecord
     */
    public FriendsProfileTagsRecord() {
        super(FriendsProfileTags.FRIENDS_PROFILE_TAGS);
    }

    /**
     * Create a detached, initialised FriendsProfileTagsRecord
     */
    public FriendsProfileTagsRecord(String userId, String tag) {
        super(FriendsProfileTags.FRIENDS_PROFILE_TAGS);

        set(0, userId);
        set(1, tag);
    }
}
