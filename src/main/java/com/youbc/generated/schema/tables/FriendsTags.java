/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables;


import com.youbc.generated.schema.Keys;
import com.youbc.generated.schema.PokeYouBc;
import com.youbc.generated.schema.tables.records.FriendsTagsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class FriendsTags extends TableImpl<FriendsTagsRecord> {

    private static final long serialVersionUID = 800530865;

    /**
     * The reference instance of <code>poke_you_bc.friends_tags</code>
     */
    public static final FriendsTags FRIENDS_TAGS = new FriendsTags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FriendsTagsRecord> getRecordType() {
        return FriendsTagsRecord.class;
    }

    /**
     * The column <code>poke_you_bc.friends_tags.tag</code>.
     */
    public final TableField<FriendsTagsRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>poke_you_bc.friends_tags</code> table reference
     */
    public FriendsTags() {
        this("friends_tags", null);
    }

    /**
     * Create an aliased <code>poke_you_bc.friends_tags</code> table reference
     */
    public FriendsTags(String alias) {
        this(alias, FRIENDS_TAGS);
    }

    private FriendsTags(String alias, Table<FriendsTagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FriendsTags(String alias, Table<FriendsTagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PokeYouBc.POKE_YOU_BC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FriendsTagsRecord> getPrimaryKey() {
        return Keys.KEY_FRIENDS_TAGS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FriendsTagsRecord>> getKeys() {
        return Arrays.<UniqueKey<FriendsTagsRecord>>asList(Keys.KEY_FRIENDS_TAGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FriendsTags as(String alias) {
        return new FriendsTags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FriendsTags rename(String name) {
        return new FriendsTags(name, null);
    }
}
