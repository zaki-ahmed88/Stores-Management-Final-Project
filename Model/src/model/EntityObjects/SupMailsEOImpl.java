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
// ---    Sat Sep 15 13:00:42 EEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SupMailsEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SupMailsId {
            public Object get(SupMailsEOImpl obj) {
                return obj.getSupMailsId();
            }

            public void put(SupMailsEOImpl obj, Object value) {
                obj.setSupMailsId((BigDecimal)value);
            }
        }
        ,
        SupMails {
            public Object get(SupMailsEOImpl obj) {
                return obj.getSupMails();
            }

            public void put(SupMailsEOImpl obj, Object value) {
                obj.setSupMails((String)value);
            }
        }
        ,
        SupId {
            public Object get(SupMailsEOImpl obj) {
                return obj.getSupId();
            }

            public void put(SupMailsEOImpl obj, Object value) {
                obj.setSupId((BigDecimal)value);
            }
        }
        ,
        Sup {
            public Object get(SupMailsEOImpl obj) {
                return obj.getSup();
            }

            public void put(SupMailsEOImpl obj, Object value) {
                obj.setSup((SupEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SupMailsEOImpl object);

        public abstract void put(SupMailsEOImpl object, Object value);

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
    public static final int SUPMAILSID = AttributesEnum.SupMailsId.index();
    public static final int SUPMAILS = AttributesEnum.SupMails.index();
    public static final int SUPID = AttributesEnum.SupId.index();
    public static final int SUP = AttributesEnum.Sup.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SupMailsEOImpl() {
    }

    /**
     * Gets the attribute value for SupMailsId, using the alias name SupMailsId.
     * @return the value of SupMailsId
     */
    public BigDecimal getSupMailsId() {
        return (BigDecimal)getAttributeInternal(SUPMAILSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupMailsId.
     * @param value value to set the SupMailsId
     */
    public void setSupMailsId(BigDecimal value) {
        setAttributeInternal(SUPMAILSID, value);
    }

    /**
     * Gets the attribute value for SupMails, using the alias name SupMails.
     * @return the value of SupMails
     */
    public String getSupMails() {
        return (String)getAttributeInternal(SUPMAILS);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupMails.
     * @param value value to set the SupMails
     */
    public void setSupMails(String value) {
        setAttributeInternal(SUPMAILS, value);
    }

    /**
     * Gets the attribute value for SupId, using the alias name SupId.
     * @return the value of SupId
     */
    public BigDecimal getSupId() {
        return (BigDecimal)getAttributeInternal(SUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupId.
     * @param value value to set the SupId
     */
    public void setSupId(BigDecimal value) {
        setAttributeInternal(SUPID, value);
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
     * @return the associated entity SupEOImpl.
     */
    public SupEOImpl getSup() {
        return (SupEOImpl)getAttributeInternal(SUP);
    }

    /**
     * Sets <code>value</code> as the associated entity SupEOImpl.
     */
    public void setSup(SupEOImpl value) {
        setAttributeInternal(SUP, value);
    }

    /**
     * @param supMailsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal supMailsId) {
        return new Key(new Object[]{supMailsId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EntityObjects.SupMailsEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        DMLOperations dml = new DMLOperations();
        int newId = dml.setNewId(getDBTransaction(), "SUP_MAILS_ID", "SUP_MAILS");
        setSupMailsId(new BigDecimal(newId));
    }
}
