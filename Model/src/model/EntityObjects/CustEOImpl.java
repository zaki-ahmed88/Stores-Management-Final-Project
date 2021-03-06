package model.EntityObjects;

import java.math.BigDecimal;

import model.DMLOperations;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 15 12:21:02 EEST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustEOImpl extends EntityImpl {
    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CustId {
            public Object get(CustEOImpl obj) {
                return obj.getCustId();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setCustId((BigDecimal)value);
            }
        }
        ,
        CustName {
            public Object get(CustEOImpl obj) {
                return obj.getCustName();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setCustName((String)value);
            }
        }
        ,
        ContactPesonName {
            public Object get(CustEOImpl obj) {
                return obj.getContactPesonName();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setContactPesonName((String)value);
            }
        }
        ,
        Balance {
            public Object get(CustEOImpl obj) {
                return obj.getBalance();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setBalance((BigDecimal)value);
            }
        }
        ,
        CustInvoices {
            public Object get(CustEOImpl obj) {
                return obj.getCustInvoices();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustMails {
            public Object get(CustEOImpl obj) {
                return obj.getCustMails();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustPayments {
            public Object get(CustEOImpl obj) {
                return obj.getCustPayments();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustPhones {
            public Object get(CustEOImpl obj) {
                return obj.getCustPhones();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustProd {
            public Object get(CustEOImpl obj) {
                return obj.getCustProd();
            }

            public void put(CustEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(CustEOImpl object);

        public abstract void put(CustEOImpl object, Object value);

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

    public static final int CUSTID = AttributesEnum.CustId.index();
    public static final int CUSTNAME = AttributesEnum.CustName.index();
    public static final int CONTACTPESONNAME = AttributesEnum.ContactPesonName.index();
    public static final int BALANCE = AttributesEnum.Balance.index();
    public static final int CUSTINVOICES = AttributesEnum.CustInvoices.index();
    public static final int CUSTMAILS = AttributesEnum.CustMails.index();
    public static final int CUSTPAYMENTS = AttributesEnum.CustPayments.index();
    public static final int CUSTPHONES = AttributesEnum.CustPhones.index();
    public static final int CUSTPROD = AttributesEnum.CustProd.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CustEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EntityObjects.CustEO");
    }

    /**
     * Gets the attribute value for CustId, using the alias name CustId.
     * @return the value of CustId
     */
    public BigDecimal getCustId() {
        return (BigDecimal)getAttributeInternal(CUSTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustId.
     * @param value value to set the CustId
     */
    public void setCustId(BigDecimal value) {
        setAttributeInternal(CUSTID, value);
    }

    /**
     * Gets the attribute value for CustName, using the alias name CustName.
     * @return the value of CustName
     */
    public String getCustName() {
        return (String)getAttributeInternal(CUSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustName.
     * @param value value to set the CustName
     */
    public void setCustName(String value) {
        setAttributeInternal(CUSTNAME, value);
    }

    /**
     * Gets the attribute value for ContactPesonName, using the alias name ContactPesonName.
     * @return the value of ContactPesonName
     */
    public String getContactPesonName() {
        return (String)getAttributeInternal(CONTACTPESONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPesonName.
     * @param value value to set the ContactPesonName
     */
    public void setContactPesonName(String value) {
        setAttributeInternal(CONTACTPESONNAME, value);
    }

    /**
     * Gets the attribute value for Balance, using the alias name Balance.
     * @return the value of Balance
     */
    public BigDecimal getBalance() {
        return (BigDecimal)getAttributeInternal(BALANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Balance.
     * @param value value to set the Balance
     */
    public void setBalance(BigDecimal value) {
        setAttributeInternal(BALANCE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCustInvoices() {
        return (RowIterator)getAttributeInternal(CUSTINVOICES);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCustMails() {
        return (RowIterator)getAttributeInternal(CUSTMAILS);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCustPayments() {
        return (RowIterator)getAttributeInternal(CUSTPAYMENTS);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCustPhones() {
        return (RowIterator)getAttributeInternal(CUSTPHONES);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getCustProd() {
        return (RowIterator)getAttributeInternal(CUSTPROD);
    }

    /**
     * @param custId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal custId) {
        return new Key(new Object[]{custId});
    }
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        DMLOperations dml = new DMLOperations();
        int newId = dml.setNewId(getDBTransaction(), "CUST_ID", "CUST");
        setCustId(new BigDecimal(newId));
        
    }


}
