package p000;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: ۦؘؖؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3380 extends InputStream implements DataInput {

    /* JADX INFO: renamed from: ۥَ */
    public final int f11268;

    /* JADX INFO: renamed from: ۥْ */
    public ByteOrder f11269;

    /* JADX INFO: renamed from: ۥٓ */
    public byte[] f11270;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f11271;

    /* JADX INFO: renamed from: ۦۨ */
    public final DataInputStream f11272;

    public C3380(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f11272 = dataInputStream;
        dataInputStream.mark(0);
        this.f11271 = 0;
        this.f11269 = byteOrder;
        this.f11268 = inputStream instanceof C3380 ? ((C3380) inputStream).f11268 : -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f11272.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f11271++;
        return this.f11272.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f11271++;
        return this.f11272.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f11271++;
        int i = this.f11272.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f11271 += 2;
        return this.f11272.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f11271 += bArr.length;
        this.f11272.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f11271 += 4;
        DataInputStream dataInputStream = this.f11272;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f11269;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        C5028.m8452(this.f11269, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f11271 += 8;
        DataInputStream dataInputStream = this.f11272;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f11269;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
        }
        C5028.m8452(this.f11269, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f11271 += 2;
        DataInputStream dataInputStream = this.f11272;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f11269;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        C5028.m8452(this.f11269, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f11271 += 2;
        return this.f11272.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f11271++;
        return this.f11272.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f11271 += 2;
        DataInputStream dataInputStream = this.f11272;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f11269;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i2;
        }
        C5028.m8452(this.f11269, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6146(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f11272;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f11270 == null) {
                    this.f11270 = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f11270, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC5078.m8681(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f11271 += i2;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f11271 += i2;
        this.f11272.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f11272.read(bArr, i, i2);
        this.f11271 += i3;
        return i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3380(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C3380(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f11268 = bArr.length;
    }
}
