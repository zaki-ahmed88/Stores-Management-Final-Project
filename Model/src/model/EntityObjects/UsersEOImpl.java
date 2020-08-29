package model.EntityObjects;

import java.math.BigDecimal;

import model.DMLOperations;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 15 13:04:20 EEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UsersEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        UserId {
            public Object get(UsersEOImpl obj) {
                return obj.getUserId();
            }

            public void put(UsersEOImpl obj, Object value) {
                obj.setUserId((BigDecimal)value);
            }
        }
        ,
        FirstName {
            public Object get(UsersEOImpl obj) {
                return obj.getFirstName();
            }

            public void put(UsersEOImpl obj, Object value) {
                obj.setFirstName((String)value);
            }
        }
        ,
        LastName {
            public Object get(UsersEOImpl obj) {
                return obj.getLastName();
            }

            public void put(UsersEOImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        Email {
            public Object get(UsersEOImpl obj) {
                return obj.getEmail();
            }

            public void put(UsersEOImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        Password {
            public Object get(UsersEOImpl obj) {
                return obj.getPassword();
            }

            public void put(UsersEOImpl obj, Object value) {
                obj.setPassword((String)value);
            }
        }
        ,
        UserRole {
            public Object get(UsersEOImpl obj) {
                return obj.getUserRole();
            }

            public void put(UsersEOImpl obj, Object value) {
                obj.setUserRole((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(UsersEOImpl object);

        public abstract void put(UsersEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PASSWORD = AttributesEnum.Password.index();
    public static final int USERROLE = AttributesEnum.UserRole.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UsersEOImpl() {
    }

    /**
     * Gets the attribute value for UserId, using the alias name UserId.
     * @return the value of UserId
     */
    public BigDecimal getUserId() {
        return (BigDecimal)getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserId.
     * @param value value to set the UserId
     */
    public void setUserId(BigDecimal value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String)getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String)getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String)getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for Password, using the alias name Password.
     * @return the value of Password
     */
    public String getPassword() {
        return (String)getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Password.
     * @param value value to set the Password
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
    }

    /**
     * Gets the attribute value for UserRole, using the alias name UserRole.
     * @return the value of UserRole
     */
    public String getUserRole() {
        return (String)getAttributeInternal(USERROLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserRole.
     * @param value value to set the UserRole
     */
    public void setUserRole(String value) {
        setAttributeInternal(USERROLE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @param userId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal userId) {
        return new Key(new Object[]{userId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EntityObjects.UsersEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        DMLOperations dml = new DMLOperations();
        int newId = dml.setNewId(getDBTransaction(), "USER_ID", "USERS");
        setUserId(new BigDecimal(newId));
    }
}
