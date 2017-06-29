/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.")

public class V1ISCSIVolumeSource {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("iqn")
  private String iqn = null;

  @SerializedName("iscsiInterface")
  private String iscsiInterface = null;

  @SerializedName("lun")
  private Integer lun = null;

  @SerializedName("portals")
  private List<String> portals = new ArrayList<String>();

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("targetPortal")
  private String targetPortal = null;

  public V1ISCSIVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: http://kubernetes.io/docs/user-guide/volumes#iscsi
   * @return fsType
  **/
  @ApiModelProperty(example = "null", value = "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: http://kubernetes.io/docs/user-guide/volumes#iscsi")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ISCSIVolumeSource iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }

   /**
   * Target iSCSI Qualified Name.
   * @return iqn
  **/
  @ApiModelProperty(example = "null", required = true, value = "Target iSCSI Qualified Name.")
  public String getIqn() {
    return iqn;
  }

  public void setIqn(String iqn) {
    this.iqn = iqn;
  }

  public V1ISCSIVolumeSource iscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return this;
  }

   /**
   * Optional: Defaults to 'default' (tcp). iSCSI interface name that uses an iSCSI transport.
   * @return iscsiInterface
  **/
  @ApiModelProperty(example = "null", value = "Optional: Defaults to 'default' (tcp). iSCSI interface name that uses an iSCSI transport.")
  public String getIscsiInterface() {
    return iscsiInterface;
  }

  public void setIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
  }

  public V1ISCSIVolumeSource lun(Integer lun) {
    this.lun = lun;
    return this;
  }

   /**
   * iSCSI target lun number.
   * @return lun
  **/
  @ApiModelProperty(example = "null", required = true, value = "iSCSI target lun number.")
  public Integer getLun() {
    return lun;
  }

  public void setLun(Integer lun) {
    this.lun = lun;
  }

  public V1ISCSIVolumeSource portals(List<String> portals) {
    this.portals = portals;
    return this;
  }

  public V1ISCSIVolumeSource addPortalsItem(String portalsItem) {
    this.portals.add(portalsItem);
    return this;
  }

   /**
   * iSCSI target portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return portals
  **/
  @ApiModelProperty(example = "null", value = "iSCSI target portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
  public List<String> getPortals() {
    return portals;
  }

  public void setPortals(List<String> portals) {
    this.portals = portals;
  }

  public V1ISCSIVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   * @return readOnly
  **/
  @ApiModelProperty(example = "null", value = "ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ISCSIVolumeSource targetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
    return this;
  }

   /**
   * iSCSI target portal. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return targetPortal
  **/
  @ApiModelProperty(example = "null", required = true, value = "iSCSI target portal. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
  public String getTargetPortal() {
    return targetPortal;
  }

  public void setTargetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ISCSIVolumeSource v1ISCSIVolumeSource = (V1ISCSIVolumeSource) o;
    return Objects.equals(this.fsType, v1ISCSIVolumeSource.fsType) &&
        Objects.equals(this.iqn, v1ISCSIVolumeSource.iqn) &&
        Objects.equals(this.iscsiInterface, v1ISCSIVolumeSource.iscsiInterface) &&
        Objects.equals(this.lun, v1ISCSIVolumeSource.lun) &&
        Objects.equals(this.portals, v1ISCSIVolumeSource.portals) &&
        Objects.equals(this.readOnly, v1ISCSIVolumeSource.readOnly) &&
        Objects.equals(this.targetPortal, v1ISCSIVolumeSource.targetPortal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, iqn, iscsiInterface, lun, portals, readOnly, targetPortal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ISCSIVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    iscsiInterface: ").append(toIndentedString(iscsiInterface)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    targetPortal: ").append(toIndentedString(targetPortal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

