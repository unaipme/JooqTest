/*
 * This file is generated by jOOQ.
*/
package com.unai.jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import com.unai.jooq.generated.Keys;
import com.unai.jooq.generated.Public;
import com.unai.jooq.generated.tables.records.TestRecord;


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
public class Test extends TableImpl<TestRecord> {

    private static final long serialVersionUID = -1786875002;

    /**
     * The reference instance of <code>public.test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestRecord> getRecordType() {
        return TestRecord.class;
    }

    /**
     * The column <code>public.test.id</code>.
     */
    public final TableField<TestRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.test.firstname</code>.
     */
    public final TableField<TestRecord, String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>public.test.lastname</code>.
     */
    public final TableField<TestRecord, String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>public.test</code> table reference
     */
    public Test() {
        this("test", null);
    }

    /**
     * Create an aliased <code>public.test</code> table reference
     */
    public Test(String alias) {
        this(alias, TEST);
    }

    private Test(String alias, Table<TestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Test(String alias, Table<TestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestRecord> getPrimaryKey() {
        return Keys.TEST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestRecord>> getKeys() {
        return Arrays.<UniqueKey<TestRecord>>asList(Keys.TEST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Test as(String alias) {
        return new Test(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(String name) {
        return new Test(name, null);
    }
}
