package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: ۥؘٟؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2006 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f6619;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f6620;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f6621;

    /* JADX INFO: renamed from: ۦؑ */
    public final byte[] f6622;

    public C2006(long j, byte[] bArr, int i, int i2) {
        this.f6621 = i;
        this.f6620 = i2;
        this.f6619 = j;
        this.f6622 = bArr;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C2006 m3910(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5099.f16908[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C2006(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C2006 m3911(C3167 c3167, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5099.f16908[5]]);
        byteBufferWrap.order(byteOrder);
        C3167 c3168 = new C3167[]{c3167}[0];
        byteBufferWrap.putInt((int) c3168.f10656);
        byteBufferWrap.putInt((int) c3168.f10655);
        return new C2006(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2006 m3912(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5099.f16908[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C2006(byteBufferWrap.array(), 4, 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C5099.f16895[this.f6621]);
        sb.append(", data length:");
        return AbstractC3761.m6630(this.f6622.length, ")", sb);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m3913(ByteOrder byteOrder) throws Throwable {
        Object objM3916 = m3916(byteOrder);
        if (objM3916 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM3916 instanceof String) {
            return Integer.parseInt((String) objM3916);
        }
        if (objM3916 instanceof long[]) {
            long[] jArr = (long[]) objM3916;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM3916 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM3916;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: ۥّ */
    public final String m3914(ByteOrder byteOrder) throws Throwable {
        Object objM3916 = m3916(byteOrder);
        if (objM3916 == null) {
            return null;
        }
        if (objM3916 instanceof String) {
            return (String) objM3916;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM3916 instanceof long[]) {
            long[] jArr = (long[]) objM3916;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM3916 instanceof int[]) {
            int[] iArr = (int[]) objM3916;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM3916 instanceof double[]) {
            double[] dArr = (double[]) objM3916;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM3916 instanceof C3167[])) {
            return null;
        }
        C3167[] c3167Arr = (C3167[]) objM3916;
        while (i < c3167Arr.length) {
            sb.append(c3167Arr[i].f10656);
            sb.append('/');
            sb.append(c3167Arr[i].f10655);
            i++;
            if (i != c3167Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final double m3915(ByteOrder byteOrder) throws Throwable {
        Object objM3916 = m3916(byteOrder);
        if (objM3916 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM3916 instanceof String) {
            return Double.parseDouble((String) objM3916);
        }
        if (objM3916 instanceof long[]) {
            long[] jArr = (long[]) objM3916;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM3916 instanceof int[]) {
            int[] iArr = (int[]) objM3916;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM3916 instanceof double[]) {
            double[] dArr = (double[]) objM3916;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM3916 instanceof C3167[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C3167[] c3167Arr = (C3167[]) objM3916;
        if (c3167Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C3167 c3167 = c3167Arr[0];
        return c3167.f10656 / c3167.f10655;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [ۦؓؓٔۚ[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [ۦؓؓٔۚ[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /* JADX INFO: renamed from: ۦۙ */
    public final Serializable m3916(ByteOrder byteOrder) throws Throwable {
        C3380 c3380;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.f6622;
        InputStream inputStream2 = null;
        try {
            try {
                c3380 = new C3380(bArr);
                try {
                    c3380.f11269 = byteOrder;
                    int i = this.f6621;
                    int length = 0;
                    int i2 = this.f6620;
                    switch (i) {
                        case 1:
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, C5099.f16914);
                                try {
                                    c3380.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                c3380.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (i2 >= C5099.f16898.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = C5099.f16898;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    c3380.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            c3380.close();
                            return str;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c3380.readUnsignedShort();
                                length++;
                            }
                            try {
                                c3380.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) c3380.readInt()) & 4294967295L;
                                length++;
                            }
                            c3380.close();
                            return r13;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            r13 = new C3167[i2];
                            while (length < i2) {
                                r13[length] = new C3167(((long) c3380.readInt()) & 4294967295L, ((long) c3380.readInt()) & 4294967295L);
                                length++;
                            }
                            c3380.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c3380.readShort();
                                length++;
                            }
                            c3380.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = c3380.readInt();
                                length++;
                            }
                            c3380.close();
                            return r13;
                        case 10:
                            r13 = new C3167[i2];
                            while (length < i2) {
                                r13[length] = new C3167(c3380.readInt(), c3380.readInt());
                                length++;
                            }
                            c3380.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c3380.readFloat();
                                length++;
                            }
                            c3380.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = c3380.readDouble();
                                length++;
                            }
                            c3380.close();
                            return r13;
                        default:
                            try {
                                c3380.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c3380 != null) {
                        try {
                            c3380.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                c3380 = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e8) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public C2006(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
