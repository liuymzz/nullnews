package com.nullnews.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeIsNull() {
            addCriterion("user_secure_code is null");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeIsNotNull() {
            addCriterion("user_secure_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeEqualTo(String value) {
            addCriterion("user_secure_code =", value, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeNotEqualTo(String value) {
            addCriterion("user_secure_code <>", value, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeGreaterThan(String value) {
            addCriterion("user_secure_code >", value, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_secure_code >=", value, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeLessThan(String value) {
            addCriterion("user_secure_code <", value, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeLessThanOrEqualTo(String value) {
            addCriterion("user_secure_code <=", value, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeLike(String value) {
            addCriterion("user_secure_code like", value, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeNotLike(String value) {
            addCriterion("user_secure_code not like", value, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeIn(List<String> values) {
            addCriterion("user_secure_code in", values, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeNotIn(List<String> values) {
            addCriterion("user_secure_code not in", values, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeBetween(String value1, String value2) {
            addCriterion("user_secure_code between", value1, value2, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserSecureCodeNotBetween(String value1, String value2) {
            addCriterion("user_secure_code not between", value1, value2, "userSecureCode");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Integer value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Integer value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Integer value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Integer value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Integer value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Integer> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Integer> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Integer value1, Integer value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserUriIsNull() {
            addCriterion("user_uri is null");
            return (Criteria) this;
        }

        public Criteria andUserUriIsNotNull() {
            addCriterion("user_uri is not null");
            return (Criteria) this;
        }

        public Criteria andUserUriEqualTo(String value) {
            addCriterion("user_uri =", value, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriNotEqualTo(String value) {
            addCriterion("user_uri <>", value, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriGreaterThan(String value) {
            addCriterion("user_uri >", value, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriGreaterThanOrEqualTo(String value) {
            addCriterion("user_uri >=", value, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriLessThan(String value) {
            addCriterion("user_uri <", value, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriLessThanOrEqualTo(String value) {
            addCriterion("user_uri <=", value, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriLike(String value) {
            addCriterion("user_uri like", value, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriNotLike(String value) {
            addCriterion("user_uri not like", value, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriIn(List<String> values) {
            addCriterion("user_uri in", values, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriNotIn(List<String> values) {
            addCriterion("user_uri not in", values, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriBetween(String value1, String value2) {
            addCriterion("user_uri between", value1, value2, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserUriNotBetween(String value1, String value2) {
            addCriterion("user_uri not between", value1, value2, "userUri");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeIsNull() {
            addCriterion("user_addtime is null");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeIsNotNull() {
            addCriterion("user_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeEqualTo(Date value) {
            addCriterion("user_addtime =", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeNotEqualTo(Date value) {
            addCriterion("user_addtime <>", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeGreaterThan(Date value) {
            addCriterion("user_addtime >", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_addtime >=", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeLessThan(Date value) {
            addCriterion("user_addtime <", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("user_addtime <=", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeIn(List<Date> values) {
            addCriterion("user_addtime in", values, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeNotIn(List<Date> values) {
            addCriterion("user_addtime not in", values, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeBetween(Date value1, Date value2) {
            addCriterion("user_addtime between", value1, value2, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("user_addtime not between", value1, value2, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Integer value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Integer value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Integer value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Integer value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Integer value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Integer> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Integer> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Integer value1, Integer value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserBriefIsNull() {
            addCriterion("user_brief is null");
            return (Criteria) this;
        }

        public Criteria andUserBriefIsNotNull() {
            addCriterion("user_brief is not null");
            return (Criteria) this;
        }

        public Criteria andUserBriefEqualTo(String value) {
            addCriterion("user_brief =", value, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefNotEqualTo(String value) {
            addCriterion("user_brief <>", value, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefGreaterThan(String value) {
            addCriterion("user_brief >", value, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefGreaterThanOrEqualTo(String value) {
            addCriterion("user_brief >=", value, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefLessThan(String value) {
            addCriterion("user_brief <", value, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefLessThanOrEqualTo(String value) {
            addCriterion("user_brief <=", value, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefLike(String value) {
            addCriterion("user_brief like", value, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefNotLike(String value) {
            addCriterion("user_brief not like", value, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefIn(List<String> values) {
            addCriterion("user_brief in", values, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefNotIn(List<String> values) {
            addCriterion("user_brief not in", values, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefBetween(String value1, String value2) {
            addCriterion("user_brief between", value1, value2, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserBriefNotBetween(String value1, String value2) {
            addCriterion("user_brief not between", value1, value2, "userBrief");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumIsNull() {
            addCriterion("user_passage_num is null");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumIsNotNull() {
            addCriterion("user_passage_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumEqualTo(Integer value) {
            addCriterion("user_passage_num =", value, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumNotEqualTo(Integer value) {
            addCriterion("user_passage_num <>", value, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumGreaterThan(Integer value) {
            addCriterion("user_passage_num >", value, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_passage_num >=", value, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumLessThan(Integer value) {
            addCriterion("user_passage_num <", value, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumLessThanOrEqualTo(Integer value) {
            addCriterion("user_passage_num <=", value, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumIn(List<Integer> values) {
            addCriterion("user_passage_num in", values, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumNotIn(List<Integer> values) {
            addCriterion("user_passage_num not in", values, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumBetween(Integer value1, Integer value2) {
            addCriterion("user_passage_num between", value1, value2, "userPassageNum");
            return (Criteria) this;
        }

        public Criteria andUserPassageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_passage_num not between", value1, value2, "userPassageNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}