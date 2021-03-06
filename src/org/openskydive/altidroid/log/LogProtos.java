// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/org/openskydive/altidroid/log/log.proto

package org.openskydive.altidroid.log;

public final class LogProtos {
  private LogProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface EntryOrBuilder
      extends com.google.protobuf.MessageLiteOrBuilder {
    
    // optional int32 id = 1;
    boolean hasId();
    int getId();
    
    // optional int32 number = 2;
    boolean hasNumber();
    int getNumber();
    
    // optional int64 timestamp = 3;
    boolean hasTimestamp();
    long getTimestamp();
    
    // optional int32 exit_altitude = 4;
    boolean hasExitAltitude();
    int getExitAltitude();
    
    // optional int32 deploy_altitude = 5;
    boolean hasDeployAltitude();
    int getDeployAltitude();
    
    // optional int32 freefall_time = 6;
    boolean hasFreefallTime();
    int getFreefallTime();
    
    // optional string comments = 7;
    boolean hasComments();
    String getComments();
    
    // optional string dropzone = 8;
    boolean hasDropzone();
    String getDropzone();
    
    // optional string aircraft = 9;
    boolean hasAircraft();
    String getAircraft();
    
    // optional string jump_type = 10;
    boolean hasJumpType();
    String getJumpType();
    
    // optional string equipment = 11;
    boolean hasEquipment();
    String getEquipment();
  }
  public static final class Entry extends
      com.google.protobuf.GeneratedMessageLite
      implements EntryOrBuilder {
    // Use Entry.newBuilder() to construct.
    private Entry(Builder builder) {
      super(builder);
    }
    private Entry(boolean noInit) {}
    
    private static final Entry defaultInstance;
    public static Entry getDefaultInstance() {
      return defaultInstance;
    }
    
    public Entry getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    private int bitField0_;
    // optional int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getId() {
      return id_;
    }
    
    // optional int32 number = 2;
    public static final int NUMBER_FIELD_NUMBER = 2;
    private int number_;
    public boolean hasNumber() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getNumber() {
      return number_;
    }
    
    // optional int64 timestamp = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long timestamp_;
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getTimestamp() {
      return timestamp_;
    }
    
    // optional int32 exit_altitude = 4;
    public static final int EXIT_ALTITUDE_FIELD_NUMBER = 4;
    private int exitAltitude_;
    public boolean hasExitAltitude() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getExitAltitude() {
      return exitAltitude_;
    }
    
    // optional int32 deploy_altitude = 5;
    public static final int DEPLOY_ALTITUDE_FIELD_NUMBER = 5;
    private int deployAltitude_;
    public boolean hasDeployAltitude() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getDeployAltitude() {
      return deployAltitude_;
    }
    
    // optional int32 freefall_time = 6;
    public static final int FREEFALL_TIME_FIELD_NUMBER = 6;
    private int freefallTime_;
    public boolean hasFreefallTime() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getFreefallTime() {
      return freefallTime_;
    }
    
    // optional string comments = 7;
    public static final int COMMENTS_FIELD_NUMBER = 7;
    private java.lang.Object comments_;
    public boolean hasComments() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getComments() {
      java.lang.Object ref = comments_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          comments_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCommentsBytes() {
      java.lang.Object ref = comments_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        comments_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string dropzone = 8;
    public static final int DROPZONE_FIELD_NUMBER = 8;
    private java.lang.Object dropzone_;
    public boolean hasDropzone() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public String getDropzone() {
      java.lang.Object ref = dropzone_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          dropzone_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDropzoneBytes() {
      java.lang.Object ref = dropzone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        dropzone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string aircraft = 9;
    public static final int AIRCRAFT_FIELD_NUMBER = 9;
    private java.lang.Object aircraft_;
    public boolean hasAircraft() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public String getAircraft() {
      java.lang.Object ref = aircraft_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          aircraft_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAircraftBytes() {
      java.lang.Object ref = aircraft_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        aircraft_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string jump_type = 10;
    public static final int JUMP_TYPE_FIELD_NUMBER = 10;
    private java.lang.Object jumpType_;
    public boolean hasJumpType() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public String getJumpType() {
      java.lang.Object ref = jumpType_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          jumpType_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getJumpTypeBytes() {
      java.lang.Object ref = jumpType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        jumpType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string equipment = 11;
    public static final int EQUIPMENT_FIELD_NUMBER = 11;
    private java.lang.Object equipment_;
    public boolean hasEquipment() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    public String getEquipment() {
      java.lang.Object ref = equipment_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          equipment_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getEquipmentBytes() {
      java.lang.Object ref = equipment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        equipment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      id_ = 0;
      number_ = 0;
      timestamp_ = 0L;
      exitAltitude_ = 0;
      deployAltitude_ = 0;
      freefallTime_ = 0;
      comments_ = "";
      dropzone_ = "";
      aircraft_ = "";
      jumpType_ = "";
      equipment_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, number_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, timestamp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, exitAltitude_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, deployAltitude_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, freefallTime_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getCommentsBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(8, getDropzoneBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(9, getAircraftBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBytes(10, getJumpTypeBytes());
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeBytes(11, getEquipmentBytes());
      }
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, number_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, timestamp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, exitAltitude_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, deployAltitude_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, freefallTime_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getCommentsBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, getDropzoneBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(9, getAircraftBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(10, getJumpTypeBytes());
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(11, getEquipmentBytes());
      }
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.openskydive.altidroid.log.LogProtos.Entry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.openskydive.altidroid.log.LogProtos.Entry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.openskydive.altidroid.log.LogProtos.Entry prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.openskydive.altidroid.log.LogProtos.Entry, Builder>
        implements org.openskydive.altidroid.log.LogProtos.EntryOrBuilder {
      // Construct using org.openskydive.altidroid.log.LogProtos.Entry.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        number_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        exitAltitude_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        deployAltitude_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        freefallTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        comments_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        dropzone_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        aircraft_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        jumpType_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        equipment_ = "";
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public org.openskydive.altidroid.log.LogProtos.Entry getDefaultInstanceForType() {
        return org.openskydive.altidroid.log.LogProtos.Entry.getDefaultInstance();
      }
      
      public org.openskydive.altidroid.log.LogProtos.Entry build() {
        org.openskydive.altidroid.log.LogProtos.Entry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.openskydive.altidroid.log.LogProtos.Entry buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.openskydive.altidroid.log.LogProtos.Entry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.openskydive.altidroid.log.LogProtos.Entry buildPartial() {
        org.openskydive.altidroid.log.LogProtos.Entry result = new org.openskydive.altidroid.log.LogProtos.Entry(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.number_ = number_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.exitAltitude_ = exitAltitude_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.deployAltitude_ = deployAltitude_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.freefallTime_ = freefallTime_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.comments_ = comments_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.dropzone_ = dropzone_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.aircraft_ = aircraft_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.jumpType_ = jumpType_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.equipment_ = equipment_;
        result.bitField0_ = to_bitField0_;
        return result;
      }
      
      public Builder mergeFrom(org.openskydive.altidroid.log.LogProtos.Entry other) {
        if (other == org.openskydive.altidroid.log.LogProtos.Entry.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasNumber()) {
          setNumber(other.getNumber());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasExitAltitude()) {
          setExitAltitude(other.getExitAltitude());
        }
        if (other.hasDeployAltitude()) {
          setDeployAltitude(other.getDeployAltitude());
        }
        if (other.hasFreefallTime()) {
          setFreefallTime(other.getFreefallTime());
        }
        if (other.hasComments()) {
          setComments(other.getComments());
        }
        if (other.hasDropzone()) {
          setDropzone(other.getDropzone());
        }
        if (other.hasAircraft()) {
          setAircraft(other.getAircraft());
        }
        if (other.hasJumpType()) {
          setJumpType(other.getJumpType());
        }
        if (other.hasEquipment()) {
          setEquipment(other.getEquipment());
        }
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              
              return this;
            default: {
              if (!parseUnknownField(input, extensionRegistry, tag)) {
                
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              number_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              timestamp_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              exitAltitude_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              deployAltitude_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              freefallTime_ = input.readInt32();
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              comments_ = input.readBytes();
              break;
            }
            case 66: {
              bitField0_ |= 0x00000080;
              dropzone_ = input.readBytes();
              break;
            }
            case 74: {
              bitField0_ |= 0x00000100;
              aircraft_ = input.readBytes();
              break;
            }
            case 82: {
              bitField0_ |= 0x00000200;
              jumpType_ = input.readBytes();
              break;
            }
            case 90: {
              bitField0_ |= 0x00000400;
              equipment_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 id = 1;
      private int id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getId() {
        return id_;
      }
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        
        return this;
      }
      
      // optional int32 number = 2;
      private int number_ ;
      public boolean hasNumber() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getNumber() {
        return number_;
      }
      public Builder setNumber(int value) {
        bitField0_ |= 0x00000002;
        number_ = value;
        
        return this;
      }
      public Builder clearNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        number_ = 0;
        
        return this;
      }
      
      // optional int64 timestamp = 3;
      private long timestamp_ ;
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getTimestamp() {
        return timestamp_;
      }
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000004;
        timestamp_ = value;
        
        return this;
      }
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        timestamp_ = 0L;
        
        return this;
      }
      
      // optional int32 exit_altitude = 4;
      private int exitAltitude_ ;
      public boolean hasExitAltitude() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getExitAltitude() {
        return exitAltitude_;
      }
      public Builder setExitAltitude(int value) {
        bitField0_ |= 0x00000008;
        exitAltitude_ = value;
        
        return this;
      }
      public Builder clearExitAltitude() {
        bitField0_ = (bitField0_ & ~0x00000008);
        exitAltitude_ = 0;
        
        return this;
      }
      
      // optional int32 deploy_altitude = 5;
      private int deployAltitude_ ;
      public boolean hasDeployAltitude() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getDeployAltitude() {
        return deployAltitude_;
      }
      public Builder setDeployAltitude(int value) {
        bitField0_ |= 0x00000010;
        deployAltitude_ = value;
        
        return this;
      }
      public Builder clearDeployAltitude() {
        bitField0_ = (bitField0_ & ~0x00000010);
        deployAltitude_ = 0;
        
        return this;
      }
      
      // optional int32 freefall_time = 6;
      private int freefallTime_ ;
      public boolean hasFreefallTime() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getFreefallTime() {
        return freefallTime_;
      }
      public Builder setFreefallTime(int value) {
        bitField0_ |= 0x00000020;
        freefallTime_ = value;
        
        return this;
      }
      public Builder clearFreefallTime() {
        bitField0_ = (bitField0_ & ~0x00000020);
        freefallTime_ = 0;
        
        return this;
      }
      
      // optional string comments = 7;
      private java.lang.Object comments_ = "";
      public boolean hasComments() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getComments() {
        java.lang.Object ref = comments_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          comments_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setComments(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        comments_ = value;
        
        return this;
      }
      public Builder clearComments() {
        bitField0_ = (bitField0_ & ~0x00000040);
        comments_ = getDefaultInstance().getComments();
        
        return this;
      }
      void setComments(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        comments_ = value;
        
      }
      
      // optional string dropzone = 8;
      private java.lang.Object dropzone_ = "";
      public boolean hasDropzone() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public String getDropzone() {
        java.lang.Object ref = dropzone_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          dropzone_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDropzone(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        dropzone_ = value;
        
        return this;
      }
      public Builder clearDropzone() {
        bitField0_ = (bitField0_ & ~0x00000080);
        dropzone_ = getDefaultInstance().getDropzone();
        
        return this;
      }
      void setDropzone(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000080;
        dropzone_ = value;
        
      }
      
      // optional string aircraft = 9;
      private java.lang.Object aircraft_ = "";
      public boolean hasAircraft() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public String getAircraft() {
        java.lang.Object ref = aircraft_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          aircraft_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAircraft(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        aircraft_ = value;
        
        return this;
      }
      public Builder clearAircraft() {
        bitField0_ = (bitField0_ & ~0x00000100);
        aircraft_ = getDefaultInstance().getAircraft();
        
        return this;
      }
      void setAircraft(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000100;
        aircraft_ = value;
        
      }
      
      // optional string jump_type = 10;
      private java.lang.Object jumpType_ = "";
      public boolean hasJumpType() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public String getJumpType() {
        java.lang.Object ref = jumpType_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          jumpType_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setJumpType(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        jumpType_ = value;
        
        return this;
      }
      public Builder clearJumpType() {
        bitField0_ = (bitField0_ & ~0x00000200);
        jumpType_ = getDefaultInstance().getJumpType();
        
        return this;
      }
      void setJumpType(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000200;
        jumpType_ = value;
        
      }
      
      // optional string equipment = 11;
      private java.lang.Object equipment_ = "";
      public boolean hasEquipment() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      public String getEquipment() {
        java.lang.Object ref = equipment_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          equipment_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setEquipment(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000400;
        equipment_ = value;
        
        return this;
      }
      public Builder clearEquipment() {
        bitField0_ = (bitField0_ & ~0x00000400);
        equipment_ = getDefaultInstance().getEquipment();
        
        return this;
      }
      void setEquipment(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000400;
        equipment_ = value;
        
      }
      
      // @@protoc_insertion_point(builder_scope:org.openskydive.altidroid.log.Entry)
    }
    
    static {
      defaultInstance = new Entry(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.openskydive.altidroid.log.Entry)
  }
  
  
  static {
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
