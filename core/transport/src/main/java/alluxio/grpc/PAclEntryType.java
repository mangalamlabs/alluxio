// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_system_master.proto

package alluxio.grpc;

/**
 * Protobuf enum {@code alluxio.grpc.PAclEntryType}
 */
public enum PAclEntryType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Owner = 0;</code>
   */
  Owner(0),
  /**
   * <code>NamedUser = 1;</code>
   */
  NamedUser(1),
  /**
   * <code>OwningGroup = 2;</code>
   */
  OwningGroup(2),
  /**
   * <code>NamedGroup = 3;</code>
   */
  NamedGroup(3),
  /**
   * <code>Mask = 4;</code>
   */
  Mask(4),
  /**
   * <code>Other = 5;</code>
   */
  Other(5),
  ;

  /**
   * <code>Owner = 0;</code>
   */
  public static final int Owner_VALUE = 0;
  /**
   * <code>NamedUser = 1;</code>
   */
  public static final int NamedUser_VALUE = 1;
  /**
   * <code>OwningGroup = 2;</code>
   */
  public static final int OwningGroup_VALUE = 2;
  /**
   * <code>NamedGroup = 3;</code>
   */
  public static final int NamedGroup_VALUE = 3;
  /**
   * <code>Mask = 4;</code>
   */
  public static final int Mask_VALUE = 4;
  /**
   * <code>Other = 5;</code>
   */
  public static final int Other_VALUE = 5;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PAclEntryType valueOf(int value) {
    return forNumber(value);
  }

  public static PAclEntryType forNumber(int value) {
    switch (value) {
      case 0: return Owner;
      case 1: return NamedUser;
      case 2: return OwningGroup;
      case 3: return NamedGroup;
      case 4: return Mask;
      case 5: return Other;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PAclEntryType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PAclEntryType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PAclEntryType>() {
          public PAclEntryType findValueByNumber(int number) {
            return PAclEntryType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return alluxio.grpc.FileSystemMasterProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final PAclEntryType[] VALUES = values();

  public static PAclEntryType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PAclEntryType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:alluxio.grpc.PAclEntryType)
}

