package vc.xji.empty.entity;

import java.io.Serializable;

public class Permissions implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissions.permissions_id
     *
     * @mbggenerated
     */
    private Integer permissionsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissions.permissions_value
     *
     * @mbggenerated
     */
    private String permissionsValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissions.permissions_desc
     *
     * @mbggenerated
     */
    private String permissionsDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permissions
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissions.permissions_id
     *
     * @return the value of permissions.permissions_id
     *
     * @mbggenerated
     */
    public Integer getPermissionsId() {
        return permissionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permissions.permissions_id
     *
     * @param permissionsId the value for permissions.permissions_id
     *
     * @mbggenerated
     */
    public void setPermissionsId(Integer permissionsId) {
        this.permissionsId = permissionsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissions.permissions_value
     *
     * @return the value of permissions.permissions_value
     *
     * @mbggenerated
     */
    public String getPermissionsValue() {
        return permissionsValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permissions.permissions_value
     *
     * @param permissionsValue the value for permissions.permissions_value
     *
     * @mbggenerated
     */
    public void setPermissionsValue(String permissionsValue) {
        this.permissionsValue = permissionsValue == null ? null : permissionsValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissions.permissions_desc
     *
     * @return the value of permissions.permissions_desc
     *
     * @mbggenerated
     */
    public String getPermissionsDesc() {
        return permissionsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permissions.permissions_desc
     *
     * @param permissionsDesc the value for permissions.permissions_desc
     *
     * @mbggenerated
     */
    public void setPermissionsDesc(String permissionsDesc) {
        this.permissionsDesc = permissionsDesc == null ? null : permissionsDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Permissions other = (Permissions) that;
        return (this.getPermissionsId() == null ? other.getPermissionsId() == null : this.getPermissionsId().equals(other.getPermissionsId()))
            && (this.getPermissionsValue() == null ? other.getPermissionsValue() == null : this.getPermissionsValue().equals(other.getPermissionsValue()))
            && (this.getPermissionsDesc() == null ? other.getPermissionsDesc() == null : this.getPermissionsDesc().equals(other.getPermissionsDesc()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPermissionsId() == null) ? 0 : getPermissionsId().hashCode());
        result = prime * result + ((getPermissionsValue() == null) ? 0 : getPermissionsValue().hashCode());
        result = prime * result + ((getPermissionsDesc() == null) ? 0 : getPermissionsDesc().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", permissionsId=").append(permissionsId);
        sb.append(", permissionsValue=").append(permissionsValue);
        sb.append(", permissionsDesc=").append(permissionsDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}