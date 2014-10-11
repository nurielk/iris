package mote.sending;
/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'ReadFlash'
 * message type.
 */

public class ReadFlash extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 1;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 60;

    /** Create a new ReadFlash of size 1. */
    public ReadFlash() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new ReadFlash of the given data_length. */
    public ReadFlash(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ReadFlash with the given data_length
     * and base offset.
     */
    public ReadFlash(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ReadFlash using the given byte array
     * as backing store.
     */
    public ReadFlash(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ReadFlash using the given byte array
     * as backing store, with the given base offset.
     */
    public ReadFlash(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ReadFlash using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public ReadFlash(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ReadFlash embedded in the given message
     * at the given base offset.
     */
    public ReadFlash(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new ReadFlash embedded in the given message
     * at the given base offset and length.
     */
    public ReadFlash(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <ReadFlash> \n";
      try {
        s += "  [instruction=0x"+Long.toHexString(get_instruction())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: instruction
    //   Field type: byte, signed
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'instruction' is signed (true).
     */
    public static boolean isSigned_instruction() {
        return true;
    }

    /**
     * Return whether the field 'instruction' is an array (false).
     */
    public static boolean isArray_instruction() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'instruction'
     */
    public static int offset_instruction() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'instruction'
     */
    public static int offsetBits_instruction() {
        return 0;
    }

    /**
     * Return the value (as a byte) of the field 'instruction'
     */
    public byte get_instruction() {
        return (byte)getSIntBEElement(offsetBits_instruction(), 8);
    }

    /**
     * Set the value of the field 'instruction'
     */
    public void set_instruction(byte value) {
        setSIntBEElement(offsetBits_instruction(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'instruction'
     */
    public static int size_instruction() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'instruction'
     */
    public static int sizeBits_instruction() {
        return 8;
    }

}